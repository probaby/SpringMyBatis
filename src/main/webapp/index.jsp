<%@ page language="java" contentType="text/html; charset=gb2312"  
    pageEncoding="gb2312"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>  
<body>
<h2>Hello World!</h2>
<a href="${pageContext.request.contextPath }/controller/list?bookId=1">点击<a/>
Message:${i}
</body>
</html>
