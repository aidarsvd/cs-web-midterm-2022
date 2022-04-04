package pro.aidar.alatoo.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class MainController {

    @GetMapping
    public String getMain(){
        return "index";
    }

    @PostMapping("/department")
    public void addDepartment(@RequestParam(name = "name") String name){
        log.info("name: {}", name);
    }


}
