<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function fn_updateCategoryPage(f){
		f.action='updateCategoryPage';
		f.submit();
	}
	
	function fn_deleteCategory(f){
		if(confirm('삭제하시겠습니까?')){
			f.action='deleteCategory';
			f.submit();
		}else{
			return;
		}
	}
</script>
</head>
<body>
	<div class="wrap">
		<table border="1">
			<thead>
				<caption>전체 : ${totalCount }개 카테고리</caption>
				<tr>
					<td>카테고리 번호</td>
					<td>카테고리 이름</td>
					<td>수정/삭제</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${empty list }">
					<tr>
						<td colspan="3">카테고리 없음</td>
					</tr>
				</c:if>
				<c:if test="${not empty list }">
					<c:forEach var="cDTO" items="${list }">
						<tr>
							<td>${cDTO.cNo }</td>
							<td>${cDTO.cName }</td>
							<!--  -->
							<td>
								<form>
										<input type="button" value="수정" onclick="fn_updateCategoryPage(this.form)"/>
										<input type="button" value="삭제" onclick="fn_deleteCategory(this.form)"/>
										<input type="hidden" name="cNo" value="${cDTO.cNo }"/>
										<input type="hidden" name="cName" value="${cDTO.cName }"/>
								</form>
							</td>
							
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
		<form action="insertCategory">
			<table>
				<caption>새 카테고리 입력</caption>
				<tbody>
					<tr>
						<td><input type="text" name="cNo" placeholder="2자리 숫자 입력"></td>
						<td><input type="text" name="cName" placeholder="ex)남성_shirts"></td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="submit" value="입력완료"/>
							<input type="reset" value="다시 작성"/>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>