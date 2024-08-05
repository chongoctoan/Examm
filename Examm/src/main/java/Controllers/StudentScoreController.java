package Controllers;

import Services.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/scores")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping("/add")
    public String showAddScoreForm() {
        return "add-score";
    }

    @PostMapping("/add")
    public String addScore(@RequestParam Long studentId, @RequestParam Long subjectId, @RequestParam double score1, @RequestParam double score2) {
        return "redirect:/students/list";
    }
}

