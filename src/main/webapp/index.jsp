<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Number Swapper - Simple Java API</title>

<%--    <script>
        function getNumber(){
            let givenNumber = document.getElementById("givenNumber").value;

            let postNumber = 'givenNumber=' + givenNumber;

            let ajaxRequest = new XMLHttpRequest();
            ajaxRequest.open('POST', 'http://localhost:8080/homeServlet/' + givenNumber)
            ajaxRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            ajaxRequest.send(postNumber);

        }
    </script>--%>

    <script src="js.js"></script>
</head>
<body>
<h1><%= "Number Swapper" %>
</h1>

<h2><%= "Simple RESTful API in Java"%></h2>

<h3><%="Insert a number below and if there is a next bigger number composed of the same digits, you will see a new number below it!"%></h3>
<br/>

<form method="POST" name="getNumberForm">
    <label for="givenNumber"> Put any number between 0 and 9223372036854775807 </label>
    <input type="text" name="givenNumber" id="givenNumber"/>

    <input type="button" value="Try it!" onclick="getNumber()"/>
</form>

<div id="divOutput"></div>

<script type="text/javascript" src="js.js"></script>
</body>
</html>