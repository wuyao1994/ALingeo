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
                   alert("提交成功");
                   window.location.reload();
               }

           })
       }
    });

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
    }
});
