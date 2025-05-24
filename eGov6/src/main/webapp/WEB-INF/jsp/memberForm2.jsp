<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<title>회원 등록</title>
  <style>
    body {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
    }
    .form-container {
      background-color: #ffffff;
      padding: 30px 40px;
      border-radius: 10px;
      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
      width: 300px;
    }
    .form-container h2 {
      text-align: center;
      margin-bottom: 20px;
    }
    .form-group {
      margin-bottom: 15px;
    }
    .form-group label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
    }
    .form-group input {
      width: 100%;
      padding: 8px 10px;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }
    .form-group input:focus {
      border-color: #007BFF;
      outline: none;
    }
    .submit-button {
      width: 100%;
      padding: 10px;
      background-color: #007BFF;
      color: #ffffff;
      border: none;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
    }
    .submit-button:hover {
      background-color: #0056b3;
    }
  </style>	
</head>
    <!-- jQuery를 CDN을 통해 포함 -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script type="text/javascript">
    
    $(document).ready(function() {
        $('#btn').click(function() {
//             alert('버튼이 클릭되었습니다!');          
            var pname = document.getElementById("name").value;
            var pemail = document.getElementById("email").value;
            
            if(pname == "") {
            	alert("이름을 입력하세요.");
            	return;
            }
            if(pemail == "") {
            	alert("이메일을 입력하세요.");
            	return;
            }
            
            fetch('${pageContext.request.contextPath}/members/insertMember2', {
          	  method: 'POST',
          	  headers: {
          	    'Content-Type': 'application/json'
          	  },
          	  body: JSON.stringify({
          		name: pname, 
          		email: pemail
          	  })
          	})
          	.then(response => response.json())
          	.then(data => {
	          	  if (data.redirectUrl) {
// 	          		  console.log('성공:', data.redirectUrl);
// 	          		  alert('성공:');
	          		  
	          		  window.location.href = data.redirectUrl;
	          		  
	          	  } else {
	          	    console.log('서버 응답:', data);
	          	  }
          	})
          	.catch(error => {
          	  console.error('오류 발생:', error);
          	});            
            
        });
    });    
    </script>
    
<body>
  <div class="form-container">
    <h2>회원 등록</h2>
<!--     <form action="/members/api/insert" method="post"> -->
      <div class="form-group">
        <label for="name">이름</label>
        <input type="text" id="name" name="name" placeholder="이름을 입력하세요" required>
      </div>
      <div class="form-group">
        <label for="email">이메일</label>
        <input type="email" id="email" name="email" placeholder="이메일을 입력하세요" required>
      </div>
      <input type="button" id="btn" class="submit-button" value="등록">
<!--       <button type="submit" class="submit-button">등록</button> -->
<!--     </form> -->
  </div>    
</body>

</html>