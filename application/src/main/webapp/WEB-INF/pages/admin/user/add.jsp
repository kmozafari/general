<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:admin-template>
  <jsp:attribute name="header">
    <!-- Page specific JS / CSS goes here -->
  </jsp:attribute>
  <jsp:attribute name="content">
      <form action="/admin/user/add" method="post" enctype='application/json' accept-charset="UTF-8">
          <table>
              <tr>
                  <td>name</td>
                  <td><input type="text" name="name" id="name"/></td>
              </tr>
              <tr>
                  <td>password</td>
                  <td><input type="text" name="password" id="password"/></td>
              </tr>
              <tr>
                  <td>role</td>
                  <td>
                      <c:forEach items="${roles}" var="role">
                          <input type="checkbox" name="roles" value="${role.id}">${role.name}<br>
                      </c:forEach>
                  </td>
              </tr>
              <tr>
                  <td colspan="2">
                      <input type="submit" value="add user"/>
                  </td>
              </tr>
          </table>
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      </form>
  </jsp:attribute>
</t:admin-template>