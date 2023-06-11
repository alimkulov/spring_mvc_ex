<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>  Dear Employee, please enter your details </h2>
<br>
<br>
<!--
<form  action="showDetails" method="get">
    <input type="text" name="employeeName" placeholder="Write your name"/>
    <input type="submit"/>
</form>
-->

<form:form action="showDetails" modelAttribute="employee">

    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department: <form:select path="department">
    <%--<form:option value="Information Technology" label="IT"/>
       <form:option value="Human Resources" label="HR"/>
       <form:option value="Sales" label="Sales"/> --%>
                 <form:options items="${employee.deps}"/>
               </form:select>
    <br><br>
    Which car do you want:
    <br>
  <%--  Geely<form:radiobutton path="carBrand" value="Geely"/>
    GAC<form:radiobutton path="carBrand" value="GAC"/>
    Chery<form:radiobutton path="carBrand" value="Chery"/>--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>
    Foreign Language(s):
    <%--EN<form:checkbox path="langs" value="English"/>
    DE<form:checkbox path="langs" value="Deutch"/>
    FR<form:checkbox path="langs" value="French"/> --%>
    <form:checkboxes path="langs" items="${employee.langList}"/>
    <br><br>
    Phone Number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>

    <br>
    <input type="submit" value="OK">

</form:form>

</body>

</html>