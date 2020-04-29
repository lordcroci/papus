<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags" xmlns:c="http://java.sun.com/jsp/jstl/core">
    <c:set var="contextPath" value="${pageContext.request.contextPath}"/>

        <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="welcome.title"/></title>
        </jsp:attribute>
            <jsp:body>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>

                    <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

                </c:if>
            </jsp:body>
        </tags:genericpage>
</jsp:root>