package com.womantalk.client.quiz;

import java.util.List;

/**
 * Created by gloria on 07/07/2017.
 */

public interface QuizService
{
    List<Quiz> findAllQuizByStatus();
    List<Quiz> findQuizByIdQuiz (Integer idQuiz);
}
