package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/welcome")
    public String index() {
        return "Welcome from Spring Boot!";
    }
}