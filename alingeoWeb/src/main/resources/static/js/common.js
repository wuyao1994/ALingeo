$(function(){
	//返回顶部
     $('.return_top').click(function(){
         $('html , body').animate({scrollTop: 0},'slow');
     });
    //二维码隐藏显示
     $(".pop-img img").hide();
     
     $(".menu ul li").mouseenter(function(){
     	$(this).css("margin-left","15px")
     	$(this).find("img").show();
     });
     
     $(".menu ul li").mouseleave(function(){
     	$(this).css("margin-left","30px")
     	$(this).find("img").hide();
     });
     // 	地球跳动
	  setInterval(function(){
	  	$(".icons").addClass("animated bounce")
	  	setTimeout('$(".icons").removeClass("animated bounce")','1000')
	  },5000); 
     
});