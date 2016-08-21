<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
  <head>    
    <title>Delete Film</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	
	<link rel="stylesheet" type="text/css" href="static/css/deleteFilm.css">
	
  </head>
  <body>
    <div class="main">
	    <table class="deleteTable">
		    <tr class="tableTitle">
		    	<td class="tableTitleCol1">FilmId</td><td>Title</td><td>Description</td><td>Language</td><td colspan="2">Manage</td>    
		    </tr>
		    <c:forEach var ="film" items="${filmList}">
			    <tr class="tableContentRow">
				    <td class="tableContentCol">${film.film_id}</td><td class="tableContentCol">${film.title}</td><td class="tableContentCol">${film.description}</td>
				    <td class="tableContentCol">${film.language}</td><td class="tableContentCol"><a href="deleteFilm?film_id=${film.film_id}">delete</a></td>
				    <td><a href="editFilm.jsp?film_id=${film.film_id}">edit</a></td>    
			    </tr>
		    </c:forEach>
	    </table>
	 </div>
  </body>
</html>
