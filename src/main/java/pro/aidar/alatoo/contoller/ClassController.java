package pro.aidar.alatoo.contoller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.aidar.alatoo.entity.Department;
import pro.aidar.alatoo.service.DepartmentService;

import java.util.Optional;

@Controller
@RequestMapping("/class")
@Slf4j
@RequiredArgsConstructor
public class ClassController {

    private final DepartmentService departmentService;

    @GetMapping("/{id}")
    public String getMain(@PathVariable Long id, Model model) {
        Optional<Department> department = departmentService.findById(id);
        department.ifPresent(value -> {
            model.addAttribute("department", value);
            model.addAttribute("classes", value.getClasses());
        });
        return "detail";
    }

}
