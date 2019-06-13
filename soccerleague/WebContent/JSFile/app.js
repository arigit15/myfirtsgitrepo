/**
 * 
 */

function validateForm() {
	var x=document.forms["myForm"]["title"].value;
	var y=document.forms["myForm"]["year"].value
	if(x==""){
		alert("Title must be filled out!!");
	return false;
	}
	if(y==""){
		alert("Year must be filled out!!");
		return false;
	}
}