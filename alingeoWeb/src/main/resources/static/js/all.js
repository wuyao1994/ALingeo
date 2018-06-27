$(function() {
    $("#formsubmit").click(function () {
       var from = $(".join-form"),
            url = "/JoinUs/create",
            data = from.serialize();
       if (!check()) {
           return false;
       } else {
           $.post(url, data, function (result) {
               if (result == "success") {
                   simpleAlert({
                       "content":"我们的老师将尽快与您取得联系,请保持通讯畅通!",
                       "buttons":{
                           "确定":function () {
                               window.location.reload();
                           }
                       }
                   })
               }

           })
       }
    });

    function simpleAlert(opts) {
        //设置默认参数
        var opt = {
            "closeAll": false,
            "title": "提示",
            "content": "",
            "buttons": {}
        }
        //合并参数
        var option = $.extend(opt, opts);
        //事件
        var dialog = {}
        var $simpleAlert = $('<div class="simpleAlert">');
        var $shelter = $('<div class="simpleAlertShelter">');
        var $simpleAlertBody = $('<div class="simpleAlertBody">');
        var $simpleAlertBodyClose = $('<div class="simpleAlertBodyClose">✕</div>');
        var $simpleAlertBodyTitle = $('<p class="simpleAlertBodyTitle">' + option.title + '</p>');
        var $simpleAlertBodyContent = $('<p class="simpleAlertBodyContent">' + option.content + '</p>');
        dialog.init = function () {
            $simpleAlertBody.append($simpleAlertBodyClose).append($simpleAlertBodyContent).append($simpleAlertBodyTitle);
            var num = 0;
            var only = false;
            var onlyArr = [];
            for (var i = 0; i < 2; i++) {
                for (var key in option.buttons) {
                    switch (i) {
                        case 0:
                            onlyArr.push(key);
                            break;
                        case 1:
                            if (onlyArr.length <= 1) {
                                only = true;
                            } else {
                                only = false;
                            }
                            num++;
                            var $btn = $('<button class="simpleAlertBtn simpleAlertBtn' + num + '">' + key + '</button>')
                            $btn.bind("click", option.buttons[key]);
                            if (only) {
                                $btn.addClass("onlyOne")
                            }
                            $simpleAlertBody.append($btn);
                            break;
                    }

                }
            }
            $simpleAlert.append($shelter).append($simpleAlertBody);
            $("body").append($simpleAlert);
            $simpleAlertBody.show().animate({"marginTop":"-128px","opacity":"1"},300);
        }
        //右上角关闭按键事件
        $simpleAlertBodyClose.bind("click", function () {
            option.closeAll=false;
            dialog.close();
        })
        dialog.close = function () {
            if(option.closeAll){
                $(".simpleAlertBody").animate({"marginTop": "-188px", "opacity": "0"}, 200, function () {
                    $(".simpleAlert").remove()
                });
                $(".simpleAlertShelter").animate({"opacity": "0"}, 200);
            }else {
                $simpleAlertBody.animate({"marginTop": "-188px", "opacity": "0"}, 200, function () {
                    $(".simpleAlert").last().remove()
                });
                $shelter.animate({"opacity": "0"}, 200);
            }
        }
        dialog.init();
        return dialog;
    }

    function check(){
        var name = $.trim($("#name").val());
        var mobile = $.trim($("#telephone").val());
        var email = $.trim($("#email").val());
        var comment = $.trim($("#content").val());
        var myreg1 = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
        var myreg2 = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;

        if(name == "") {
            alert("姓名不能为空！");
            return false;
        }
        if(!myreg1.test(mobile)) {
            alert("请输入正确的手机号！");
            return false;
        }
        if(!myreg2.test(email)) {
            alert("请输入有效的邮箱！");
            return false;
        }
        if(comment == "") {
            alert("内容不能为空！");
            return false;
        }
        return true;
    }
});
