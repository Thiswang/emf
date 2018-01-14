package study.project.emf.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    public String hello(Map<String,Object> map){
        map.put("name", "z1");
        return "hello";
    }

    @RequestMapping("/example")
    public String example(){
        return "example";
    }

}