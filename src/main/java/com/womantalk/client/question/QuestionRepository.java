package com.womantalk.client.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>
{
/*    @Query("select q from Question q where q.quiz = :idQuiz")
    List<Question> findQuestionByQuiz(@Param("idQuiz") Integer idQuiz);*/
}
