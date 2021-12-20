<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Number Swapper - Simple Java API</title>
</head>
<body>
<h1><%= "Number Swapper" %>
</h1>

<h2><%= "Simple RESTful API in Java"%></h2>

<h3><%="Insert a number below and if there is a next bigger number composed of the same digits, you will see a new number below it!"%></h3>
<br/>

<form action="${pageContext.request.contextPath}/homeServlet" method="POST">
    <label for="givenNumber"> Put any number between 0 and 9223372036854775807 </label>
    <input type="text" name="givenNumber" id="givenNumber"/>

    <input type="submit" value="Try it!"/>
</form>

<div id="divOutput"></div>

<script type="text/javascript" src="js.js"></script>
</body>
</html>