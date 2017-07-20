package com.womantalk.client.option;

import com.womantalk.client.question.Question;

import java.util.List;

public interface OptionService {
    List<Option> findOptionByIdQuestion(Integer idQuestion);
    List<Option> findOptionByQuestion(Question question);
<<<<<<< HEAD
=======
    List<Option> findAllOption();
    Integer findValueByIdOption(Integer idOption);
>>>>>>> 965648bde16c8b7d7278a6923bba40f9a19271be
}
