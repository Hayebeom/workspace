<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<title>쇼핑몰</title>
</head>
<body>
	<div class="container mt-3 mb-5">
		<div class="row">
			<div class="col-12">
				<div class="card">
					<form:form method="POST" action="signin.do" modelAttribute="loginForm">
					<!-- 2. 이리로 온다 -->
						<div class="card-header">로그인 폼</div>
						<div class="card-body">
						<c:choose>
							<c:when test="${param.error eq 'fail' }">
								<div class="alert alert-danger">
									<strong>로그인 실패</strong> 아이디 혹은 비밀번호가 올바르지 않습니다
								</div>
							</c:when>
							<c:when test="${param.error eq 'deny' }">
								<div class="alert alert-danger">
									<strong>인증 실패</strong> 해당 서비스는 로그인 후 사용 가능합니다
								</div>
							</c:when>
							<c:when test="${param.error eq 'role' }">
								<div class="alert alert-danger">
									<strong>접근권한 부족</strong> 해당 서비스의 접근권한이 없습니다
								</div>
							</c:when>
						</c:choose>
							<div class="form-group">
								<label>아이디</label>
								<!-- LoginForm의 변수명이 path로 들어감 -->
								<form:input path="userId" class="form-control" id="user-id"/>
								<form:errors path="userId" cssClass="text-danger"/>
							</div>
							<div class="form-group">
								<label>비밀번호</label>
								<form:password path="userPwd" class="form-control" id="user-pwd"/>
								<form:errors path="userPwd" cssClass="text-danger" />
							</div>
						</div>
						<div class="card-footer">
							<a href="/home.do" class="btn btn-secondary">취소</a>
							<button type="submit" class="btn btn-primary">로그인</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>

</html>