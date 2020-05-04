<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags" xmlns:c="http://java.sun.com/jsp/jstl/core"
          xmlns:form="http://www.springframework.org/tags/form">
    <c:set var="contextPath" value="${request.contextPath}"/>
        <tags:genericpage>
            <jsp:attribute name="header">
                <title><spring:message code="welcome.page.title"/></title>
            </jsp:attribute>
            <jsp:body>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form:form action="/logout" method="post">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <h2>Welcome ${pageContext.request.userPrincipal.name}</h2>
                        <input type="submit" value="Log out"/>
                    </form:form>
                </c:if>
            </jsp:body>
        </tags:genericpage>
</jsp:root>