<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.hand.springMVCExam.common.Constants" %>
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
	 	function deleteCustomer(){
	 		if(confirm("确定删除吗？")){
	 		location.href="deleteCustomer?customer_id=${customer.customer_id}";
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
			    <span class="glyphicon glyphicon-user"><%=request.getSession().getAttribute("userName") %></span>
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
				<div class="create"><a href="toAddCustomer">新建</a></div>
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
								<td><a href="toEditCustomer?customer_id=${customer.customer_id}">编辑</a>|<a href="#" onclick="deleteCustomer()">删除</a></td>
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
    						<%for(int i=1;i<=(int)request.getAttribute("totalPage");i++){%>
    						<li class="active"><a href="showCustomer?currentPage=<%=i%>"><%=i%><span class="sr-only">(current)</span></a></li>
							<% }%>						    
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
  	</div> 
  </body>
</html>
