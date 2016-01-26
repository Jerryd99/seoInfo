<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>产品列表</title>
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
		caption{
			text-align: center;
			font-weight: bold;
			font-size: 22px;
			color: #000;
		}
    .intro {
      font-weight: bold;
    }
    .tr1 {
      background-color: #52bea6;
    }
    .tr2 {
      background-color: #68ba8a;
    }
    .tr3 {
      background-color: #47c18a;
    }
    .tdWidth{
      width: 140px;
    }
    </style>
  </head>
  <body>
  	<table class="table table-bordered">
   		<caption>${projName}</caption>
   		<tbody>
         <tr class='tr1'>
            <td class="intro tdWidth" style="border-right:none;">产品介绍:</td>
            <td  style="border-left:none;"></td>
        </tr>
		
     <c:forEach items="${projDesList}" var="projDes">
      	<tr>
         	<td class="tdWidth">${projDes.title }</td>
			<td>${projDes.content }</td>
      	</tr>
		</c:forEach>
      		
          <tr class='tr2'>
            <td class="intro tdWidth" style="border-right:none;">产品报价</td>
            <td style="border-left:none;"></td>
          </tr>

          <tr>
            <td class="tdWidth">${priceDes}</td>
			<td><a href="${pageContext.request.contextPath }/info/download/${priceFileName}">${priceFileName}</a></td>
          </tr>

          <tr class='tr3'>
            <td class="intro tdWidth" style="border-right:none;">产品介绍资料</td>
            <td style="border-left:none;"></td>
          </tr>
          <tr>
            <td class="tdWidth">${detailDes}</td>
			<td><a href="${pageContext.request.contextPath }/info/download/${detailFileName}">${detailFileName}</a></td>
          </tr>
   		</tbody>
	</table>
  </body>
</html>