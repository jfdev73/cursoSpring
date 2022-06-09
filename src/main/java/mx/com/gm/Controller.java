package mx.com.gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String incio(){
        return "Hola mundo con spring";
    }
}
