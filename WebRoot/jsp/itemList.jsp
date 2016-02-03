<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no" />
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>产品列表</title>
<!-- Bootstrap -->
<link href="${pageContext.request.contextPath }/css/bootstrap.min.css"
	rel="stylesheet">
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

.thWidth {
	width: 40%;
}
</style>
<script src="<%=request.getContextPath()%>/js/jquery-1.4.4.min.js"></script>
<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script>
$(function() {
    $.ajax({
        url: 'http://test.winndoo.com/php/wx.php?url='+encodeURIComponent(location.href.split('#')[0]),
        // url: Api.baseUrl + '/h5/op_wechat_generateJsTicket.jsonp?url='+encodeURIComponent(location.href.split('#')[0]),
        dataType: 'jsonp',
        contentType: "application/json",
        success: function (data) {
            // 通过config接口注入权限验证配置
            wx.config({
                debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
                appId: data.appid, // 必填，公众号的唯一标识
                timestamp: data.timestamp, // 必填，生成签名的时间戳
                nonceStr: data.nonceStr, // 必填，生成签名的随机串
                signature: data.signature, // 必填，签名
                jsApiList: ["onMenuShareTimeline", "onMenuShareAppMessage", "onMenuShareQQ", "onMenuShareWeibo", "onMenuShareQZone"] // 必填，需要使用的JS接口列表
            });
        }
    });


    wx.ready(function () {


       wx.hideOptionMenu();
    });
});
</script>
</head>
<body>
	

	<table class="table table-bordered table-striped">
		<caption>项目列表</caption>
		<thead class="th1">
			<tr>
				<th class="thWidth">项目分类</th>
				<th style="text-align: center;">查看详情</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${projsList}" var="proj">
				<tr>
					<td class="td1 thWidth">${proj.projName }</td>

					<td style="text-align: center;"><a
						href="${pageContext.request.contextPath }/info/items/${proj.projId}">查看</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br />
	<br />
	<br />
</body>

</html>