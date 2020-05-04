<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags">
    <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="bootstrap.four.title"/></title>
        </jsp:attribute>
        <jsp:body>
            <div class="container">
                <div class="row jumbotron">
                    <div class="col-md-3">
                        Ciao
                    </div>
                    <div class="col-md-3">
                        sono
                    </div>
                    <div class="col-md-3">
                        bello
                    </div>
                    <div class="col-md-3">
                        <a href="www.google.com">google</a>
                    </div>
                </div>
            </div>
        </jsp:body>
    </tags:genericpage>
</jsp:root>