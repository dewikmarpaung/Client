$(document).ready(function(){
    var WTAPI = "http://localhost:8080/API/Quiz/getAllQuiz";
    $.ajax({
      url: WTAPI,
        type: "GET",
        dataType: "json",
        success: function (json) {
            console.log(json)
            $.each(json.data, function (i, item) {
                var index = i;
                console.log(item);

                if (i==0) {
                    $("<img>").attr("src", item.imageURL).css('height','200px').css('width','715px').css('padding','10px').appendTo($('<div>').appendTo($("#images")));
                }
                else {
                    $("<img>").attr("src", item.imageURL).css('height','170px').css('width','250px').css('padding','10px').appendTo($('<div>').appendTo($("#images")));
                }
            });
        }
    });

})
