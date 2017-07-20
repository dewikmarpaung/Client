package com.womantalk.client.quizrules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizRulesServiceImpl implements QuizRulesService {

    @Autowired
    private QuizRulesRepository quizRulesRepository;



    @Override
    public List<QuizRules> findAllByValue() {
        List<QuizRules> quizRulesList = quizRulesRepository.findAll();
        if(quizRulesList!=null) {
            return quizRulesList;
        }else {
            return null;
        }
    }

}
