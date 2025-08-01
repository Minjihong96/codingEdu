fetch('/grCount')
  .then(response => response.json())
  .then(data => {
    const labels = data.map(item => item.department);
    const counts = data.map(item => item.cnt);

    const ctx = document.getElementById("myPieChart4").getContext('2d');
    new Chart(ctx, {
      type: 'doughnut',
      data: {
        labels: labels,
        datasets: [{
          data: counts,
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
            // 툴팁 폰트 크기 변경
            bodyFont: {
              size: 14 // 원하는 크기로 변경
            }
          },
          legend: {
            display: true,
            // 범례 폰트 크기 변경
            labels: {
              font: {
                size: 15 // 원하는 크기로 변경
              }
            }
          }
        },
        cutout: '80%',
      }
    });
  });