﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>错误提示</title>

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
<!--${message }  -->
<h1>警告：您没有浏览权限, 请联系闻道！</h1>

</body>
</html>