<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="stylesheet" href="/webjars/bootstrap/4.4.1/css/bootstrap.min.css" >
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/all.js" integrity="sha384-xymdQtn1n3lH2wcu0qhcdaOpQwyoarkgLVxC/wZ5q7h9gHtxICrpcaSUfygqZGOe" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="/resources/css/footer.css">
        <link rel="stylesheet" href="/resources/css/main.css">
        <jsp:invoke fragment="header"/>
    </head>
<body>
    <div id="pageheader">
        <nav class="navbar navbar-expand-md navbar-light bg-secondary">
            <img src="/resources/images/logo1.png" alt="logo" height="50" />
            <button type="button" class="navbar-toggler bg-light" data-toggle="collapse" data-target="#nav"><span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse justify-content-between" id="nav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a href="#" class="nav-link text-light text-uppercase px-3 font-weight-bold">link</a>
                    </li>
                    <li class="nav-item dropdown" data-toggle="dropdown">
                        <a href="#" class="nav-link text-light text-uppercase px-3 font-weight-bold dropdown-toggle">link</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">dropdown1</a>
                            <a class="dropdown-item" href="#">dropdown2</a>
                            <a class="dropdown-item" href="#">dropdown3</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link text-light text-uppercase px-3 font-weight-bold">link</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link text-light text-uppercase px-3 font-weight-bold">link</a>
                    </li>
                </ul>

                <form class="form-inline">
                    <div class="input-group">
                        <input type="text" placeholder="Search..." class="form-control" />
                        <div class="input group-append">
                            <button type="button" class="btn"><i class="fas fa-search"></i></button>
                        </div>
                    </div>
                </form>
            </div>
        </nav>
    </div>
    <div id="body">
        <jsp:doBody/>

    </div>
    <div id="pagefooter">
        <footer id="footer-color">
            <div class="container">
                <div class="row">
                    <div class="col-4 my-3">
                        <img src="/resources/images/logo1.png" alt="logo" height="80" />
                        <p class="text-light small py-2">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>

                    <div class="col-4 my-3">
                        <h4 class="font-italic text-light"><spring:message code="footer.contacts"/></h4>
                        <div>
                            <i class="fas fa-map-marker-alt text-dark mr-2"></i>
                            <span class="small text-light">Via Tevere, 2 Cerro Maggiore Italy</span>
                        </div>
                        <div>
                            <i class="fas fa-phone text-dark mr-2"></i>
                            <span class="small text-light">Phone: 333-3456789</span>
                        </div>
                        <div>
                            <i class="fas fa-envelope text-dark mr-2"></i>
                            <span class="small text-light">Email: pippo@pippo.com</span>
                        </div>
                        <div>
                            <i class="fab fa-skype text-dark mr-2"></i>
                            <span class="small text-light">Skype: you_online</span>
                        </div>
                    </div>

                    <div class="col-4 my-3">
                        <h4 class="font-italic text-light mb-3">Follow us</h4>
                        <a href="#"><i class="fab fa-facebook text-primary fa-2x mx-2"></i></a>
                        <a href="#"><i class="fab fa-google-plus text-danger fa-2x mx-2"></i></a>
                        <a href="#"><i class="fab fa-twitter text-info fa-2x mx-2"></i></a>
                        <a href="#"><i class="fab fa-pinterest text-danger fa-2x mx-2"></i></a>
                    </div>
                </div>
            </div>
        </footer>
    </div>
    <script src="/webjars/jquery/3.5.0/jquery.min.js" ></script>
    <script src="/webjars/bootstrap/4.4.1/js/bootstrap.min.js" ></script>
</body>
</html>
