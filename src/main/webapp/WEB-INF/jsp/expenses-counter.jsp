<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags"
          xmlns:spring="http://www.springframework.org/tags" xmlns:c="http://java.sun.com/jsp/jstl/core"
          xmlns:form="http://www.springframework.org/tags/form">
    <tags:genericpage>
        <jsp:attribute name="header">
            <title><spring:message code="expenses.counter.page.title"/></title>
        </jsp:attribute>
        <jsp:body>
            <div class=".container-fluid">
                <div class="row">
                    <div class="col">
                        <form:form method="POST" action="addExpense" modelAttribute="expForm">
                            <div class="form-row mx-5 my-4 align-items-center text-center">
                                <div class="form-group col-4 text-uppercase">
                                    <label for="description"><p><spring:message code="expenses.counter.description"/></p></label>
                                    <form:input path="description" cssClass="form-control" />
                                </div>
                                <div class="form-group col-2 text-uppercase">
                                    <label for="amount"><p><spring:message code="expenses.counter.amount"/></p></label>
                                    <form:input path="amount" cssClass="form-control" />
                                </div>
                                <div class="form-group col-2 text-uppercase">
                                    <label for="spentOnDate"><p><spring:message code="expenses.counter.txdate"/></p></label>
                                    <form:input path="spentOnDate" cssClass="form-control" />
                                </div>
                                <div class="form-group col-2">
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                    <form:button class="btn btn-secondary"><spring:message code="general.button.submit"/></form:button>
                                </div>
                            </div>
                        </form:form>
                    </div>
                </div>
                <c:if test="${!empty expenses}">
                    <c:forEach items="${expenses}" var="expense">
                        <div class="row mx-5" style="border: 1px solid black;">
                            <div class="col-3 text-center">
                                <h3>SPESA</h3>
                            </div>
                            <div class="col-3 text-center">
                                ${expense.description}
                            </div>
                            <div class="col-3 text-center">
                                ${expense.amount}
                            </div>
                            <div class="col-3 text-center">
                                ${expense.spentOnDate}
                            </div>
                        </div>
                    </c:forEach>
                </c:if>
            </div>
        </jsp:body>
    </tags:genericpage>
</jsp:root>
