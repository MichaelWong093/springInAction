<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
    <h1>Welcome to Spittr</h1>

    <c:forEach items="${spittleList}" var="item">
        <li>
            <div>
                <c:out value="${item.message}"/>
            </div>
            <div>
                <c:out value="${item.time}"/>
            </div>
        </li>
    </c:forEach>
</body>
</html>