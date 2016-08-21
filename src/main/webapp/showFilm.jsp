<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>Show Films</title>
    
	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="static/css/showFilm.css">

  </head> 
  <body>
    <table >
    <tr class="tableTitle">
    <td>film_id</td><td>title</td><td>description</td><td>language</td>    
    </tr>
    <c:forEach var ="film" items="${filmList}">
    <tr>
    <td>${film.film_id}</td><td>${film.title}</td><td>${film.description}</td><td>${film.language}</td>    
    </tr>
    </c:forEach>
    </table>
    <script type="text/javascript">
    	var paginationForm=document.getElementById("paginationForm");   	
    	function toFirstPage(){
    		document.getElementById("currentPage").value=1;
    		paginationForm.submit();
    	}
    	function toPrePage(){
    		var currentPage=${pagination.currentPage}
    		if(currentPage>1){
    			document.getElementById("currentPage").value=currentPage-1;
    			paginationForm.submit();
    		}
    		else{
    		alert("It come to the first page");
    		}
    	}
    	function toNextPage(){
    		var currentPage=${pagination.currentPage}
    		alert("currentPage"+currentPage);
    		var totalPage=${pagination.totalPage};
    		if(currentPage<totalPage){
    			document.getElementById("currentPage").value=currentPage+1;
    			alert("currentPage2"+document.getElementById("currentPage").value);
    			paginationForm.submit();
    		}else{
    		alert("It come to the last page");
    		}	
    	}
    	function toLastPage(){
    		var totalPage=${pagination.totalPage};
    		document.getElementById("currentPage").value=totalPage;
    		paginationForm.submit();
    	}
    </script>
    <form id="paginationForm" method="post" action="showFilm"class="pagination">
    <div class="paginationDiv">
    	<button class="pagebutton" onclick="toFirstPage()">第一页</button>
    	<button class="pagebutton" onclick="toPrePage()">上一页</button>
    	<button class="pagebutton" onclick="toNextPage()">下一页</button>
    	<div class="pagebutton cunrentPage">
    		<input id="currentPage" name="currentPage" type="text" class="currentPageInput" value="${pagination.currentPage}">
    	</div>
    	<button class="pagebutton lastpage" onclick="toLastPage()">尾页</button>
    </div>
    </form>
  </body>
</html>
