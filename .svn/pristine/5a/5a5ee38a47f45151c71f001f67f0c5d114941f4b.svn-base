fetch('/grCount')
  .then(response => response.json())
  .then(data => {
    const labels = data.map(item => item.department);
    const counts = data.map(item => item.cnt);

    const ctx = document.getElementById("myPieChart3").getContext('2d');
    new Chart(ctx, {
      type: 'doughnut',
      data: {
        labels: ["20대", "30대", "40대", "50대", "60대 이상"],
        datasets: [{
          data: [5, 10, 9, 5, 2],
          backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', '#f6c23e', '#e74a3b', '#858796', '#20c997'],
          hoverBackgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', '#f6c23e', '#e74a3b', '#858796', '#20c997'],
          hoverBorderColor: "rgba(234, 236, 244, 1)",
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
            bodyFont: {
              size: 14 // 툴팁 폰트 크기는 그대로 유지
            }
          },
          legend: {
            display: true,
            // 범례 폰트 크기 조정 (줄 바꿈을 없애기 위해 더 작게 설정)
            labels: {
              font: {
                size: 14 // 15에서 12로 줄여보세요. 필요에 따라 더 줄이거나 늘릴 수 있습니다.
              },
              boxWidth: 20 // 범례 색상 상자의 너비를 줄여 여유 공간 확보 (기본값 40)
            }
          }
        },
        cutout: '80%',
      }
    });
  });