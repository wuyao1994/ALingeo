 $(function(){
   $(".lesson1").mouseenter(function(){
   	  $(".lesson1 img").addClass("animated bounceIn");
   	  setTimeout('$(".lesson1 img").removeClass("animated bounceIn")','500')
   });
   $(".lesson2").mouseenter(function(){
   	  $(".lesson2 img").addClass("animated bounceIn");
   	  setTimeout('$(".lesson2 img").removeClass("animated bounceIn")','500')
   });
   $(".lesson3").mouseenter(function(){
   	  $(".lesson3 img").addClass("animated bounceIn");
   	  setTimeout('$(".lesson3 img").removeClass("animated bounceIn")','500')
   });
   $(".lesson-btn").mouseenter(function(){
   	   $(this).addClass("animated swing");
   	  setTimeout('$(".lesson-btn").removeClass("animated swing")','500')
   });
	$(".a-icon").mouseenter(function(){
   	   $(this).addClass("animated rotateIn");
   	  setTimeout('$(".a-icon").removeClass("animated rotateIn")','500')
   });
	 $(".about-btn").mouseenter(function(){
		 $(this).addClass("animated swing");
		 setTimeout('$(".about-btn").removeClass("animated swing")','500')
	 });
 });
 