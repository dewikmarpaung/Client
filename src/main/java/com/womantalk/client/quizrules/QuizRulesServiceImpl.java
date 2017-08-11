package com.womantalk.client.quizrules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizRulesServiceImpl implements QuizRulesService {

    @Autowired
    private QuizRulesRepository quizRulesRepository;


    @Override
    public List<QuizRules> findResult()
    {
        return quizRulesRepository.findAll();
    }

    @Override
    public List<QuizRules> getResult(Integer score)
    {
        return quizRulesRepository.getResult(score);
    }
}
