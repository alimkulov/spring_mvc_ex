<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: almas
  Date: 17.11.2022
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Dear Employee, you are Welcome</h2>
<br>
<br>
<br>

<%--Your name: ${param.employeeName} --%>

<%--Your name : ${nameAttribute} --%>

Your name : ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your department: ${employee.department}
<br><br>
Your car: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.langs}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br>
Phone Number: ${employee.phoneNumber}
<br><br>
Email: ${employee.email}

</body>
</html>
