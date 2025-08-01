package web.com.springweb.project.p04_vo;

import java.util.Date;

public class Withdrawal {
	private int withdrawalId;
	private int memId;
	private String memName;
	private String reason;
	private Date withdrawalDate;
	public Withdrawal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Withdrawal(String memName, String reason) {
		super();
		this.memName = memName;
		this.reason = reason;
	}

	public Withdrawal(int withdrawalId, int memId, String memName, String reason, Date withdrawalDate) {
		super();
		this.withdrawalId = withdrawalId;
		this.memId = memId;
		this.memName = memName;
		this.reason = reason;
		this.withdrawalDate = withdrawalDate;
	}
	public int getWithdrawalId() {
		return withdrawalId;
	}
	public void setWithdrawalId(int withdrawalId) {
		this.withdrawalId = withdrawalId;
	}
	public int getMemId() {
		return memId;
	}
	public void setMemId(int memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getWithdrawalDate() {
		return withdrawalDate;
	}
	public void setWithdrawalDate(Date withdrawalDate) {
		this.withdrawalDate = withdrawalDate;
	}
	
}
