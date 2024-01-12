                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    package com.example.app.service;

import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.vo.BoardVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Test
    void register() {
        BoardDto boardDto = new BoardDto();
        boardDto.setBoardTitle();
        boardDto.setBoardContent();
        boardDto.setBoardContent();
        boardService.register();
    }

    @Test
    void remove() {
    }

    @Test
    void modify() {
    }

    @Test
    void find(){}


}









