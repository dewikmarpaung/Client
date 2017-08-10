package com.womantalk.client.quiz;

import com.fasterxml.jackson.annotation.JsonView;
import com.womantalk.client.option.OptionService;
import com.womantalk.client.quizrules.QuizRules;
import com.womantalk.client.quizrules.QuizRulesService;
import com.womantalk.client.tools.ModelToResponseMapper;
import com.womantalk.client.tools.Response;
import com.womantalk.client.tools.View;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizAPIController
{
    @Autowired
    QuizService quizService;

    @Autowired
    OptionService optionService;

    @Autowired
    QuizRulesService quizRulesService;

    /*@JsonView (View.Quiz.class)
    @RequestMapping(value ="/API/Quiz/getAllQuiz", method = RequestMethod.GET)
    public Response<List<Quiz>> getAllQuiz
            (@RequestParam (value = "offset", required = false, defaultValue = "0") int offset,
             @RequestParam(value = "limit", required = false, defaultValue = "3") int limit) throws Exception
    {
        return quizService.getAllQuizByStatus(offset, limit);
    }
*/

    @JsonView (View.AllQuiz.class)
    @RequestMapping(value ="/API/Quiz/getQuiz/{idQuiz}", method = RequestMethod.GET)
    public Response<List<Quiz>> getAllQuizByIdQuiz (@PathVariable Integer idQuiz)
    {
      return quizService.getAllQuizByIdQuiz(idQuiz);
    }


    @JsonView(View.QuizRules.class)
    @RequestMapping (value ="API/Quiz/ShowResultQuiz", method = RequestMethod.POST)
    @ResponseBody
    public Response <List<QuizRules>> showResult
            (@RequestParam ("idQuiz")long idQuiz, @RequestParam ("idOption") String idOptions)
    {
        return quizService.showResult(idQuiz, idOptions);
    }


    @JsonView (View.Quiz.class)
    @RequestMapping(value ="/API/Quiz/getAllQuizByStatus")
    public Response<List<Quiz>> getAllQuizByStatus(String status, @RequestParam ("idQuiz") Integer id)
    {
        List <Quiz> quizzes = quizService.findTop3ByStatusOrderByIdQuizDesc(status, id);
        return ModelToResponseMapper.mapThisSuccess(quizzes);
    }

/*
    @JsonView (View.AllQuiz.class)
    @RequestMapping(value ="/API/Quiz/getAllOption", method = RequestMethod.GET)
    public Response<List<Option>> getAllOption ()
    {
        List<Option> options= optionService.findAllOption();
        return ModelToResponseMapper.mapThisSuccess(options);
    }*/


   /* //@JsonView(View.Public.class)
    @RequestMapping(value ="/API/Quiz/getAllDataQuiz/{idQuiz}", method = RequestMethod.GET)
    public Response<List<Quiz>> getAllQuizById (@PathVariable Integer idQuiz)
    {
        List<Quiz> quizzes = quizService.getAllQuiz(idQuiz);
        return ModelToResponseMapper.mapThisSuccess(quizzes);
    }
*/

    /*@RequestMapping(value ="/API/Quiz/getQuizByObject/{idQuiz}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Quiz> getAllQuizByObject (@PathVariable Integer idQuiz)
    {
        List<Quiz> quizzes = quizService.getAllDataQuiz(idQuiz);
        return quizzes;
    }*/





    /*@RequestMapping(value = "/{idQuiz}", method = RequestMethod.GET)
    public Response<QuestionOption> getQuizAndQuestionAndOption (@PathVariable("idQuiz") Integer id_quiz)
    {
        Quiz quiz = quizService.findQuizByIdQuiz(id_quiz);
        List<Question> questions = questionService.findQuestionByIdQuiz(id_quiz);
        List <Option> optionTemporary = new ArrayList<Option>();
        optionTemporary = optionService.findOptionByIdQuestion(1);
        List<Option> options = new ArrayList<Option>();
        for (Question question : questions)
        {
            optionTemporary = optionService.findOptionByQuestion(question);
            for (Option option : optionTemporary){
                 options.add(option);
            }
        }
        QuestionOption questionOption = new QuestionOption();

        questionOption.setQuiz(quiz);
        questionOption.setOption(optionTemporary);
        questionOption.setQuestion(questions);

        return ModelToResponseMapper.mapThisSuccess(questionOption);
    }*/


}
