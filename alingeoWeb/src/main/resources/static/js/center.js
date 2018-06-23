$(function() {
    $("#btnserch").click(function (e) {
        var data = {},
            url = "/AlgCenter",
            city= $('#centername').val();
        window.location.href="/AlgCenter?city="+city;

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