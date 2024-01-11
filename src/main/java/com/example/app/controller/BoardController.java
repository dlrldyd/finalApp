package com.example.app.controller;

import com.example.app.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String boardList(){
        return "board/list";
    }

    @GetMapping("/view")
    public String boardView(){
        return "board/view";
    }

    @GetMapping("/write")
    public String boardWrite(){
        return "board/write";
    }
}
