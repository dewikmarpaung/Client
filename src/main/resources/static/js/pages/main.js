$(document).ready(function(){
    var WTAPI = "http://localhost:8080/API/Quiz/getAllQuiz";
    $.ajax({
        url: WTAPI,
        type: "GET",
        dataType: "json",
        success: function (json) {
            var x = "";
            $.each(json.data, function (i, item) {
                var judul = item.judulQuiz;
                if (i==0) {
                    $("<img>").attr('data-id',item.idQuiz)
                        .attr("src", item.imageURL)
                        .css('height','200px')
                        .css('width','715px')
                        .css('padding','10px')
                        .css('list-style', 'none')
                        .appendTo($('<div>').appendTo($("#images")));
                }
                else {
                    $("<img>").attr('data-id',item.idQuiz)
                        .attr("src", item.imageURL)
                        .css('height','170px')
                        .css('width','250px')
                        .css('padding','10px')
                        .css('list-style', 'none')
                        .appendTo($('<div>').appendTo($("#images")));
                }


            });

        }
    });

   /* $.ajax({
       url: WTAPI,
        method: 'POST',
        dataType: "json",
        success: function(json) {
           $.each(json.data, function(i, item){
               $("<img>").attr("src", item.imageURL).css('height','200px').css('width','715px').css('padding','10px').appendTo($('<div>').appendTo($("#images")));
           });
        }
    });*/

   /* $("#list_quizzes").loadMore ({
        selector:'',
        limit: 3,
        load : 3,
        animate:true,
        animateIn: 'fadeInUp'
    });*/

    // $.ajax({
    //     url: WTAPI,
    //     type: "GET",
    //     dataType: "json",
    //     success: function (json) {
    //         $.each(json.data, function (i, item) {
    //             var judul = item.judulQuiz;
    //             $("<h4>").append(judul).appendTo($("#trendingQuiz"));
    //         });
    //     }
    // });


})
