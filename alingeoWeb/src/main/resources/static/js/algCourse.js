$(function(){
	$(".a-icon img").mouseenter(function(){
   	   $(this).addClass("animated pulse");
   	  setTimeout('$(".a-icon img").removeClass("animated pulse")','500')
   })
	
	$(".pics").mouseenter(function(){
   	   $(this).addClass("animated bounceIn");
   	  setTimeout('$(".pics").removeClass("animated bounceIn")','500')
   })
})