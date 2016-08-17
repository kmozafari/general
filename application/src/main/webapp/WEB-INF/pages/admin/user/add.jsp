<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:admin-template>
  <jsp:attribute name="header">
    <!-- Page specific JS / CSS goes here -->
  </jsp:attribute>
  <jsp:attribute name="content">

      <div class="panel panel-default">
          <div class="panel-heading">
              <h3 class="panel-title">Add User</h3>
          </div>
          <div class="panel-body">
              <form>
                  <div id="message"></div>
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
                              <input type="button" name="add_user_button" id="add_user_button" value="add user"
                                     onclick="addUser()"/>
                          </td>
                      </tr>
                  </table>
                      <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>--%>
              </form>
          </div>
      </div>

       <script type="text/javascript">
           function addUser() {
               ajax('/admin/user/add', 'post', function () {
                   var roles = $("input[name='roles']:checked").map(function () {
                       return this.value;
                   }).get();
                   var data = {
                       'userId': $('#name').val(),
                       'password': $('#password').val(),
                       'roles': roles
                   };
                   console.log(data);
                   return data;
               }, function (response) {
                   var mess = "user added";
                   console.log(response);
                   if (response.status == 'false') {
                       var mess = "user not added";
                   } else {
                       $("#message").text(mess);
                   }
               });
           }
       </script>
  </jsp:attribute>
</t:admin-template>