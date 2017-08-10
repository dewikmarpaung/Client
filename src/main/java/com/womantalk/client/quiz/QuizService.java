package com.womantalk.client.quiz;

import com.womantalk.client.quizrules.QuizRules;
import com.womantalk.client.tools.Response;

import java.util.List;

/**
 * Created by gloria on 07/07/2017.
 */

public interface QuizService
{
    List<Quiz> findAllQuizByStatus();
    List<Quiz> findQuizByIdQuiz (Integer idQuiz);
    Response<List<Quiz>> getAllQuizByStatus (int offset, int limit);
    Response<List<Quiz>> getAllQuizByIdQuiz (Integer idQuiz);
    Response <List<QuizRules>> showResult(long idQuiz, String idOptions);



    List<Quiz> findTop3ByStatusOrderByIdQuizDesc(String status,Integer id);
}
