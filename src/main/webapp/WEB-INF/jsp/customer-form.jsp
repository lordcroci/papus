<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer Form</title>
    <tags:head-script-and-link/>
    <link rel="stylesheet" href="/resources/css/main.css">
    <link rel="stylesheet" href="/resources/css/footer.css">
</head>
    <body>
        <tags:header/>
        <div class="container">
            <div class="col-md-offset-2 col-md-7">
                <h2 class="text-center">Spring MVC 5 + Hibernate 5 + JSP + MySQL
                    Example</h2>
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <div class="panel-title">Add Customer</div>
                    </div>
                    <div class="panel-body">
                        <form:form action="saveCustomer" cssClass="form-horizontal"
                                   method="post" modelAttribute="customer">

                            <!-- need to associate this data with customer id -->
                            <form:hidden path="id" />

                            <div class="form-group">
                                <label for="firstname" class="col-md-3 control-label">First
                                    Name</label>
                                <div class="col-md-9">
                                    <form:input path="firstName" cssClass="form-control" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="lastname" class="col-md-3 control-label">Last
                                    Name</label>
                                <div class="col-md-9">
                                    <form:input path="lastName" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email" class="col-md-3 control-label">Email</label>
                                <div class="col-md-9">
                                    <form:input path="email" cssClass="form-control" />
                                </div>
                            </div>

                            <div class="form-group">
                                <!-- Button -->
                                <div class="col-md-offset-3 col-md-9">
                                    <form:button cssClass="btn btn-primary">Submit</form:button>
                                </div>
                            </div>

                        </form:form>
                    </div>
                </div>
            </div>
        </div>
        <tags:end-body-script-and-link />
        <tags:footer/>
    </body>
</html>