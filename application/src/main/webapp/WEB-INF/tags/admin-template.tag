<%@ attribute name="head" fragment="true" %>
<%@ attribute name="header" fragment="true" %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="content" fragment="true" %>
<!DOCTYPE html>

<html>
<head>
    <!-- Place Common CSS here -->
    <!-- Common JS here -->
    <jsp:invoke fragment="head"/>
</head>

<body>
<jsp:invoke fragment="header"/>
<jsp:invoke fragment="content"/>
<jsp:invoke fragment="footer"/>
</body>
</html>
