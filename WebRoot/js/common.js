

(function() {
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
    	var hash=location.hash;
    	$(hash)[0].scrollIntoView();
       wx.hideOptionMenu();
    });
})();
