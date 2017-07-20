package com.womantalk.client.question;

import com.womantalk.client.quiz.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {


    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> findAll() {
        List<Question> questionList = questionRepository.findAll();
        if(questionList!=null) {
            return questionList;
        }else {
            return null;
        }
    }

    @Override
    public List<Question> findQuestionByQuiz(Quiz quiz) {
        return questionRepository.findQuestionByQuiz(quiz.getIdQuiz());
    }

    @Override
    public List<Question> findQuestionByIdQuiz(Integer idQuiz) {
        List<Question> questions = questionRepository.findAll();
        List<Question> questionsByIdQuiz = new ArrayList<Question>();
        for(Question question : questions){
            if(question.getQuiz().getIdQuiz()==idQuiz){
                questionsByIdQuiz.add(question);
            }
        }
        return questionsByIdQuiz;
    }
}
