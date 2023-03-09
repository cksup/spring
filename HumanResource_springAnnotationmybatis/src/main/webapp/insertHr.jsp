<%@page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>인사기록등록</title>
</head>
<body>
	<center>
		<h1>인사기록 등록</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertHr.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="16">성명</td>
					<td align="left"><input type="text" name="name" size="10"/></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">생년월일</td>
					<td align="left"><input type="date" name="sbirt" size="10"/></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">입사일자</td>
					<td align="left"><input type="date" name="shrdt" size="10"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">성별</td>
					<td><select id="sung" name="sung">
							<option value="남자" selected="selected">남자</option>
							<option value="여자">여자</option>
						</select>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">주소</td>
					<td align="left"><input type="text" name="addr" size="30" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">전화번호</td>
					<td align="left"><input type="text" name="tele" size="13" /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">부서</td>
					<td align="left"><input type="text" name="dept" size="16" /></td>
				</tr>
				<tr>
					<td colspan=2 align="center"><input type="reset"
						value=" 초기화 " /></td>
				</tr>
				<tr>
					<td colspan=2 align="center"><input type="submit"
						value=" 인사 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getHrList.do">인사 목록 가기</a>
	</center>
</body>
</html>