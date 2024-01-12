package com.example.app.service;

import com.example.app.domain.dto.BoardDto;
import com.example.app.domain.vo.BoardVo;
import com.example.app.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardMapper;

    //    게시물 삽입
    public void register(BoardDto boardDto){
        boardMapper.insert(boardDto);
    }
    //    게시물 삭제
    public void remove(Long boardNumber){
        boardMapper.delete(boardNumber);
    }
    //    게시물 수정
    public void modify(BoardDto boardDto){
        boardMapper.update(boardDto);
    }
    //    게시물 단건 조회
    public BoardVo find(Long boardNumber){
        Optional<BoardVo> opt = boardMapper.select(boardNumber);
        return opt.orElseThrow(()-> new IllegalStateException("존재하지 않는 게시물 정보"));
    }
    //    게시물 리스트 조회
    public List<BoardVo> selectList(){
        List<BoardVo> boardList = boardMapper.selectList();
        return boardList;
    }
}
