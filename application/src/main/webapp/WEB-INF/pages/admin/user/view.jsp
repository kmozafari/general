<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:admin-template>
  <jsp:attribute name="header">
    <!-- Page specific JS / CSS goes here -->
  </jsp:attribute>
  <jsp:attribute name="content">
    <table>
        <c:forEach items="${users}" var="user">
            <tr>
                <td colspan="2">
                        ${user.userId}
                </td>
            </tr>
            <c:forEach items="${user.roles}" var="role">
                <tr>
                    <td>
                            ${role.name}
                    </td>
                    <td>
                        <table>
                            <c:forEach items="${role.authorities}" var="authority">
                                <tr>
                                    <td>
                                            ${authority.name}
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </td>
                </tr>
            </c:forEach>
        </c:forEach>
    </table>
  </jsp:attribute>
</t:admin-template>