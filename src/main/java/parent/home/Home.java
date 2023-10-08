package parent.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import parent.TodoApplication;

@RestController
public class Home {

    @GetMapping(value = "/x")
    public String greeting(){
        return "hieeeee";
    }

    }

