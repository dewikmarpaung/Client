package com.womantalk.client.quizrules;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRulesRepository extends JpaRepository<QuizRules, Integer>
{
    List<QuizRules> findQuizRulesByQuiz_IdQuiz(int id);

    @Query("select qr from QuizRules  qr where ?1 between qr.min and qr.max")
    List<QuizRules> getResult (@Param("score") Integer score);


}
