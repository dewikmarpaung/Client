package com.womantalk.client.question;

import com.womantalk.client.quiz.Quiz;

import java.util.List;


public interface QuestionService {

    List<Question> findAll();
    List<Question> findQuestionByIdQuiz(Integer idQuiz);
    List<Question> findQuestionByQuiz(Quiz quiz);
}
