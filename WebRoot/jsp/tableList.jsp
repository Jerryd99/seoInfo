<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no"/>
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
 .table>tbody>tr>td {
        	vertical-align: middle;
        }
        .first{
        	width:24%;
        	color:#fff;
        	text-align:center;
        }
        .second{
        	width:40%;
        	color:#fff;
        	text-align:center;
        }
        .four{
        	width:18%;
        	color:#fff;
        	text-align:center;
        }
        .five{
        	width:18%;
        	color:#fff;
        	text-align:center;
        }
        hr{
        	width:90%;
        }
    </style>
  </head>
  <body>

<c:forEach items="${tablesList }" var="table">  
  	<table id="${table.tableId}" class="table table-bordered table-striped">
   		<caption><a href="">${table.tableName}</a></caption>
   		<thead class="th1">
      		<tr>
         		<th class="first">项目分类</th>
         		<th class="second">达标率</th>
         		<th class="four">更新</th>
         		<th class="five">详情</th>
      		</tr>
   		</thead>
   		<tbody>
   		
   		<c:forEach items="${table.projs}" var="proj">
      		<tr>
         		<td style="text-align:center;" class="td1">${proj.projName }</td>
         		<td style="text-align:center;">
				<script>
				var str = '${proj.rateResult }';
				if(str !== null || str !== undefined || str !== ''){
			    	for(var index in str.split(";")){
			    		document.write(str.split(";")[index]+'<br/>');
				    }
			    }
			   	</script>
			    </td>
         		<td style="text-align:center;"><fmt:formatDate value="${proj.updateTime}" pattern="MM-dd"/></td>
         		<td style="text-align:center;"><a href="${pageContext.request.contextPath }/info/items/${proj.projId}">查看</a></td>
      		</tr>
		</c:forEach>
   		</tbody>
	</table>
	<hr>
</c:forEach>
<br/><br/><br/>
  </body>
</html>