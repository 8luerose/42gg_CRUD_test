package gg.ggtaehkwon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @GetMapping("/")
    public String list()
            return "board/";
    @GetMapping("/post")
    public String write()
        return "board/"
}


