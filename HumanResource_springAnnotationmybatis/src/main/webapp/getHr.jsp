<%@page import="com.mvc.biz.hr.impl.HrDAO"%>
<%@page import="com.mvc.biz.hr.HrVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�λ��� ��</title>
</head>
<body>
	<center>
		<h1>�λ��� ��</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateHr.do" method="post">
			<input name="seq" type="hidden" value="${hr.seq}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">�̸�</td>
					<td align="left"><input name="name" type="text"
						value="${hr.name}" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">�������</td>
					<td align="left"><input name="sbirt" type="date"
						value="${hr.birt}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">�Ի�����</td>
					<td align="left"><input name="shrdt" type="date"
						value="${hr.hrdt}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">����</td>
					<td><select id="sung" name="sung">
							<option value="����" <c:if test="${hr.sung == '����'}">selected</c:if>>����</option>
							<option value="����" <c:if test="${hr.sung == '����'}">selected</c:if>>����</option>
						</select>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">�ּ�</td>
					<td align="left"><input name="addr" type="text"
						value="${hr.addr}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">��ȭ��ȣ</td>
					<td align="left"><input name="tele" type="text"
						value="${hr.tele}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">�μ�</td>
					<td align="left"><input name="dept" type="text"
						value="${hr.dept}"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="�λ��� ����" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertHr.jsp">�λ��� ���</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteHr.do?seq=${hr.seq }">�λ��� ����</a>&nbsp;&nbsp;&nbsp;
		<a href="getHrList.do">�λ��� ���</a>
	</center>
</body>
</html>
