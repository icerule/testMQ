<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${welcome}</title>
    </head>

    <body>
        <c:out value="${welcome}"></c:out>
		<div>
	        <span>下面是rabbit mq的三种传输模式</span>
	        <a href="${pageContext.request.contextPath}/msg/producer/direct.do"> direct模式 </a><br>
	        <a href="${pageContext.request.contextPath}/msg/producer/topic.do"> topic模式 </a><br>
	        <a href="${pageContext.request.contextPath}/msg/producer/fanout.do"> fanout模式 </a><br>
		</div>
    </body>
</html>