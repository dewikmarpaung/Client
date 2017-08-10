var api = "http://localhost:8080/API/Quiz/getQuiz/";
var resultAPI = "http://localhost:8080/API/Quiz/ShowResultQuiz";

    var url = new URL(window.location.href);
    var id = url.searchParams.get("idQuiz");
    var result = "";
    var resultSplit;

    $.ajax({
        url: api + id,
        type: "GET",
        dataType: "json",
        success: function (json) {
            var wrapper = document.createElement("div");
            wrapper.className = "wrapper";

            var questionWrapper;
            var optionWrapper_3;
            var optionWrapper_2;
            var optionWrapper;
            var optionContainer;
            var optionList;
            var subOption;
            var option;
            var checkboxOption;

            //console.log("id Quiz : " +json.data[0].idQuiz);     //show id quiz
            //judul quiz
            var judulElement = json.data[0].judulQuiz;
            var judulQuiz = document.createElement("div");
            $("<h1>").html(judulElement)
                .attr('id-quiz',json.data[0].idQuiz)
                .css('font-size', '60px')
                .css('margin', '10px')
                .appendTo(judulQuiz);

            //image quiz
            var imageElement  = json.data[0].imageURL;
            var imageQuiz = document.createElement("div");
            $("<img>").attr("src", imageElement)
                .attr('id-quiz',json.data[0].idQuiz)
                .css('height','270px')
                .css('width','700px')
                .css('margin', '10px')
                .appendTo(imageQuiz);

            wrapper.appendChild(judulQuiz);
            wrapper.appendChild(imageQuiz);

            //array questions
            var questions = json.data[0].questions;

            //loop array questions
            $.each(questions, function (i, item) {
                console.log("idQuestion : " +item.idQuestion);      //show id question

                //array options
                var options = questions[i].options;

                //nampung pertanyaan
                questionWrapper = document.createElement("div");
                questionWrapper.className= "questionWrapper";

                $("<h2>").html(item.question)
                    .attr('id-question',item.idQuestion)
                    .css('margin', '10px')
                    .appendTo(questionWrapper);


                optionWrapper_3 = document.createElement("div");
                optionWrapper_3.className = "optionWrapper_3";

                optionWrapper_2 = document.createElement("div");
                optionWrapper_2.className = "optionWrapper_2";

                optionWrapper = document.createElement("div");
                optionWrapper.className = "optionWrapper";

                optionContainer = document.createElement("ul");
                optionContainer.className = "optionContainer";

                //loop array options
                $.each(options, function (j, obj) {

                    console.log("idOption : " +obj.idOption);

                    optionList = document.createElement("li");
                    optionList.className = "optionList";

                    subOption = document.createElement("div");
                    subOption.className = "subOption";

                    option = document.createElement("div");
                    option.className = "option";

                    checkboxOption = document.createElement("div");
                    checkboxOption.className = "checkboxOption";

                    var lengthOptions = options.length;

                    if (obj.imageURL != null) {     //kalo option image
                        if (lengthOptions % 3 == 0 || lengthOptions == 5) {
                            $("<img>").attr("src", obj.imageURL)
                                .attr('id-option',obj.idOption)
                                .attr('id-question',item.idQuestion)
                                .css('width','100%')
                                .appendTo(option);
                        } else if (lengthOptions % 2 == 0) {
                            $("<img>").attr("src", obj.imageURL)
                                .attr('id-option',obj.idOption)
                                .attr('id-question',item.idQuestion)
                                .css('width','70%')
                                .appendTo(option);
                        }

                        $(checkboxOption).append($("<input type='checkbox'>")
                            .attr('id', 'test')
                            .attr('id-option', obj.idOption)
                            .attr('id-question',item.idQuestion)
                            .css('margin-top', '10px')
                            .css('height', '20px')
                            .css('width', '20px')
                            .click(function () {
                                $(this).attr('checked',true);
                                //$(this).parents('.optionList').css('border', '2px solid green');
                                $(this).parents('.optionList').attr('id', obj.idOption);

                                var childs = $(this).parents('.optionContainer').find('li');
                                var input = $(this).parents('.optionContainer').find('input');

                                //alert(childs.length);
                                for (var i=0; i<childs.length; i++) {
                                    //console.log("id child : " + childs.attr('id'))

                                    if(childs[i].id != 0)
                                    {
                                            result += childs[i].id + ",";
                                            console.log(childs[i].id);
                                    }else {
                                        input[i].disabled='true';
                                        // console.log(childs[i].find('input').disabled);
                                    }


                                }
                                console.log(childs.length);
                                alert(result);

                            })
                        );


                    } else {        //kalo option text
                        $("<h4>").html(obj.text)
                            .attr('id-option',obj.idOption)
                            .attr('id-question',item.idQuestion)
                            .appendTo(option);

                        $(checkboxOption).append($("<input type='checkbox'>")
                            .attr('id', 'test')
                            .attr('id-option', obj.idOption)
                            .attr('id-question',item.idQuestion)
                            .css('margin-top', '10px')
                            .css('height', '20px')
                            .css('width', '20px')
                            .click(function () {
                                $(this).attr('checked',true);
                                //$(this).parents('.optionList').css('border', '2px solid green');
                                $(this).parents('.optionList').attr('id', obj.idOption);

                                var childs = $(this).parents('.optionContainer').find('li');
                                var input = $(this).parents('.optionContainer').find('input');

                                for (var i=0; i<childs.length; i++)
                                {
                                    if(childs[i].id != 0){
                                        console.log(childs[i].id);

                                    }else {
                                        input[i].disabled='true';
                                        // console.log(childs[i].find('input').disabled);
                                    }
                                }

                            })
                        );
                    }

                    subOption.appendChild(option);
                    subOption.appendChild(checkboxOption);
                    optionList.appendChild(subOption);
                    optionContainer.appendChild(optionList);
                    // optionWrapper.appendChild(optionContainer);

                    if (lengthOptions % 3 == 0 || lengthOptions == 5) {
                        optionWrapper_3.appendChild(optionContainer);
                        optionWrapper.appendChild(optionWrapper_3);
                    } else if (lengthOptions % 2 == 0){
                        optionWrapper_2.appendChild(optionContainer);
                        optionWrapper.appendChild(optionWrapper_2);
                    }



                });

                questionWrapper.appendChild(optionWrapper);

                /*questionWrapper.appendChild(optionWrapper_2);
                questionWrapper.appendChild(optionWrapper_3);
*/
                wrapper.appendChild(questionWrapper);

            });

            $('#list_question').append(wrapper);

        }
    });


$( document ).ready(function()
{
    var wrapper = document.createElement("div");
    wrapper.className = "button";
    $( "#button" ).click(function()
    {
       // $( "div" ).show( "slow" );
        $.ajax
        ({
            url: resultAPI,
            type: "POST",
            dataType :"json",
            data : jQuery.param({idQuiz : id, idOption : result}),
            success: function (json)
            {
                $.each(json.data, function (i, item)
                {
                    id = item.idQuiz;
                    var value = document.createElement("div");
                    $("<h3>").html(item.value)
                        .attr('data-id',item.idQuiz)
                        .css('height','100px')
                        .css('width','400px')
                        .css('margin-left', '6px')
                        .css('margin-top', '4px ')
                        .appendTo(value);

                    var description = document.createElement("div");
                    $("<h5>").html(item.description)
                        .attr('data-id',item.idQuiz)
                        .css('height','100px')
                        .css('width','400px')
                        .css('margin-left', '42px')
                        .css('margin-top', '-63px')
                        .appendTo(description);


                    var image = document.createElement("div");
                    $("<img>").attr("src", item.imageURL)
                        .attr('data-id',item.idQuiz)
                        .css('height','287px')
                        .css('width','574px')
                        .css('padding','15px')
                        .css('margin-top', ' -82px')
                        .css('margin-left', '25px')
                        .appendTo(image);

                    var wrapper = document.createElement("div");
                    wrapper.className = "hasil";

                    wrapper.appendChild(value);
                    wrapper.appendChild(description);
                    wrapper.appendChild(image);

                    // wrapper.css('border', '2px solid green');

                    $('#result').css({
                        "border-width": "4px",
                    "border-style" : "double",
                    "margin-top": "32px",
                    "margin-left": "-14px",
                    "margin-right": "107px",
                        "border-color": "#5bc0de"
                    }).append(wrapper).show();
                    $('#word').append(item.rightAnswer).append(" from ").append(item.totalQuestion).show()

                });

                console.log( "ready!" );
            }

        })
    });



});







