package com.womantalk.client.quiz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {


    @Autowired
    private QuizRepository quizRepository;

    @Override
    public List<Quiz> findAllQuizByStatus()
    {
        List<Quiz> quizzes = quizRepository.getAllQuizByStatus();
        return quizzes;
    }

    @Override
    public List<Quiz> findQuizByIdQuiz(Integer idQuiz)
    {
        return quizRepository.getAllQuizByIdQuiz(idQuiz);
    }


}
