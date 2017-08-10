/*
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

    })
);*/
