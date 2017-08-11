package com.womantalk.client.quiztype;

import java.util.List;


public interface QuizTypeService
{
    List<QuizType> findAll();
    List <QuizType> findTop3ByIdQuizType ( Integer idQuizType);
}
