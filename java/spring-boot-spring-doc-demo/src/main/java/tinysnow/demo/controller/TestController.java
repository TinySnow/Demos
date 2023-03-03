package tinysnow.demo.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "测试接口", description = "测试接口，不用于生产环境")
@RestController
public class TestController {

    @GetMapping("/list")
    public Object getList(){
        return "list";
    }

    @GetMapping("/info")
    public Object getInfo(){
        return "info";
    }

    @PostMapping("/login")
    public Object login(){
        return "logined";
    }
}
