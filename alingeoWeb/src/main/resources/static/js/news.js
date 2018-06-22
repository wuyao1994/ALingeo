$(function(){
	 $(".show li a img").mouseenter(function(){
   	  $(this).addClass("animated rotateIn");
   	  setTimeout('$(".show li a img").removeClass("animated rotateIn")','500')
   })
})