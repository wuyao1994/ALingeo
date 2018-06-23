$(function() {
    $("#formsubmit").click(function () {
       var from = $(".join-form"),
            url = "/JoinUs/create",
            data = from.serialize();
       $.post(url, data, function (result) {
           if (result == "success") {
               alert("提交成功");
               window.location.reload();
           }

       })
    });
});
