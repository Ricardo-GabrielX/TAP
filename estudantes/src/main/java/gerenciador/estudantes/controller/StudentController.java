package gerenciador.estudantes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/students")
public class StudentController {
    

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    
    
}
