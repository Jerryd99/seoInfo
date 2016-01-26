<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>产品列表</title>
    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        body {
          background: #fbfbfb;
        }

        .table {
          width: 90%;
          margin: 0 auto;
        }

        caption {
          text-align: center;
          font-weight: 900;
          font-size: 30px;
          color: #000;
        }
        caption a {
          color: #000;
        }
        .td1 {
          font-weight: bold;
        }
        .th1 {
          background-color: #52bea6;
        }

    </style>
  </head>
  <body>

<c:forEach items="${tablesList }" var="table">  
  	<table id="${table.tableId}" class="table table-bordered">
   		<caption><a href="">${table.tableName}</a></caption>
   		<thead class="th1">
      		<tr>
         		<th>项目分类</th>
         		<th>效果达标率</th>
         		<th>最新更新时间</th>
         		<th>查看详情</th>
      		</tr>
   		</thead>
   		<tbody>
   		
   		<c:forEach items="${table.projs}" var="proj">
      		<tr>
         		<td class="td1">${proj.projName }</td>
         		<td>${proj.rateResult }</td>
         		<td><fmt:formatDate value="${proj.updateTime}" pattern="yyyy-MM-dd"/></td>
         		<td><a href="${pageContext.request.contextPath }/info/produce/${proj.projId}">查看</a></td>
      		</tr>
		</c:forEach>
   		</tbody>
	</table>
</c:forEach>
  </body>
</html>