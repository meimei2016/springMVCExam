<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.hand.springMVCExam.common.Constants" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
  <head>   	   
    <title> Add Customer</title>
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/css/index.css">
	<script type="text/javascript">
	 	function addNewCustomer(){
	 		var addCustomerForm=document.getElementById("addCustomerForm");
	 		var first_name=document.getElementsByName("first_name").value;
	 		var last_name=document.getElementsByName("last_name").value;
	 		var customer_id=document.getElementsByName("customer_id").value;
	 		var email=document.getElementsByName("email").value;
	 		var address=document.getElementsByName("address").value;
	 		if(first_name){
	 			alert("first_name is required");
	 		}else if(last_name){
	 			alert("last_name is required");
	 		}else if(address){
	 			alert("address is required");
	 		}else if(customer_id){
	 			document.getElementsByName("customer_id").value=0;
	 		}else if(email){
	 			email="";
	 		}else{
	 		if(confirm("确定提交吗")){
	 			addCustomerForm.submit();
	 		}
	 			
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
			    		<button class="linkButton">Dashboard</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
			    <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">应用设置</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
			    <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">管理设置</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
			    <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">数据配置</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
			    <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">主数据管理</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
			    <div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">客户订单管理</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div><div class="linkStyle">
			    	<li class="list-group-item">
			    		<span class="glyphicon glyphicon-stop"></span>
			    		<button class="linkButton">发货单管理</button>
			    		<span class="glyphicon glyphicon-chevron-right"></span>
				    </li>
			    </div>
		    </ul>
		</div> 
		<div class="right">
			<div class="rightTop">
				<p>创建Customer</p>
			</div>
			<div class="rightmain">
				<div >
				<p>基本信息</p>
			</div>
				<form id="addCustomerForm" name="addCustomerForm" method="post" action="addCustomer">
					<input type="hidden" class="form-control" id="customer_id" name="customer_id" value="${customer_id}"/>
					<div class="form-group">
					  <label class="col-sm-2 control-label">First Name*</label>
					  <div class="col-sm-10">
					    <input type="text" class="form-control" id="first_name" name="first_name">
					  </div>
					</div>
					<div class="form-group">
					  <label  class="col-sm-2 control-label">Last Name*</label>
					  <div class="col-sm-10">
					    <input type="text" class="form-control" id="last_name" name="last_name">
					  </div>
					</div>
					<div class="form-group">
					  <label  class="col-sm-2 control-label">Email</label>
					  <div class="col-sm-10">
					    <input type="text" class="form-control" id="email" name="email">
					  </div>
					</div>
					<div class="form-group">
					  <label  class="col-sm-2 control-label">Address*</label>
					  <div class="col-sm-10">
					    	<select class="form-control" id="address" name="address">
					    		<c:forEach var ="address" items="${addressList}">
									<option>${address.address}</option>
								</c:forEach>
							</select>
					  </div>
					</div>
					 <div class="form-group">
					    <div class="col-sm-offset-2 col-sm-10">
					      <button type="button" class="btn btn-default" onclick="addNewCustomer()">新建</button>
					      <button type="reset" class="btn btn-default" >重置</button>
					    </div>
					 </div>
				</form>
			</div>
		</div>
    </div>
  </body>
</html>
