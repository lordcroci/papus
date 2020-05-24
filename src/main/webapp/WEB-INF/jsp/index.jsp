<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags">
    <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="index.title"/></title>
        </jsp:attribute>
        <jsp:body>
            <div class="container-fluid">
                <div class="jumbotron-fluid">
                    <div class="row text-center mt-3">
                        <div class="col-6">
                            <p>Click to go to eth page</p>
                            <hr/>
                        </div>
                        <div class="col-6">
                            <a href="/eth">Go to ETH Price Page</a>
                            <hr/>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col-6">
                            <p>Click to go to expenses page</p>
                            <hr/>
                        </div>
                        <div class="col-6">
                            <a href="/expCounter">Go to personal expenses Page</a>
                            <hr/>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col-6">
                            <p>Click to go to registration page</p>
                            <hr/>
                        </div>
                        <div class="col-6">
                            <a href="/registration">Go to registration Page</a>
                            <hr/>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col-6">
                            <p>Click to go to welcome page</p>
                            <hr/>
                        </div>
                        <div class="col-6">
                            <a href="/welcome">Go to welcome Page</a>
                            <hr/>
                        </div>
                    </div>
                    <div class="row text-center">
                        <div class="col-6">
                            <p>Click to go to login page</p>
                            <hr/>
                        </div>
                        <div class="col-6">
                            <a href="/login">Go to login Page</a>
                            <hr/>
                        </div>
                    </div>
                </div>
            </div>
        </jsp:body>
    </tags:genericpage>
</jsp:root>