package com.womantalk.client.quiz;

import com.womantalk.client.option.Option;
import com.womantalk.client.option.OptionService;
import com.womantalk.client.question.Question;
import com.womantalk.client.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class QuizController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private OptionService optionService;

    @RequestMapping(value = "/quiz/tampilanQuiz/{idQuiz}", method = RequestMethod.GET)
    public String daftarQuiz(@PathVariable Integer idQuiz, Model model, Integer idQuestion)
    {
       // Quiz quiz = quizService.findQuizByIdQuiz(idQuiz);
        List<Question> questionList = questionService.findQuestionByIdQuiz(idQuiz);
        List<Option> options = new ArrayList<>();
        List<Option> allOption = new ArrayList<Option>();
        allOption = optionService.findOptionByIdQuestion(idQuestion);
        int i = 0;
        for (Question question : questionList){
            options = optionService.findOptionByQuestion(question);
            for(Option option : options)
            {
                allOption.add(i,option);
                i++;
            }
       }
        model.addAttribute("quiz", quizService.findQuizByIdQuiz(idQuiz));
        model.addAttribute("question", questionList);
        model.addAttribute("option", allOption);
        return "QuizQO";
    }
}
