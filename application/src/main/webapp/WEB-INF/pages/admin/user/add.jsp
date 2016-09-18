<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<t:admin-template>
  <jsp:attribute name="header">
    <!-- Page specific JS / CSS goes here -->
  </jsp:attribute>
  <jsp:attribute name="content">

      <div class="panel panel-default" style="width: 500px;">
          <div class="panel-heading text-center">
              <h3 class="panel-title">افزودن کاربر</h3>
          </div>
          <div class="panel-body" style="padding: 20px;">
              <div id="message"></div>
              <form class="form-horizontal">
                  <div class="form-group">
                      <label for="name" class="col-sm-4 control-label">نام:</label>
                      <input type="text" class="form-control col-sm-8" name="name" id="name"/>
                  </div>
                  <div class="form-group">
                      <label for="password" class="col-sm-4 control-label">کلمه عبور:</label>
                      <input type="text" class="form-control  col-sm-8" name="password" id="password"/>
                  </div>
                  <div class="form-group">
                      <label for="password1" class="col-sm-4 control-label"> تکرار کلمه عبور:</label>
                      <input type="text" class="form-control  col-sm-8" name="password1" id="password1"/>
                  </div>
                  <div class="form-group">
                      <label for="roles" class="col-sm-4 control-label">نقش ها</label>
                      <ul class="list-group col-sm-8" id="roles" >
                   <c:forEach items="${roles}" var="role">
                       <li class="list-group-item" style="padding: 0 30px 0 0">
                           <div class="checkbox">
                           <input type="checkbox" name="roles"
                                      value="${role.id}">${role.name}
                           </div>
                       </li>
                  </c:forEach>
                      </ul>
                  </div>
                  <div class="form-group">
                      <div class="col-sm-offset-4 col-sm-8">
                          <input type="button" class="btn btn-default" name="add_user_button" id="add_user_button"
                                 value="اضافه نمودن کاربر"
                                 onclick="addUser()"/>
                      </div>
                  </div>
              </form>
          </div>


              <%--<table class="text-right">--%>
              <%--<tr>--%>
              <%--<td>نام</td>--%>
              <%--</tr>--%>
              <%--<tr>--%>
              <%--<td>کلمه عبور</td>--%>
              <%--<td><input type="text" name="name" id="name"/></td>--%>
              <%--<td><input type="text" name="password" id="password"/></td>--%>
              <%--</tr>--%>
              <%--<tr>--%>
              <%--<td>role</td>--%>
              <%--<td>--%>
              <%--<c:forEach items="${roles}" var="role">--%>
              <%--<input type="checkbox" name="roles" value="${role.id}">${role.name}<br>--%>
              <%--</c:forEach>--%>
              <%--</td>--%>
              <%--</tr>--%>
              <%--<tr>--%>
              <%--<td colspan="2">--%>
              <%--<input type="button" name="add_user_button" id="add_user_button" value="add user"--%>
              <%--onclick="addUser()"/>--%>
              <%--</td>--%>
              <%--</tr>--%>
              <%--</table>--%>
              <%--&lt;%&ndash;<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>&ndash;%&gt;--%>
              <%--</form>--%>
              <%--</div>--%>
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