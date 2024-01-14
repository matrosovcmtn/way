package yourway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class egorController {
    @GetMapping("/hello")
    public void hello() {
        System.out.println("Hello world from egor's branch");
    }
}
