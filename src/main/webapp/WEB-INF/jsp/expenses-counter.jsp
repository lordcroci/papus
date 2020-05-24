<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags" xmlns:c="http://java.sun.com/jsp/jstl/core"
          xmlns:form="http://www.springframework.org/tags/form" xmlns:fmt="http://java.sun.com/jsp/jstl/fmt">
    <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="expenses.counter.page.title"/></title>
            <link ref="stylesheet" type="text/css" href="/resources/css/footer.css" />
        </jsp:attribute>
        <jsp:body>
            <div class="container-fluid">
                <div class="row">
                    <div class="col">
                        <h1 class="text-center">EXPENSE COUNTER</h1>
                        <hr/>
                        <form id="expForm" action="/expCounter" method="post" class="needs-validation" novalidate="">
                            <div class="form-row mx-5 my-4 text-center">
                                <!-- DESCRIPTION -->
                                <div class="form-group col-4 text-uppercase align-self-start">
                                    <label for="description">
                                        <p><spring:message code="expenses.counter.description"/></p>
                                    </label>
                                    <input type="text" class="form-control ${validationResult.hasFieldErrors('description') ? 'is-invalid' : ''}" id="description" name="description"  />
                                    <div class="invalid-tooltip">
                                        <small><spring:message code="expenses.counter.error.description"/></small>
                                    </div>
                                </div>
                                <!-- AMOUNT -->
                                <div class="form-group col-2 text-uppercase align-self-start">
                                    <label for="amount">
                                        <p><spring:message code="expenses.counter.amount"/></p>
                                    </label>
                                    <input type="number" class="form-control ${validationResult.hasFieldErrors('amount') ? 'is-invalid' : ''}" id="amount" name="amount" required=""/>
                                    <div class="invalid-tooltip">
                                        <small><spring:message code="expenses.counter.error.amount"/></small>
                                    </div>
                                </div>
                                <!-- DATE -->
                                <div class="form-group col-2 text-uppercase align-self-start">
                                    <label for="spentOnDate">
                                        <p><spring:message code="expenses.counter.txdate"/></p>
                                    </label>
                                    <spring:message code="expenses.placeholder.ondate" var="ondate.placeholder" />
                                    <input type="date" class="form-control ${validationResult.hasFieldErrors('spentOnDate') ? 'is-invalid' : ''}" id="spentOnDate" name="spentOnDate" placeholder="${ondate.placeholder}" required=""/>
                                    <div class="invalid-tooltip">
                                        <small><spring:message code="expenses.counter.error.spentOnDate"/></small>
                                    </div>
                                </div>
                                <!-- BUTTON -->
                                <div class="form-group col-2 align-self-end">
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                    <button type="submit" class="btn btn-secondary">
                                        <spring:message code="general.button.submit"/>
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>









                <hr/>
                <c:if test="${!empty expenses}">
                    <c:forEach items="${expenses}" var="expense">
                        <div class="row mx-5">
                            <div class="col-4 text-center border-right">
                                ${expense.description}
                            </div>
                            <div class="col-4 text-center border-right">
                                ${expense.amount}
                            </div>
                            <div class="col-4 text-center">
                                <fmt:parseDate value="${expense.spentOnDate}" pattern="yyyy-MM-dd" var="parsedDate" type="date" />
                                <fmt:formatDate value="${parsedDate}" var="spentOnDate" pattern="dd/MM/yyyy" />
                                ${spentOnDate}
                            </div>
                        </div>
                        <hr/>
                    </c:forEach>
                </c:if>
            </div>
        </jsp:body>
    </tags:genericpage>
</jsp:root>
