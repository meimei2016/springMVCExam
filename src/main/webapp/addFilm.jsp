<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>Add Film</title>
    
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="static/css/addFilm.css">
	<script type="text/javascript">
	 	function addFilm(){
	 		var addFilmForm=document.getElementById("addFilmForm");
	 		var title=document.getElementsByName("title").value;
	 		var description=document.getElementsByName("description").value;
	 		var language=document.getElementsByName("language").value;
	 		if(title){
	 			alert("title is required");
	 		}else if(description){
	 			alert("description is required");
	 		}else if(language){
	 			alert("language is required");
	 		}
	 		else{
	 			addFilmForm.submit();
	 		}	 		
	 	}	 	
	</script>
  </head>
  
  <body>
   <div>
   		<form name="addFilmForm" id="addFilmForm" method="post" action="addFilm">
   		<div class="loginInput_title_div"><h1 >Add Film</h1> </div>
   			<div class="loginInput_div"> 
   				<div class="contextDiv">title:</div>
   				<div><input class="loginInput" type="text" name="title" ></div>
   			</div>
   			<div class="loginInput_div"> 
   				<div class="contextDiv">description:</div>
   				<div><input class="loginInput" type="text" name="description" ></div>
   			</div>
   			<div class="loginInput_div">
   				<div class="contextDiv">language:</div>
		   			<div><select name="language" id="language" class="loginInput">
			   			<c:forEach var ="language" items="${languageList}">
			   				<option >${language.name}</option>
			   			</c:forEach>
		   			</select>
	   			</div>
   			</div>
   			<div class="loginInput_div"><input class="button_type" type="button" value="submit" onclick="addFilm()"/></div>   			
   		</form>
   		<div class="goBack"> <a class="link" href="index.jsp">返回首页</a></div>
   </div>
  </body>
</html>
