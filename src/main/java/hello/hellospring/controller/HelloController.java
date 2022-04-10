package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello") //hello 입력이 들어오면 밑 메소드 실행.
    public String hello(Model model){
        model.addAttribute("data", "hello");

        return "hello";
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-templates";
    }

    @GetMapping("hello hansol")
    public String helloH(@RequestParam("who") String name, Model model){
        model.addAttribute("who", name);
        return "hello-whois";
    }

}
