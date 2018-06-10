$(function() {
    $('#myModal').modal('hide');

    $(".uploadImage").click(function () {
        var $this = $(this),
            id = $this.data('id');
        $("#myModal").modal("show");
        $('.newId').val(id);
        $('.submit').click(function () {
            $('.upload-from').submit();
        });
    });
});
