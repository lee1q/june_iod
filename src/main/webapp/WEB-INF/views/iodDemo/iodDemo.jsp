<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
table {
	width: 100%;
}

table th {
	border: 1px;
	border-color: black;
	border-style: solid;
}

table td {
	border: 1px;
	border-color: black;
	border-style: solid;
}
</style>
</head>
<body>
	<div>�����Ķ����1 : [${pageVariable}]</div>
	<table>
		<thead>
		<colgroup>
			<col style="width: 10%;">
			<col style="width: 30%;">
			<col style="width: 50%;">
			<col style="width: 10%;">
		</colgroup>
			<tr>
				<th>��ȣ</th>
				<th>����</th>
				<th>��೻��</th>
				<th>�󼼳���</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="item" items="${versionList}" step="1"
				varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${item.version}</td>
					<td>${item.summary}</td>
					<td>${item.comment}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>