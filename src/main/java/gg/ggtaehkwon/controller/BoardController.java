package gg.ggtaehkwon.controller;


import gg.ggtaehkwon.dto.BoardDto;
import gg.ggtaehkwon.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService)
    {
        this.boardService = boardService;
    }

    @PostMapping("/post")
    public Long savePost(@RequestBody BoardDto boardDto)
    {
        return boardService.savePost(boardDto);
    }
//    @GetMapping("/")
//    public String list()
//    {
//        return "board/";
//    }
//    @GetMapping("/post")
//    public String write()
//    {
//        return "board/";
//    }
}


