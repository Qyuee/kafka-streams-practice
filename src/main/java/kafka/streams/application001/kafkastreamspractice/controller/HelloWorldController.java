package kafka.streams.application001.kafkastreamspractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
