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
    $("#telephone").keyup(function () {

        var phone_v = $(this).val();

        if (phone_v.length >= 11) {

            $(this).val(phone_v.substr(0, 11));

        }

        $(this).val($(this).val().replace(/[^0-9.]/g, ''));

    });


});
