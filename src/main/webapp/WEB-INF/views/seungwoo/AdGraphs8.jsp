<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="UTF-8"/> 
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>My Page3</title>
  <link rel="stylesheet" href="${path}/com/bootstrap.min.css" >
  <link href="assets/css/theme.css" rel="stylesheet" />
  <style>
    .font-sans { font-family: sans-serif; }
    .valid-msg { font-size: 0.9rem; color: green; }
    .error-msg { font-size: 0.9rem; color: red; }
  </style>
  <script src="${path}/com/jquery-3.7.1.js"></script>
  <script src="${path}/com/bootstrap.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
  <main class="main" id="top">
    

    <section class="pb-11 pt-7 bg-600">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <div class="bg-white p-3 rounded shadow-sm" style="min-height: 300px;">
              <h5 class="mb-4 font-sans fw-bold">분석 메뉴</h5>
              <ul class="nav flex-column">
                <li class="nav-item mb-2">
                  <a class="nav-link text-primary mb-4 font-sans fw-bold" href="#myCourses">문의 고객 통계</a>
                  <a class="nav-link text-primary mb-4 font-sans fw-bold" href="#myCourses2">문의 고객 과목 비율</a>
                </li>
              </ul>
            </div>
          </div>

          <div class="col-md-9">
            <div class="bg-white p-4 rounded shadow-sm mb-4">
              <h4 id="myInfo" class="mb-4 font-sans fw-bold">분석 페이지</h4>
              <p>상담신청 고객님들의 분석 그래프 입니다</p>
            </div>

            <div class="row">
              <div class="col-md-6">
                <div class="bg-white p-4 rounded shadow-sm mb-4">
                  <h4 id="myCourses" class="mb-4 font-sans fw-bold">문의 고객 과목</h4>
                  <p>최근 한달간 문의한 고객님의 과목 비율입니다</p>
                  <canvas id="myPieChart4"></canvas>
                </div>
              </div>

              <div class="col-md-6">
                <div class="bg-white p-4 rounded shadow-sm mb-4">
                  <h4 id="myCourses2" class="mb-4 font-sans fw-bold">문의 고객 연령(미연동)</h4>
                  <p>최근 한달간 문의한 고객님의 연령 비율입니다(미연동)</p>
                  <canvas id="myPieChart3"></canvas>
                </div>
              </div>
            </div>

            <canvas id="deptChart" width="400" height="200"></canvas>
            <script src="${path}/seungwoo/js/demo/abc.js"></script>
          </div>
          
        </div>
      </div>
    </section>
  </main>

  <script src="${path}/seungwoo/vendors/@popperjs/popper.min.js"></script>
  <script src="${path}/seungwoo/vendors/bootstrap/bootstrap.min.js"></script>
  <script src="${path}/seungwoo/vendors/is/is.min.js"></script>
  <script src="${path}/seungwoo/vendors/fontawesome/all.min.js"></script>
  <script src="${path}/seungwoo/js/sb-admin-2.min.js"></script>
  <script src="${path}/seungwoo/js/demo/chart-area-demo.js"></script>
  <script src="${path}/seungwoo/js/demo/chart-pie-demo.js"></script>
  <script src="${path}/seungwoo/js/demo/chart-pie-demo2.js"></script>
  <script>
  fetch('/grCount')
  .then(response => response.json())
  .then(data => {
    const labels = data.map(item => item.department);
    const counts = data.map(item => item.cnt);

    // myPieChart4 (과목)
    const ctx4 = document.getElementById("myPieChart4").getContext('2d');
    new Chart(ctx4, {
      type: 'doughnut',
      data: {
        labels: labels,
        datasets: [{
          data: counts,
          backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', '#f6c23e', '#e74a3b', '#858796', '#20c997'],
          hoverBackgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', '#f6c23e', '#e74a3b', '#858796', '#20c997'],
          hoverBorderColor: "rgba(234, 236, 244, 1)"
        }]
      },
      options: {
        maintainAspectRatio: false,
        plugins: {
          tooltip: {
            backgroundColor: "rgb(255,255,255)",
            bodyColor: "#858796",
            borderColor: '#dddfeb',
            borderWidth: 1,
            padding: 10,
            displayColors: false,
            bodyFont: { size: 14 }
          },
          legend: {
            display: true,
            labels: {
              font: { size: 14 },
              boxWidth: 20
            }
          }
        },
        cutout: '80%',
      }
    });

    // myPieChart3 (연령대 - 현재는 더미 데이터 사용)
    const ctx3 = document.getElementById("myPieChart3").getContext('2d');
    new Chart(ctx3, {
      type: 'doughnut',
      data: {
        labels: ["20대", "30대", "40대", "50대", "60대 이상"],
        datasets: [{
          data: [5, 10, 9, 5, 2],
          backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', '#f6c23e', '#e74a3b'],
          hoverBackgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', '#f6c23e', '#e74a3b'],
          hoverBorderColor: "rgba(234, 236, 244, 1)"
        }]
      },
      options: {
        maintainAspectRatio: false,
        plugins: {
          tooltip: {
            backgroundColor: "rgb(255,255,255)",
            bodyColor: "#858796",
            borderColor: '#dddfeb',
            borderWidth: 1,
            padding: 10,
            displayColors: false,
            bodyFont: { size: 14 }
          },
          legend: {
            display: true,
            labels: {
              font: { size: 14 },
              boxWidth: 20
            }
          }
        },
        cutout: '80%',
      }
    });
  });

  </script>
  <script src="${path}/seungwoo/js/demo/chart-bar-demo.js"></script>
</body>
</html>
