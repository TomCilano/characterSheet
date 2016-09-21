<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Character Sheet Index</h2>
look at me im a webpage lolwut
<br>
<form method="post" action="/myWeb/index.jsp">
<table border="1">
    <tr><td>Character Name</td></tr>
    <input type="text" name="name">
</table>
    <input type="submit" value="Submit">
</form>
<table border="1">
<c:forEach items="${characterList}" var="character">

    <tr><td><c:out value="${character.name}"/></td></tr>
</c:forEach>
</table>

</body>
</html>
