$(function(){
	$(".show li a img").mouseenter(function(){
		$(this).addClass("animated rotateIn");
		setTimeout('$(".show li a img").removeClass("animated rotateIn")','500')
	});
    $(function(){
        //总数目
        var length = $("#hiddenresult .show").length;

        $("#Pagination").pagination(length, {
            num_edge_entries: Math.ceil(length/4),
            num_display_entries: 2,
            callback: pageselectCallback,
            items_per_page:4
        });

        // 按钮事件
        $("#setoptions").click(function(){
            $("#Pagination").pagination(length, {
                num_edge_entries: Math.ceil(length/4),
                num_display_entries: 2,
                callback: pageselectCallback,
                items_per_page:4
            });
        });

        function pageselectCallback(page_index, jq){
            // 从表单获取每页的显示的列表项数目
            var items_per_page = 4;
            var max_elem = Math.min((page_index+1) * items_per_page, length);

            $("#Searchresult ul").html("");
            // 获取加载元素
            for(var i=page_index*items_per_page;i<max_elem;i++){
                $("#Searchresult ul").append($("#hiddenresult .show:eq("+i+")").clone());
            }
            //阻止单击事件
            return false;
        }
    });
});