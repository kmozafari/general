<%@ attribute name="head" fragment="true" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="content" fragment="true" %>
<%@ tag pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript">
        var csrfParameter = '${_csrf.parameterName}';
        var csrfToken = '${_csrf.token}';
    </script>
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="//cdn.rawgit.com/morteza/bootstrap-rtl/v3.3.4/dist/css/bootstrap-rtl.min.css">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        html, body {
            height: 100%;
            min-height: 100%;
        }

        .container {
            width: 100%;
            margin: 0 auto;
            background: white;
            min-height: calc(100vh - 100px);
        }

        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }

        /* Set gray background color and 100% height */
        .sidenav {
            padding-top: 20px;
            background-color: #f1f1f1;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        /*footer {*/
        /*background-color: #555;*/
        /*color: white;*/
        /*padding: 15px;*/
        /*}*/

        header, footer {
            background: lightseagreen;
            width: 100%;
            height: 50px;
        }

        header {
            position: fixed;
            left: 0;
            top: 0;
        }

        footer {
            position: absolute;
            left: 0;
            bottom: 0;
        }

    </style>
    <jsp:invoke fragment="head"/>
</head>
<body>

<div class="container-fluid">
    <header>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav navbar-left">
                        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> خروج</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <main>
        <div class="container">
            <div class="row">
                <div class="col-sm-2 sidenav">
                    <%--<div class="well">--%>
                    <%--<p>ADS</p>--%>
                    <%--</div>--%>
                    <%--<div class="well">--%>
                    <%--<p>ADS</p>--%>
                    <%--</div>--%>
                </div>
                <div class="col-sm-10">
                    <jsp:invoke fragment="content"/>
                </div>
            </div>
        </div>
    </main>
    <footer class="container-fluid footer text-center">
        <p>کوروش مظفری</p>
    </footer>
</div>
</body>
</html>


<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--<meta charset="utf-8">--%>
<%--<meta http-equiv="X-UA-Compatible" content="IE=edge">--%>
<%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
<%--<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->--%>
<%--<title>Bootstrap 101 Template</title>--%>

<%--<script type="text/javascript">--%>
<%--var csrfParameter = '${_csrf.parameterName}';--%>
<%--var csrfToken = '${_csrf.token}';--%>
<%--</script>--%>

<%--<!-- Bootstrap -->--%>
<%--<link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">--%>

<%--<!--[if lt IE 9]>--%>
<%--<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>--%>
<%--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>--%>
<%--<![endif]-->--%>
<%--<jsp:invoke fragment="head"/>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1>Hello, world!</h1>--%>
<%--<jsp:invoke fragment="header"/>--%>
<%--<jsp:invoke fragment="content"/>--%>
<%--<jsp:invoke fragment="footer"/>--%>
<%--<script src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.min.js"></script>--%>
<%--<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>--%>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>--%>
<%--</body>--%>
<%--</html>--%>