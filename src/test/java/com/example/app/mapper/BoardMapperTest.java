package com.example.app.mapper;

import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.dto.UserDto;
import com.example.app.domain.vo.BoardVo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BoardMapperTest {
    @Autowired
    BoardMapper boardMapper;
    @Autowired
    UserMapper userMapper;

    BoardDto boardDto;
    UserDto userDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserId("test");
        userDto.setUserPassword("test");
        userDto.setUserGender("M");
        userDto.setUserEmail("test@naver.com");
        userDto.setUserAddress("노원구");

        userMapper.insert(userDto);

        boardDto = new BoardDto();
        boardDto.setUserNumber(userDto.getUserNumber());
        boardDto.setBoardTitle("test title");
        boardDto.setBoardContent("test content");
    }

    @Test
    void delete() {
        // given
         boardMapper.insert(boardDto);
        // when
        boardMapper.delete(boardDto.getBoardNumber());
        // then
        BoardVo boardVo = boardMapper.select(boardDto.getBoardNumber()).orElse(null);
        assertThat(boardVo).isNull();
    }

    @Test
    void update() {
        // given
        boardMapper.insert(boardDto);
        boardDto.setBoardTitle("수정했다!");
        boardDto.setBoardContent("수정했다!");
         // when
        boardMapper.update(boardDto);
        // then
        boardMapper.select(boardDto.getBoardNumber()).orElse(null);
        assertThat(boardVo.getBoardTitle()).isEqualTo("수정했다!");
    }

    @Test
    void select() {
    // given

    // when
    // then
    }

    @Test
    void selectList() {
    }
}