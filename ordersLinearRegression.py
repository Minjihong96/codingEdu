import cx_Oracle as oci
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error, r2_score
import numpy as np

# 1. Oracle 연결 및 데이터 가져오기
con = oci.connect("TWO/2222@61.252.30.155:1521/xe")
cursor = con.cursor()
cursor.execute("SELECT ORDER_DATE FROM ORDERS")
rows = cursor.fetchall()
cursor.close()
con.close()

# 2. DataFrame 생성 및 월별 집계
df = pd.DataFrame(rows, columns=["ORDER_DATE"])
df["ORDER_DATE"] = pd.to_datetime(df["ORDER_DATE"])
df["YEAR_MONTH"] = df["ORDER_DATE"].dt.to_period("M").astype(str)

monthly_orders = df.groupby("YEAR_MONTH").size().reset_index(name="ORDER_COUNT")
monthly_orders["MONTH_IDX"] = range(len(monthly_orders))

# 3. 학습 데이터 준비
X = monthly_orders[["MONTH_IDX"]]  # 입력값 (시간 순서 인덱스)
y = monthly_orders["ORDER_COUNT"]  # 출력값 (주문량)

# 4. Linear Regression 모델 학습
model = LinearRegression()
model.fit(X, y)

# 5. 기존 데이터에 대한 예측
y_pred = model.predict(X)

# 6. 성능 평가 지표 출력
mse = mean_squared_error(y, y_pred)
rmse = np.sqrt(mse)
r2 = r2_score(y, y_pred)

print("📊 모델 성능 평가 지표:")
print(f"   - MSE  : {mse:.2f}")
print(f"   - RMSE : {rmse:.2f}")
print(f"   - R²   : {r2:.4f} (1에 가까울수록 정확)")

# 7. 미래 데이터 예측
future_months = 12
last_idx = monthly_orders["MONTH_IDX"].iloc[-1]
future_idx = np.arange(last_idx + 1, last_idx + 1 + future_months).reshape(-1, 1)
future_preds = model.predict(future_idx)

future_dates = pd.date_range(start=pd.to_datetime(monthly_orders["YEAR_MONTH"].iloc[-1]) + pd.offsets.MonthBegin(1),
                             periods=future_months, freq='MS').strftime("%Y-%m")

future_df = pd.DataFrame({
    "YEAR_MONTH": future_dates,
    "ORDER_COUNT": future_preds.astype(int)
})

# 8. 과거 + 미래 결과 결합
combined_df = pd.concat([monthly_orders[["YEAR_MONTH", "ORDER_COUNT"]], future_df])

# 9. 시각화
plt.figure(figsize=(12, 6))
plt.plot(combined_df["YEAR_MONTH"], combined_df["ORDER_COUNT"], marker='o', label="실제/예측 주문 수")
plt.axvline(x=monthly_orders["YEAR_MONTH"].iloc[-1], color='red', linestyle='--', label="예측 시작점")
plt.xticks(rotation=45)
plt.xlabel("월")
plt.ylabel("주문 수량")
plt.title("📈 월별 주문 수량 및 선형 회귀 예측 결과")
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()
plt.savefig('ordersLinearRegression.png')
