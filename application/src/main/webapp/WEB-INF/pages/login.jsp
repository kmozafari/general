<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
</head>

<body>
<div id="mainWrapper">
    <div>
        <div>
            <div>
                <form action="/login" method="post">
                    <c:if test="${param.error != null}">
                        <div>
                            <p>Invalid username and password.</p>
                        </div>
                    </c:if>
                    <c:if test="${param.logout != null}">
                        <div>
                            <p>You have been logged out successfully.</p>
                        </div>
                    </c:if>
                    <div>
                        <label for="username"><i></i></label>
                        <input type="text" id="username" name="ssoId" placeholder="Enter Username"
                               required>
                    </div>
                    <div>
                        <label for="password"><i></i></label>
                        <input type="password" id="password" name="password"
                               placeholder="Enter Password" required>
                    </div>
                    <input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
                    <div class="form-actions">
                        <input type="submit"
                               value="Log in">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>