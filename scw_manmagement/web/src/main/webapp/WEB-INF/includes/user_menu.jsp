<%--
  Created by IntelliJ IDEA.
  User: 陈明
  Date: 2019/7/29
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="col-sm-3 col-md-2 sidebar">
    <div class="tree">
        <ul style="padding-left:0px;" class="list-group">
            <li class="list-group-item tree-closed" >
                <a href="${ctp}/main.html"><i class="glyphicon glyphicon-dashboard"></i> 控制面板</a>
            </li>
            <c:forEach items="${menulist}" var="p_menu">
                <li class="list-group-item tree-closed">
                    <span><i class="${p_menu.icon}"></i> ${p_menu.name} <span class="badge" style="float:right">${fn:length(p_menu.childs)}</span></span>
                    <ul style="margin-top:10px;display:none;">
                        <c:forEach items="${p_menu.childs}" var="c_menu">
                        <li style="height:30px;">
                            <a href="${c_menu.url}"><i class="${c_menu.icon}"></i> ${c_menu.name}</a>
                        </li>

                        </c:forEach>
                    </ul>


                </li>
            </c:forEach>
            <li class="list-group-item tree-closed">
                <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 权限管理 <span class="badge" style="float:right">3</span></span>
                <ul style="margin-top:10px;display:none;">
                    <li style="height:30px;">
                        <a href="user.html"><i class="glyphicon glyphicon-user"></i> 用户维护</a>
                    </li>
                    <li style="height:30px;">
                        <a href="role.html"><i class="glyphicon glyphicon-king"></i> 角色维护</a>
                    </li>
                    <li style="height:30px;">
                        <a href="permission.html"><i class="glyphicon glyphicon-lock"></i> 许可维护</a>
                    </li>
                </ul>
            </li>

        </ul>
    </div>
</div>
</body>
</html>
