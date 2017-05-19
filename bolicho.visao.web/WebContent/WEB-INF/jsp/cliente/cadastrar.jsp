<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro cliente</title>

<jsp:include page="../../../importacoes.jsp"/>

 <script type="text/javascript" >
 	$(function(){
 		$('#txtCPF').number(true,0,"","");
 	})
 
 
 </script>
 
</head>
<body>
<div class="container">
	<h2> Cadastro de cliente </h2>
	<form action="gravar"  >
		<div class="form-group">
			<label for="txtCPF">CPF:</label>
			<input type="text" name="cliente.cpf" id="txtCPF"
		   	class="form-control"   required >
		</div>
		
		<div class="form-group">
			<label for="txtNome">Nome:</label>
			<input type="text" name="cliente.nome" id="txtNome"
			class="form-control" required >
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-success" value="gravar" >
		</div>
	</form>
</div>

</body>
</html>