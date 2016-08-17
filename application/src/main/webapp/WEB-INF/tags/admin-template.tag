<%@ attribute name="head" fragment="true" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="content" fragment="true" %>
<%--<!DOCTYPE html>--%>

<%--<html>--%>
<%--<head>--%>
    <%--<!-- Place Common CSS here -->--%>
    <%--<!-- Common JS here -->--%>
    <%--<script type="text/javascript">--%>
        <%--var csrfParameter = '${_csrf.parameterName}';--%>
        <%--var csrfToken = '${_csrf.token}';--%>
    <%--</script>--%>
    <%--<script type="text/javascript"--%>
            <%--src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.min.js"></script>--%>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>--%>
    <%--<jsp:invoke fragment="head"/>--%>
<%--</head>--%>

<%--<body>--%>
<%--<jsp:invoke fragment="header"/>--%>
<%--<jsp:invoke fragment="content"/>--%>
<%--<jsp:invoke fragment="footer"/>--%>
<%--</body>--%>
<%--</html>--%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Bootstrap 101 Template</title>

    <script type="text/javascript">
        var csrfParameter = '${_csrf.parameterName}';
        var csrfToken = '${_csrf.token}';
    </script>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <jsp:invoke fragment="head"/>
</head>
<body>
<h1>Hello, world!</h1>
<jsp:invoke fragment="header"/>
<jsp:invoke fragment="content"/>
<jsp:invoke fragment="footer"/>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.1.0.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/script.js"></script>
</body>
</html>