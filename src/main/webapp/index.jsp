<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="http://www.kryogenix.org/code/browser/sorttable/sorttable.js"></script>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 50%;
        }

        td, th {
            border: 2px solid ;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(odd){
            background: saddlebrown;
        }
        tr:nth-child(even) {
            background-color: sandybrown;
        }
    </style>
    <title>Title</title>
</head>
<body background="https://s-media-cache-ak0.pinimg.com/564x/2c/7f/6d/2c7f6dcd15a756e2f0885212b52ea6c7.jpg">
<center><h1><u><b><font face="Century Gothic">Create Your Character</font></b></u></h1></center>
<br>
<br>
<center><img src="http://i.skyrock.net/0223/59080223/pics/2386606377_small_1.jpg"></center>
<br>
<center><form method="post" action="/myWeb/createCharacter">
    <table>
        <tr><td>Character Name:</td>
            <td><input type="text" name="name" value="<c:out value="${selectedcharacter.name}"/>"></td></tr>
        <tr><td>Character Race:</td> <td><input type="text" name="race" value="<c:out value="${selectedcharacter.race}"/>"></td></tr>
        <tr><td>Character Class:</td> <td><input type="text" name="type" value="<c:out value="${selectedcharacter.type}"/>"></td></tr>
        <tr><td>Character ID:</td> <td><input type="text" name="Id" value="<c:out value="${selectedcharacter.id}"/>"></td></tr>
    </table>
    <input type="submit" value="Save">
</form></center>

<center><b><u>Character Sheets</u></b></center>
<center><table class="sortable">
        <thead>
        <tr>
            <th>Edit</th>
            <th>Name</th>
            <th>Class</th>
            <th>Type</th>
            <th>DELETE</th>
        </tr>
        </thead>
    <c:forEach items="${thecharacterList}" var="character">
        <tr><td><a href="/myWeb/selectCharacter?id=<c:out value="${character.id}"/>">EDIT</a> </td><td><c:out value="${character.name}"/></td><td><c:out value="${character.race}"/></td><td><c:out value="${character.type}"/></td><td><a href="/myWeb/deleteCharacter?delete=<c:out value="${character.id}"/>">DELETE</a> </td></tr>
    </c:forEach>
</table></center>

</body>
</html>