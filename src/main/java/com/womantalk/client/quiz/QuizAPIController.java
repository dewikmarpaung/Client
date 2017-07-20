package com.womantalk.client.quiz;

import com.fasterxml.jackson.annotation.JsonView;
import com.womantalk.client.option.OptionService;
import com.womantalk.client.question.QuestionService;
import com.womantalk.client.tools.ModelToResponseMapper;
import com.womantalk.client.tools.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Chintya on 7/13/2017.
 */

@RestController
public class QuizAPIController
{
    @Autowired
    QuizService quizService;

    @Autowired
    OptionService optionService;

    @Autowired
    QuestionService questionService;

    @JsonView (View.Quiz.class)
    @RequestMapping(value ="/API/Quiz/getAllQuiz", method = RequestMethod.GET)
    public Response<List<Quiz>> getAllQuiz ()
    {
        List<Quiz> quizzes = quizService.findAllQuizByStatus();
        return ModelToResponseMapper.mapThisSuccess(quizzes);
    }

    @JsonView (View.AllQuiz.class)
    @RequestMapping(value ="/API/Quiz/getQuiz/{idQuiz}", method = RequestMethod.GET)
    public Response<List<Quiz>> getAllQuiz (@PathVariable Integer idQuiz)
    {
        List<Quiz> quizzes = quizService.findQuizByIdQuiz(idQuiz);
        return ModelToResponseMapper.mapThisSuccess(quizzes);
    }


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
