$(function() {
    $("#btnserch").click(function () {
        var data = {},
            url = "/AlgCenter";
        data = {
            "city": $('#centername').val()
        }
        $.post(url,data,function (result) {
        });

    });

    $("input").keydown(function(e){
        if (e.keyCode == 13) {
            var data = {},
                url = "/AlgCenter";
            data = {
                "city": $('#centername').val()
            }
            $.post(url,data,function (result) {
            });
        }
    });
});