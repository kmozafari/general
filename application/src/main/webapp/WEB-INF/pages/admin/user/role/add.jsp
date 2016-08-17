<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:admin-template>
  <jsp:attribute name="header">
    <!-- Page specific JS / CSS goes here -->
  </jsp:attribute>
  <jsp:attribute name="content">
      <form>
          <table>
              <tr>
                  <td>name</td>
                  <td><input type="text" name="name" id="name"/></td>
              </tr>
              <tr>
                  <td>authority</td>
                  <td>
                      <c:forEach items="${authorities}" var="authority">
                          <input type="checkbox" name="authorities" value="${authority.id}">${authority.name}<br>
                      </c:forEach>
                  </td>
              </tr>
              <tr>
                  <td colspan="2">
                      <input type="button" name="add_role_button" id="add_role_button" value="add role"
                             onclick="addRole()"/>
                  </td>
              </tr>
          </table>
              <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
      </form>
       <script type="text/javascript">
           function addRole() {
               ajax('/admin/user/role/add', 'post', function () {
                   var authorities = $("input[name='authorities']:checked").map(function () {
                       return this.value;
                   }).get();
                   var data = {
                       'name': $('#name').val(),
                       'authorities': authorities
                   };
                   console.log(data);
                   return data;
               }, function (response) {
                   var mess = "role added";
                   console.log(response);
                   if (response.status == 'false') {
                       var mess = "role not added";
                   } else {
                       $("#message").text(mess);
                   }
               });
           }
       </script>
  </jsp:attribute>
</t:admin-template>