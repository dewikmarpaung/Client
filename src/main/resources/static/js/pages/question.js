var api = "http://localhost:8080/API/Quiz/getQuiz/";

    var url = new URL(window.location.href);
    var id = url.searchParams.get("idQuiz");
    var result = "";

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
                                var $this = $(this);
                                var childs = $(this).parents('.optionContainer').find('li');
                                var input = $(this).parents('.optionContainer').find('input');

                                if ($this.is(':checked')) {
                                    //alert('checked');
                                    $this.attr('checked',true);
                                    $(this).parents('.optionList').attr('id', obj.idOption);
                                    if(obj.idOption != 0){
                                        result += obj.idOption + ',';
                                    }
                                    for (var i=0; i<childs.length; i++) {
                                        /*childs.css('border', '2px solid green');
                                        if(childs[i].id != 0) {
                                            var id = childs[i].id;
                                            childs.removeAttr('css');
                                        }*/
                                        if(childs[i].id != 0){
                                            continue;
                                        }
                                        else {
                                            input[i].disabled='true';
                                            //childs.css('border', '2px solid green');
                                        }
                                    }
                                    alert("id : " + result);
                                } else {
                                    //alert('unchecked');
                                    $this.attr('checked',false);
                                    $(this).parents('.optionList').removeAttr('id');
                                    input.attr('disabled',false);

                                    var temp = [];
                                    temp = result.split(",");
                                    console.log(temp);
                                    result = "";
                                    for(var i=0;i<temp.length-2;i++){
                                        result += temp[i] +',';
                                    }
                                    alert("id : " + result);
                                }

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
                                var $this = $(this);
                                var childs = $(this).parents('.optionContainer').find('li');
                                var input = $(this).parents('.optionContainer').find('input');

                                if ($this.is(':checked')) {
                                    //alert('checked');
                                    $this.attr('checked',true);
                                    $(this).parents('.optionList').attr('id', obj.idOption);
                                    if(obj.idOption != 0){
                                        result += obj.idOption + ',';
                                    }
                                    for (var i=0; i<childs.length; i++) {
                                        /*childs.css('border', '2px solid green');
                                         if(childs[i].id != 0) {
                                         var id = childs[i].id;
                                         childs.removeAttr('css');
                                         }*/
                                        if(childs[i].id != 0){
                                            continue;
                                        }
                                        else {
                                            input[i].disabled='true';
                                            //childs.css('border', '2px solid green');
                                        }
                                    }
                                    alert("id : " + result);
                                } else {
                                    //alert('unchecked');
                                    $this.attr('checked',false);
                                    $(this).parents('.optionList').removeAttr('id');
                                    input.attr('disabled',false);

                                    var temp = [];
                                    temp = result.split(",");
                                    console.log(temp);
                                    result = "";
                                    for(var i=0;i<temp.length-2;i++){
                                        result += temp[i] +',';
                                    }
                                    alert("id : " + result);
                                }
                            })
                        );
                    }

                    subOption.appendChild(option);
                    subOption.appendChild(checkboxOption);
                    optionList.appendChild(subOption);
                    optionContainer.appendChild(optionList);

                    if (lengthOptions % 3 == 0 || lengthOptions == 5) {
                        optionWrapper_3.appendChild(optionContainer);
                        optionWrapper.appendChild(optionWrapper_3);
                    } else if (lengthOptions % 2 == 0){
                        optionWrapper_2.appendChild(optionContainer);
                        optionWrapper.appendChild(optionWrapper_2);
                    }

                });

                questionWrapper.appendChild(optionWrapper);

                wrapper.appendChild(questionWrapper);

            });

            $('#list_question').append(wrapper);

        }
    });






