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
<title>인사기록 목록</title>
</head>
<body>
	<center>
		<h1>인사기록 목록</h1>
		<h3>
			테스트님 환영합니다...<a href="logout.do">Log-out</a>
		</h3>
		<!-- 검색 시작 -->
		<form action="getHrList.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
							<option value="TITLE">제목
							<option value="CONTENT">내용
					</select> <input name="searchKeyword" type="text" /> <input type="submit"
						value="검색" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
		<table border="1" cellpadding="0" cellspacing="0" width="1000">
			<tr>
				<th bgcolor="orange" width="50">번호</th>
				<th bgcolor="orange" width="100">이름</th>
				<th bgcolor="orange" width="100">생년월일</th>
				<th bgcolor="orange" width="100">입사일자</th>
				<th bgcolor="orange" width="50">성별</th>
				<th bgcolor="orange" width="350">주소</th>
				<th bgcolor="orange" width="150">전화번호</th>
				<th bgcolor="orange" width="100">부서</th>
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
		<br> <a href="insertHr.jsp">인사기록 등록</a>
	</center>
</body>
</html>