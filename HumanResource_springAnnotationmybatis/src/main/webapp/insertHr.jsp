<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�λ��ϵ��</title>
</head>
<body>
	<center>
		<h1>�λ��� ���</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertHr.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="16">����</td>
					<td align="left"><input type="text" name="name" size="10"/></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">�������</td>
					<td align="left"><input type="date" name="sbirt" size="10"/></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">�Ի�����</td>
					<td align="left"><input type="date" name="shrdt" size="10"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">����</td>
					<td><select id="sung" name="sung">
							<option value="����" selected="selected">����</option>
							<option value="����">����</option>
						</select>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">�ּ�</td>
					<td align="left"><input type="text" name="addr" size="30" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">��ȭ��ȣ</td>
					<td align="left"><input type="text" name="tele" size="13" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">�μ�</td>
					<td align="left"><input type="text" name="dept" size="16" /></td>
				</tr>
				<tr>
					<td colspan=2 align="center"><input type="reset"
						value=" �ʱ�ȭ " /></td>
				</tr>
				<tr>
					<td colspan=2 align="center"><input type="submit"
						value=" �λ� ��� " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getHrList.do">�λ� ��� ����</a>
	</center>
</body>
</html>