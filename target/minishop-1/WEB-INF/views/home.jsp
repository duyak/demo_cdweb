<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/8/2020
  Time: 10:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="i" items="${listaction}">

<tr>
    <td>${i.id}</td>
    <td>${i.code}</td>
    <td>${i.name}</td>
</tr>

</c:forEach>
<%--<ul>--%>
<%--    <li>Name: ${lis}</li>--%>
<%--    <li>AVG: ${mark}</li>--%>
<%--    <li>Specialized: ${major}</li>--%>
<%--</ul>--%>
</body>
</html>
