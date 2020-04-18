$(function(){
	
	$("#btn_delete").on("click",function(){
		var action = $("#sampleForm").attr("action");
		var id = $("input[name=id]").val();
		$("#sampleForm").attr("action",action+"/delete/"+id);
		$("#sampleForm").submit();
	});
	
	$("#btn_update").on("click",function(){
		var action = $("#sampleForm").attr("action");
		$("#sampleForm").attr("action",action+"/update");
		$("#sampleForm").submit();
	});
	
});