<%@page import="com.mvc.biz.hr.impl.HrDAO"%>
<%@page import="com.mvc.biz.hr.HrVO"%>
<%@page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>인사기록 상세</title>
</head>
<body>
	<center>
		<h1>인사기록 상세</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateHr.do" method="post">
			<input name="seq" type="hidden" value="${hr.seq}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">이름</td>
					<td align="left"><input name="name" type="text"
						value="${hr.name}" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">생년월일</td>
					<td align="left"><input name="sbirt" type="date"
						value="${hr.birt}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">입사일자</td>
					<td align="left"><input name="shrdt" type="date"
						value="${hr.hrdt}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">성별</td>
					<td><select id="sung" name="sung">
							<option value="남자" <c:if test="${hr.sung == '남자'}">selected</c:if>>남자</option>
							<option value="여자" <c:if test="${hr.sung == '여자'}">selected</c:if>>여자</option>
						</select>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">주소</td>
					<td align="left"><input name="addr" type="text"
						value="${hr.addr}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">전화번호</td>
					<td align="left"><input name="tele" type="text"
						value="${hr.tele}"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">부서</td>
					<td align="left"><input name="dept" type="text"
						value="${hr.dept}"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="인사기록 수정" /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertHr.jsp">인사기록 등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteHr.do?seq=${hr.seq }">인사기록 삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getHrList.do">인사기록 목록</a>
	</center>
</body>
</html>
