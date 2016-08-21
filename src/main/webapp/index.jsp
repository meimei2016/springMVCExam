<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.hand.springWebProj.common.Constants" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
  <head>   	   
    <title> Index jsp</title>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/css/index.css">
	<script type="text/javascript">
	 	function login(){
	 		var loginform=document.getElementById("login_Form");
	 		var name=document.getElementsByName("userName").value;
	 		var pass=document.getElementsByName("password").value;
	 		if(name){
	 			alert("userName is required");
	 		}else if(pass){
	 			alert("password is required");
	 		}else{
	 			loginform.submit();
	 		}	 		
	 	}	 	
	</script>
  </head>  
  <body>
  	<div class="main">
	  	<div class="top">
			<div class="topLeft">
			    <span class="glyphicon glyphicon-asterisk">10909冉龙梅</span>
			</div>
			<div class="topRight">
			    <span class="glyphicon glyphicon-user">${userName}</span>
			</div>
	  	</div>	  
		<div class="left">		
			<ul class="list-group">
				 <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">Customer管理</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
			    <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">Film设置</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
		    </ul>
		</div> 
		<div class="right">
			<div class="rightTop">
				<p>客户管理</p>
			</div>
			<div class="rightmain">
				<div >
				<p>客户列表</p>
				<div class="create"><a href="#">新建</a></div>
			</div>
				<form>
					<div class="rightmainHead">
					</div>
					<table class="table table-bordered">
						<tr>
							<td>操作</td><td>FirstName</td><td>LastName</td><td>Address</td><td>Email</td><td>CustomerId</td><td>LastUpdate</td>
						</tr>
						<c:forEach var ="customer" items="${customerList}">
							<tr>
								<td><a href="editCustomer?${customer.customer_id}"></a>|<a href="deleteCustomer?${customer.customer_id}"></a></td>
								<td>${customer.first_name}</td>
								<td>${customer.last_name}</td>
								<td>${customer.address}</td>
								<td>${customer.email}</td>
								<td>${customer.customer_id}</td>
								<td>${customer.last_update}</td>
							</tr>
						</c:forEach>
					</table>
					<div class="page">
						<nav>
						  <ul class="pagination">
						    <li>
						      <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
    						<li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>

						    <li class="disabled"><a href="#">2</a></li>
						    <li class="disabled">
						      <a href="#" aria-label="Next">
						        <span aria-hidden="true">&raquo;</span>
						      </a>
						    </li>
						  </ul>
						</nav>
					</div>
				</form>
			</div>
		</div>
	
  		<!-- <div class="Index_href_div">
  			<a class="index_href" href="gotoLogin">Go to Login</a>
  		</div>
  		<div class="Index_href_div">
  			<a class="index_href" href="toAddFilm">Add Film</a>
  		</div>
  		<div class="Index_href_div">
  			<a class="index_href" href="toDeleteFilm">Delete Film</a>
  		</div>
  		<div class="Index_href_div">
  			<a class="index_href" href="toEditFilm">Edit Film</a>
  		</div> 		
  		<div class="Index_href_div">
  		<a class="index_href" href="showFilm">Query Film</a>
  		</div> -->
  	</div> 
  </body>
</html>
