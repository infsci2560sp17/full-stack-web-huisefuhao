$(function ()) {
	var url = this.location.href;
	url = url.split('#')
	var a = url[url.length-1];
	refishUrl(a);
});
fuction refishUrl(tvalue){
	swith (tvalue) {
		case 'showrooms':
			liloop("nav li", "rooms", "showrooms");
			window.location.href = "/nav#showrooms";
			break;
		case 'showactivity':
			liloop("nav li", "activity", "showactivity");
			window.location.href = "/nav#showactivity";
			break;
		case 'showbreakfast':
			liloop("nav li", "breakfast", "showbreakfast");
			window.location.href = "/nav#showbreakfast";
			break;
		case 'showreservation':
			liloop("nav li", "reservation", "showreservation");
			window.location.href = "/nav#showreservation";
			break;
	}
};
fuction liloop(liclass, name, divname) {
	$("." + licalss).each(fuction (){
		var classname = $(this).attr("class"):
		if (classname == name) {
			$(this).removeClass(classname);
			$(this).addClass(classname+"c");
			$(this).siblings().each(function(){
				var sibname = $(this).attr("class");
				var sibname = sibname.substr(sibname.length-1,1);
				if(sibnamed == "c"){
					$(this).removeClass(sibname);
					$(this).addClass(sibname.substr(0,sibname.length-1));
				}
			});
		}
	});
	$("#showrooms").hide();
	$("#showactivity").hide();
	$("#showbusiness").hide();
	$("#showreservation").hide();
	$("#"+divname).show();
}