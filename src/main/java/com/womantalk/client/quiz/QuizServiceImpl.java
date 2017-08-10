package com.womantalk.client.quiz;


import com.womantalk.client.option.OptionService;
import com.womantalk.client.quizrules.QuizRules;
import com.womantalk.client.quizrules.QuizRulesService;
import com.womantalk.client.tools.ModelToResponseMapper;
import com.womantalk.client.tools.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizServiceImpl implements QuizService
{


    @Autowired
    private QuizService quizService;

    @Autowired
    private OptionService optionService;

    @Autowired
    private QuizRulesService quizRulesService;

    @Autowired
    private QuizRepository quizRepository;


    @Override
    public List<Quiz> findAllQuizByStatus()
    {
        return quizRepository.getAllQuizByStatus();
    }

    @Override
    public List<Quiz> findQuizByIdQuiz(Integer idQuiz)
    {
        return quizRepository.getAllQuizByIdQuiz(idQuiz);
    }

    @Override
    public Response<List<Quiz>> getAllQuizByStatus
            (int offset, int limit)
    {

        List <Quiz> quizzes = quizService.findAllQuizByStatus();
        return ModelToResponseMapper.mapThisSuccess(quizzes);
    }

    @Override
    public Response<List<Quiz>> getAllQuizByIdQuiz(Integer idQuiz)
        {
        List<Quiz> quizzes = quizService.findQuizByIdQuiz(idQuiz);
        return ModelToResponseMapper.mapThisSuccess(quizzes);
    }

    @Override
    public Response<List<QuizRules>> showResult(long idQuiz, String idOptions)
    {
        String [] idOptionsArray = idOptions.split(",");
        int score = 0;
        int rightAnswer = 0;
        int totalQuestion = idOptionsArray.length;

        for (int indexIdOption = 0; indexIdOption < idOptionsArray.length;indexIdOption++)
        {
            score += optionService.findValueByIdOption(Integer.parseInt(idOptionsArray[indexIdOption]));
        }

        rightAnswer = score;
        List <QuizRules> allQuizRules = quizRulesService.findResult();
        List <QuizRules> quizRulesList = new ArrayList<QuizRules>();
        for (QuizRules quizRules : allQuizRules)
        {
            if( score >= quizRules.getMin() && score <= quizRules.getMax() && quizRules.getQuiz().getIdQuiz() == idQuiz)
            {
                quizRulesList.add(quizRules);
               /* System.out.println(score);
                System.out.println(quizRules.getDescription());*/
               quizRules.setRightAnswer(rightAnswer);
               quizRules.setTotalQuestion(totalQuestion);
            }
        }
        return ModelToResponseMapper.mapThisSuccess(quizRulesList);
    }

    @Override
    public List<Quiz> findTop3ByStatusOrderByIdQuizDesc  (String status, Integer lastId)
    {
        int idMax = 100000;
        List <Quiz> quizzes = quizRepository.getAllQuizByStatus();
        List <Quiz> quizList = new ArrayList<>();
        for (Quiz quiz : quizzes)
        {
            if ( lastId == null)
            {
                lastId = idMax;
                quizList=  quizRepository.findTop3ByIdQuizLessThanOrderByIdQuizDesc(lastId);
            }else
            {
                quizList=  quizRepository.findTop3ByIdQuizLessThanOrderByIdQuizDesc(lastId);
            }
        }
        return quizList;





    /*    List<Quiz> quizzes = new ArrayList<>();
        status = "draf";
        int idMax = 3000000;
        if (lastId == null)
        {
            quizzes = quizRepository.findTop2ByStatusLessThanOrderByIdQuizDesc(status, lastId);
            lastId = 1;
        }
        if (lastId < idMax)
        {
            quizzes = quizRepository.findTop2ByStatusLessThanOrderByIdQuizDesc(status, lastId);
        }
        return quizzes;*/
    }

}
