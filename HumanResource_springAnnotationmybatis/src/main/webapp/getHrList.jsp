<%@page import="java.util.List"%>
<%@page import="com.mvc.biz.hr.impl.HrDAO"%>
<%@page import="com.mvc.biz.hr.HrVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�λ��� ���</title>
</head>
<body>
	<center>
		<h1>�λ��� ���</h1>
		<h3>
			�׽�Ʈ�� ȯ���մϴ�...<a href="logout.do">Log-out</a>
		</h3>
		<!-- �˻� ���� -->
		<form action="getHrList.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
							<option value="TITLE">����
							<option value="CONTENT">����
					</select> <input name="searchKeyword" type="text" /> <input type="submit"
						value="�˻�" /></td>
				</tr>
			</table>
		</form>
		<!-- �˻� ���� -->
		<table border="1" cellpadding="0" cellspacing="0" width="1000">
			<tr>
				<th bgcolor="orange" width="50">��ȣ</th>
				<th bgcolor="orange" width="100">�̸�</th>
				<th bgcolor="orange" width="100">�������</th>
				<th bgcolor="orange" width="100">�Ի�����</th>
				<th bgcolor="orange" width="50">����</th>
				<th bgcolor="orange" width="350">�ּ�</th>
				<th bgcolor="orange" width="150">��ȭ��ȣ</th>
				<th bgcolor="orange" width="100">�μ�</th>
			</tr>
			<c:forEach items="${hrList}" var="hr">
				<tr>
					<td>${hr.seq }</td>
					<td align="left"><a href="getHr.do?seq=${hr.seq }">
							${hr.name }</a></td>
					<td>${hr.birt }</td>
					<td>${hr.hrdt }</td>
					<td>${hr.sung }</td>
					<td>${hr.addr }</td>
					<td>${hr.tele }</td>
					<td>${hr.dept }</td>
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertHr.jsp">�λ��� ���</a>
	</center>
</body>
</html>