<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Books - BookHub</title></head>
<body>
  <h2>Available Books</h2>
  <a href="${pageContext.request.contextPath}/books/add">Add New Book</a><br/><br/>
  <table border="1" cellpadding="6" cellspacing="0">
    <tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Actions</th></tr>
    <c:forEach var="b" items="${books}">
      <tr>
        <td>${b.bookId}</td>
        <td>${b.title}</td>
        <td>${b.author}</td>
        <td>${b.price}</td>
        <td><a href="${pageContext.request.contextPath}/books/delete/${b.bookId}" onclick="return confirm('Delete?')">Delete</a></td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
