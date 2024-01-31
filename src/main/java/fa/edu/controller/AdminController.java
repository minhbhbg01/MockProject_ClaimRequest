package fa.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("")
    public String adminPage() {
        return "admin";
    }
    @GetMapping("/project")
    public String projectPage() {
        return "project";
    }
    @GetMapping("/claim")
    public String claimPage() {
        return "claim";
    }
}
