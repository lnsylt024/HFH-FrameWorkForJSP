<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>一覧画面</title>
<%@include file="../common/common.jsp"%>
</head>
<body>
	<h1>
		<font color="red">これは、一覧画面です。<%=request.getContextPath() %></font>
	</h1>
	<div class="container mt-4">
		<nav class="navbar navbar-light bg-light">
			<a href="<%=cntPath%>/sample/append" class="btn btn-success">新規登録</a>
			<form name="searchForm" class="form-inline" action="${pageContext.request.contextPath}/sample/search" method="post">
				<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="searchkey">
				<button id="btn_search" class="btn btn-outline-success my-2 my-sm-0" type="submit">検索</button>
			</form>
		</nav>
		<div>
			<table class=" table mt-2 ">
				<thead>
					<tr>
						<th>番号</th>
						<th>名称</th>
						<th>説明</th>
						<th>イベント</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="data" items="${sampledata}">
						<tr>
							<td>${data.id}</td>
							<td>${data.name}</td>
							<td>${data.remark}</td>
							<td><a href="${contextPath}/sample/edit/${data.id}" class="btn btn-danger ">編集</a> <a href="${contextPath}/sample/delete/${data.id}" class="btn btn-secondary ">削除</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<nav aria-label="Page navigation example">
			<ul class="pagination">
				<li class="page-item"><a class="page-link" href="#">Previous</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">Next</a></li>
			</ul>
		</nav>
	</div>
</body>
</html>