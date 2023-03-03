package tinysnow.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/yes")
    public Object getInfo(){
        return "info";
    }
    @GetMapping("/no")
    public Object getNothing(){
        return "nothing";
    }
}
