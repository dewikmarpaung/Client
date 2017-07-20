package com.womantalk.client.quizrules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizRulesServiceImpl implements QuizRulesService {

    @Autowired
    private QuizRulesRepository quizRulesRepository;


<<<<<<< HEAD

    @Override
    public List<QuizRules> findAllByValue() {
        List<QuizRules> quizRulesList = quizRulesRepository.findAll();
        if(quizRulesList!=null) {
            return quizRulesList;
        }else {
            return null;
        }
    }

=======
    @Override
    public List<QuizRules> findResult() {
        return quizRulesRepository.findAll();
    }

    @Override
    public List<QuizRules> getResult(Integer score)
    {
        return quizRulesRepository.getResult(score);
    }
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
}
