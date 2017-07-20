package com.womantalk.client.quizrules;


import java.util.List;

public interface QuizRulesService
{
    List<QuizRules> findResult();
    List<QuizRules> getResult (Integer score);
}
