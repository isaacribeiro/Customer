<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <body>
    <h3>Create Customer</h3>
    <form action="addNewCustomer" method="post">
      Name: <input type="text" name="name"/>  
      <input type="submit" value="Create">
    </form>
  </body>
</html>