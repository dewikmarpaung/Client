package com.womantalk.client.option;

import com.womantalk.client.question.Question;

import java.util.List;

public interface OptionService {
    List<Option> findOptionByIdQuestion(Integer idQuestion);
    List<Option> findOptionByQuestion(Question question);
}
