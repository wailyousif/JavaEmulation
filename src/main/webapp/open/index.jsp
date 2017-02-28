<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Index Page</title>
</head>
<body>
<h3>New Person</h3>
Please enter your name and age:-<br /><br />
<form action="/postform" method="post">
    Name:<input type="text" id="name" name="name" /><br /><br />
    Age:<input type="text" id="age" name="age" /><br /><br />
    <input type="submit" value="Submit Form" />
</form>
<hr />
<h3>Persons:-</h3>
<ul>
    <c:forEach items="${persons.iterator()}" var="pp">
        <li><c:out value="${pp.name} "/> <c:out value="${pp.age} "/></li>
    </c:forEach>
</ul>
</body>
</html>