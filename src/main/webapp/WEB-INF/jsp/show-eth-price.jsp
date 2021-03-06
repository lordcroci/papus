<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
    xmlns:spring="http://www.springframework.org/tags">
    <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="eth.page.title"/></title>
        </jsp:attribute>
        <jsp:body>
            <div class="container">
                <div class="row jumbotron">
                    <div class="col-md-6">
                        <p class="h1 text-center"><spring:message code="eth.price.message"/></p>
                    </div>
                    <div class="col-md-6">
                        <p class="h1 text-center">${ethPrice}</p>
                    </div>
                </div>
            </div>
        </jsp:body>
    </tags:genericpage>
</jsp:root>