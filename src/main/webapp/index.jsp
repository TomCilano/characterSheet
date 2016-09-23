<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Your Character</h1>
<form method="post" action="/myWeb/createCharacter">
    <table>
        <tr><td>Character Name:</td>
            <td><input type="text" name="name" value="<c:out value="${selectedcharacter.name}"/>"></td></tr>
        <tr><td>Character Race:</td> <td><input type="text" name="race" value="<c:out value="${selectedcharacter.race}"/>"></td></tr>
        <tr><td>Character Class:</td> <td><input type="text" name="type" value="<c:out value="${selectedcharacter.type}"/>"></td></tr>
        <tr><td>Character ID:</td> <td><input type="text" name="Id" value="<c:out value="${selectedcharacter.id}"/>"></td></tr>
    </table>
    <input type="submit" value="Save">
</form>

Character Sheets
<table border="1">
    <tr><th>Edit</th><th>NAME</th><th>RACE</th><th>Class</th><th>DELETE</th></tr>
    <c:forEach items="${thecharacterList}" var="character">
        <tr><td><a href="/myWeb/selectCharacter?id=<c:out value="${character.id}"/>">EDIT</a> </td><td><c:out value="${character.name}"/></td><td><c:out value="${character.race}"/></td><td><c:out value="${character.type}"/></td><td><a href="/myWeb/deleteCharacter?delete=<c:out value="${character.id}"/>">DELETE</a> </td></tr>
    </c:forEach>
</table>

</body>
</html>