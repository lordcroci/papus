<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
        <title>Spring MVC 5 - form handling | Java Guides</title>
        <link href="<c:url value="/webjars/bootstrap/4.4.1/css/bootstrap.min.css" />"
        rel="stylesheet">
        <script src="<c:url value="/webjars/jquery/3.5.0/jquery.min.js" />"></script>
        <script src="<c:url value="/webjars/bootstrap/4.4.1/js/bootstrap.min.js" />"></script>
</head>
    <body>
        <div class="container">
            <div class="row jumbotron">
                <div class="col-md-6">
                    <p class="h1 text-center">ETHEREUM PRICE: </p>
                </div>
                <div class="col-md-6">
                    <p class="h1 text-center">${ethPrice}</p>
                </div>
            </div>
        </div>
    </body>
</html>