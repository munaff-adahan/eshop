<%@taglib prefix="layout" uri="http://callidora.lk/jsp/template-inheritance" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Layout</title>
</head>
<body>
<h1>This is Base Layout</h1>
<hr>
<h3>Block A</h3>


<layout:block name="a">
    <h1>AAAAAAAAAAAA</h1>
</layout:block>

<h3>Block B</h3>
<layout:block name="b"></layout:block>
</body>
</html>
