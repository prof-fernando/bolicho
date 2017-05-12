<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
                                             prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clientes</title>
<link rel="stylesheet"
href="http://localhost:8080/bolicho.visao.web/css/bootstrap.min.css">
</head>
<body>
<h2> Listagem de clientes</h2>
<table>
   <tr>
      <th> CPF </th>
      <th> Nome </th>
   </tr>
   <c:forEach items="${clientes}" var="cli" >
     <tr>
        <td> ${cli.cpf } </td>
        <td> ${cli.nome } </td>
     </tr>
   </c:forEach>
   
</table>
   
<a class="btn btn-primary" href="cadastrar">
  <span class="glyphicon glyphicon-plus"></span>
  Adicionar
</a>

</body>

</html>