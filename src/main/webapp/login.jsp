<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.hand.springMVCExam.common.Constants" %>
<!DOCTYPE HTML >
<html>
  <head>   	   
    <title>Login</title>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/css/login.css">
	<script type="text/javascript">
	 	function login(){
	 		var loginform=document.getElementById("login_Form");
	 		var userName=document.getElementsByName("userName").value;
	 		var password=document.getElementsByName("password").value;
	 		if(userName){
	 			alert("userName is required");
	 		}if(password){
	 			alert("userName is required");
	 		}else{
	 			if(confirm("确定提交吗")){
          			loginform.submit();
			     }
	 		}	 		
	 	}	 	
	</script>
  </head>  
  <body class="main">
  	<div class="topDiv">
  	<span class="glyphicon glyphicon-asterisk"></span>10909冉龙梅
  	</div>
  	<div class="mainDiv"> 
  		<div class="formTop">
  		<p>电影租赁管理系统 </p>
  		<hr class="hrLine">
  		</div>	
  		<div class="formMain">
	  	<form class="form-horizontal" id="login_Form" name="login_Form" method="post" action="login">	  	  
	  	  <div class="form-group has-success has-feedback">
		    <label class="control-label col-sm-3" for="inputSuccess3">用户名</label>
		    <div class="col-sm-9">
		      <input type="text" class="form-control" id="userName" placeholder="userName" name="userName" aria-describedby="inputSuccess3Status">
		      <span class="glyphicon glyphicon-user form-control-feedback" aria-hidden="true"></span>
		      <span id="inputSuccess3Status" class="sr-only">(userName)</span>
		    </div>
		  </div>
	  	  <div class="form-group has-success has-feedback">
		    <label class="control-label col-sm-3" for="inputSuccess3">密码</label>
		    <div class="col-sm-9">
		      <input type="text" class="form-control" id="password" placeholder="password" name="password" aria-describedby="inputSuccess3Status">
		      <span class="glyphicon glyphicon-lock form-control-feedback" aria-hidden="true"></span>
		      <span id="inputSuccess3Status" class="sr-only">(password)</span>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default" onclick="login()">登陆</button>
		    </div>
		  </div>
		</form>
		</div>
  	</div> 
  </body>
</html>
