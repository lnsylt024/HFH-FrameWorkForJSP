<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>新規画面</title>
<%@ include file="../common/common.jsp"%>
</head>
<body>
	<h1 class="text-center">
		<font color="red">これは、新規画面です。</font>
	</h1>
	<div class="container mt-4">
		<form method="post" action="${contextPath}/sample/add">
			<div class="card">
				<div class="card-header">
					<span>新規登録</span> <a name="" id="" class="btn btn-link float-right" href="${contextPath}/sample/back/init">戻る</a>
				</div>
				<div class="card-body">
					<div class="form-group">
						<label for="">名称</label> <input id="" class="form-control" type="text" name="name">
					</div>
					<div class="form-group">
						<label for="">説明</label>
						<textarea id="" class="form-control" name="remark" rows="3"></textarea>
					</div>
					<div class="form-group">
						<label>携帯</label>
						<div class="form-control">
							<div class="form-check form-check-inline">
								<label class="form-check-label"> <input class="form-check-input" type="checkbox" name="phoneType" id="" value="SoftBank"> SoftBank
								</label>
							</div>
							<div class="form-check form-check-inline">
								<label class="form-check-label"> <input class="form-check-input" type="checkbox" name="phoneType" id="" value="DoCoMo"> DoCoMo
								</label>
							</div>
						</div>
					</div>
				</div>
				<div class="card-footer text-muted">
					<button type="submit" class="btn btn-primary float-right">登録</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>