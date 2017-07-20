package com.womantalk.client.quiztype;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface QuizTypeRepository extends JpaRepository<QuizType, Integer> {

}
