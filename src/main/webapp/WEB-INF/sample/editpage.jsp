<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>編集画面</title>
<%@ include file="../common/common.jsp"%>
<script type="text/javascript" src="${contextPath}/script/sample.js"></script>
</head>
<body>
	<h1 class="text-center">
		<font color="red">これは、編集画面です。</font>
	</h1>
	<div class="container mt-4">
		<form:form modelAttribute="sampleForm" action="${contextPath}/sample" method="post">
			<div class="card">
				<div class="card-header">
					<span>編集更新</span> <a name="" id="" class="btn btn-link float-right" href="${contextPath}/sample/back/init">戻る</a>
				</div>
				<div class="card-body">
					<div class="form-group">
						<label for="">番号</label>
						<form:input cssClass="form-control" path="id" readonly="true" />
					</div>
					<div class="form-group">
						<label for="">名称</label>
						<form:input cssClass="form-control" path="name" />
					</div>
					<div class="form-group">
						<label for="">説明</label>
						<form:textarea cssClass="form-control" rows="3" path="remark" />
					</div>
					<div class="form-group">
						<label>携帯</label>
						<div class="form-control">
							<div class="form-check form-check-inline">
								<label class="form-check-label"> <form:checkbox cssClass="form-check-input" path="phoneType" value="SoftBank" />SoftBank
								</label>
							</div>
							<div class="form-check form-check-inline">
								<label class="form-check-label"> <form:checkbox cssClass="form-check-input" path="phoneType" value="DoCoMo" />DoCoMo
								</label>
							</div>
						</div>
					</div>
				</div>
				<div class="card-footer text-muted">
					<button type="button" id="btn_delete" class="btn btn-secondary float-right mr-2">削除</button>
					<button type="button" id="btn_update" class="btn btn-primary float-right mr-2">更新</button>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>