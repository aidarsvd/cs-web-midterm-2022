package pro.aidar.alatoo.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pro.aidar.alatoo.entity.Department;
import pro.aidar.alatoo.service.DepartmentService;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MainController {

    private final DepartmentService departmentService;

    @GetMapping
    public String getMain(Model model) {
        model.addAttribute("department", new Department());
        model.addAttribute("department_list", departmentService.findAll());
        return "index";
    }

    @PostMapping("/department")
    public Department addDepartment(Department department) {
        return departmentService.addDepartment(department);
    }


}
