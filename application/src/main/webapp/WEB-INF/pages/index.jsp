<%@ taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:public-template>
  <jsp:attribute name="content">
      <div class="panel panel-default">
          <div class="panel-body">Greeting : ${greeting}. This is a welcome page.</div>
      </div>
  </jsp:attribute>
</t:public-template>
