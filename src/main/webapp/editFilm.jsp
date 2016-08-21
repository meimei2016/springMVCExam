<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
 <head> 
 <title>Edit Film</title> 
  <link rel="stylesheet" type="text/css" href="static/css/login.css">
	<script type="text/javascript">
	 	function edit(){
	 		var editFilmForm=document.getElementById("editFilmForm");
	 		var film_id=document.getElementsByName("film_id").value;
	 		var title=document.getElementsByName("title").value;
	 		var description=document.getElementsByName("description").value;
	 		var language=document.getElementsByName("language").value;
	 		if(title){
	 			alert("title is required");
	 		}else if(description){
	 			alert("description is required");
	 		}else if(language){
	 			alert("language is required");
	 		}else if(film_id){
	 			alert("film_id is required");
	 		}else{
	 			editFilmForm.submit();
	 		}	 		
	 	}	 	
	</script> 
 </head> 
 <body> 
 <div class="loginform">
 <form name="editFilmForm" id="editFilmForm" action="editFilm" method="post">
 	<div class="loginInput_title_div"><h1 >Edit Film</h1> </div>
      <div class="loginInput_div">
      	<input type="hidden" name="film_id" value="${filmId}"/>
      </div>
      <div class="loginInput_div">
      	title:<input type="text" name="title" />
      </div>
      <div class="loginInput_div">
      	description:<input type="text" name="description"/>
      </div>
      <div class="loginInput_div">
      	language:<input type="text" name="language"/>
      </div>
      <div class="loginInput_div">
      	<input type="button" name="button" value="submit" onclick="edit()"/>
      </div>
 </form> 
  </div>
 </body> 
 </html> 