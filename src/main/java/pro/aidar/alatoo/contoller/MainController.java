package pro.aidar.alatoo.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pro.aidar.alatoo.service.DepartmentService;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final DepartmentService departmentService;

    @GetMapping
    public String getMain(Model model) {
        model.addAttribute("department_list", departmentService.findAll());
        return "index";
    }

}
