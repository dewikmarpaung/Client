package com.womantalk.client.quizrules;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRulesRepository extends JpaRepository<QuizRules, Integer>
{
    List<QuizRules> findQuizRulesByQuiz_IdQuiz(int id);
<<<<<<< HEAD
=======

    @Query("select qr from QuizRules  qr where ?1 between qr.min and qr.max")
    List<QuizRules> getResult (@Param("score") Integer score);
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
}
