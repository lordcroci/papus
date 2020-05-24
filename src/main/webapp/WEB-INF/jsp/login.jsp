<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags" xmlns:c="http://java.sun.com/jsp/jstl/core"
          xmlns:form="http://www.springframework.org/tags/form">
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
    <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="login.page.title"/></title>
        </jsp:attribute>
        <jsp:body>
            <div class="container">
                <div class="row">
                    <div class="offset-4 col-4">
                        <form method="POST" action="${contextPath}/login" class="form-signin">
                            <h2 class="form-heading">Log in</h2>
                            <div class="form-group ${error != null ? 'has-error' : ''}">
                                <span>${message}</span>
                                <input name="username" type="text" class="form-control" placeholder="Username"
                                       autofocus="true"/>
                                <input name="password" type="password" class="form-control" placeholder="Password"/>
                                <span>${error}</span>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
                                <h4 class="text-center"><a href="${contextPath}/registration">Create an account</a></h4>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </jsp:body>
    </tags:genericpage>
</jsp:root>