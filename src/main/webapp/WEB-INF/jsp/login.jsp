<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>SPRSUNARP | Login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/styles.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/backbone.modal.css">
<style>
.error {
	padding: 5px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
	text-align: center;
}
</style>
</head>
<body onload='document.loginForm.username.focus();'>



	<div class="container">
		<div class="row">
			<div class="col-sm-2">
				<a class="logo" href="#"><img class="img-responsive"
					src="${pageContext.request.contextPath}/resources/img/sunarp_logo.png" /></a>
			</div>
		</div>
	

		<div class="row">

			<div class="col-sm-6">
				<h1 class="text-center login-title">Inicio de Sesión</h1>
				<div class="account-wall">
					<form class="form-signin" name='loginForm'
						action="<c:url value='/j_spring_security_check' />" method='POST'>
						<c:if test="${not empty error}">
							<div class="error">${error}</div>
						</c:if>
						<c:if test="${not empty msg}">
							<div class="msg">${msg}</div>
						</c:if>
						<c:if test="${not empty option}">
							<div class="option">${option}</div>
						</c:if>
						<div class="form-group">
							<label for="username">Usuario</label>
							<input id="username" type="text" name='username' class="form-control input-sm" placeholder="Usuario">
						</div>
						<div class="form-group">
							<label for="password">Contraseña</label>
							<input id="password" type="password" name='password' class="form-control input-sm" placeholder="Password">
						</div>

						<div class="form-group">
							<button class="btn btn-sunarp btn-sm btn-block" name="submit"
								type="submit" value="submit">Entrar</button>
							<!-- label class="checkbox pull-left"> <input type="checkbox"
								value="remember-me"> Remember me
							</label --> <span class="clearfix"></span> <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<div class="teclado hasTecladoAlfanumerico"></div>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.selection.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/underscore-min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/backbone-min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/libs/teclado/all.js"></script>
	
	<script type="text/javascript">
	$(function () {

		keyboard = getKeyboardView (tacladoAlfanumerico);
		$('.teclado').addClass('hasTecladoAlfanumerico').empty();
		keyboard.render().$el.appendTo('.teclado');
		keyboard.$el.addClass('teclado-alfanumerico');
	});
	</script>
</body>
</html>