<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<title>자유 게시판</title>
</head>
<body>

	<div class="container">
		<div class="row mt-3">
			<div class="col-12">
				<div class="card ">
					<div class="card-header">게시글 목록</div>
					<div class="card-body">
						<table class="table">
							<colgroup>
								<col width="10%">
								<col width="*">
								<col width="15%">
								<col width="15%">
								<col width="15%">
							</colgroup>
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>조회수</th>
									<th>등록일</th>
								</tr>
							</thead>
							<tbody>
							<!-- BoardController에 boards 라는 이름으로 담아놓은 값을 사용할것임 -->
							<c:choose>
								<c:when test="${empty boards}">
									<tr>
										<td colspan="5" class="text-center">게시글이 존재하지 않습니다</td>
									</tr>
								</c:when>
								<c:otherwise>
								<!-- 
									items="${boards} " 이런식으로 띄우면 오류남 (문자열 취급)
								 -->
									<c:forEach var="board" items="${boards}">
									<tr>
										<td>${board.no }</td>
										<!-- 사용자가 작성하는 것이기 때문에 악성 코딩 방지를 위해 c:out으로 작성 -->
										<td><a href="likes.do?no=${board.no}"><c:out value="${board.title}"/></a></td>
										<!-- 여기도 원래 c:out -->
										<td>${board.writer}</td>
										<td>${board.likes}</td>
										<td><fmt:formatDate value="${board.createdDate}" /></td>
									</tr>
									</c:forEach>
								</c:otherwise>
							</c:choose>
							</tbody>
						</table>
					</div>
					<div class="card-footer">
<!-- 					<a href="form.do" class="btn btn-primary">새 글</a> -->
						<a href="add.do" class="btn btn-primary">새 글</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>