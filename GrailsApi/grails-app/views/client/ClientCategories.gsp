<%--
  Created by IntelliJ IDEA.
  User: acrosetto
  Date: 2019-04-24
  Time: 13:20
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Client Categories</title>
</head>
<body>
<ul>
    <g:each var="i" in="${result}">
        <a href="ClientCategories.gsp"><li>${i.name}</li></a>
    </g:each>
</ul>
</body>
</html>