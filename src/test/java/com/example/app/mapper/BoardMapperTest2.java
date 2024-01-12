package com.example.app.mapper;

import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.vo.BoardVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardMapperTest2 {
    @Autowired
    BoardMapper boardMapper;

    @Test
    void insert() {
        BoardDto boardDto = new BoardDto();
        boardDto.setBoardTitle("test title");
        boardDto.setBoardContent("test content");
        boardDto.setUserNumber(2L);
        boardMapper.insert(boardDto);
    }

    @Test
    void delete() {
        boardMapper.delete(5L);
    }

    @Test
    void update() {
//        놓침
        boardMapper.update();
    }

    @Test
    void select() {
        Optional<BoardVo> found = boardMapper.select((6L));
        BoardVo boardVo = found(null);

        System.out.println("boardVo = " + boardVo);

    }

    @Test
    void selectList() {
    }
}