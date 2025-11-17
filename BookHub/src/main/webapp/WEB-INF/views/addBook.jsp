<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Add Book - BookHub</title></head>
<body>
  <h2>Add New Book</h2>
  <form action="${pageContext.request.contextPath}/books/add" method="post">
    <table>
      <tr><td>Title:</td><td><input type="text" name="title" required/></td></tr>
      <tr><td>Author:</td><td><input type="text" name="author" /></td></tr>
      <tr><td>Price:</td><td><input type="number" name="price" step="0.01" /></td></tr>
      <tr><td colspan="2"><input type="submit" value="Add Book" /> <a href="${pageContext.request.contextPath}/books">View Books</a></td></tr>
    </table>
  </form>
</body>
</html>
