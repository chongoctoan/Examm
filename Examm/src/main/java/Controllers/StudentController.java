package Controllers;

import Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/add")
    public String showAddStudentForm() {
        return "add-student";
    }

    @PostMapping("/add")
    public String addStudent(@RequestParam String studentCode, @RequestParam String fullName, @RequestParam String address) {
        return "redirect:/students/list";
    }
}

