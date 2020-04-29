<jsp:root version="2.0" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:tags="urn:jsptagdir:/WEB-INF/tags">
<html>
    <head>
        <title>Home</title>
        <tags:head-scripts-links/>
    </head>
    <body>
        <h1>Spring MVC 5 + Spring Security 5 + Hibernate 5 example</h1>
        <h2>${message}</h2>

        <form action="/logout" method="post">
            <input value="Logout" type="submit" />
        </form>
    </body>
</html>
</jsp:root>
