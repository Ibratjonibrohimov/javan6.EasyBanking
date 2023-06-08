package uz.najottalim.javan6.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("news")
public class NewsController {
    @GetMapping()
    public String getAllNews(){
        return "hallo world";
    }
}
