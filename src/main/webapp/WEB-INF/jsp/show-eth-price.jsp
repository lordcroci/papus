<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>ETH Price</title>
    <tags:head-script-and-link />
    <link rel="stylesheet" href="/resources/css/main.css">
    <link rel="stylesheet" href="/resources/css/footer.css">
</head>
    <body>
        <tags:header/>
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
        <tags:end-body-script-and-link />
        <tags:footer/>
    </body>
</html>