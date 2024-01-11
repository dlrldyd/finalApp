package com.example.app.mapper;

import com.example.app.domain.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Optional;

@Mapper
public interface UserMapper {
//    회원 정보 삽입
    void insert(UserDto userDto);
//      회원 번호 조회
    Optional<Long> selectUserNumber(@Param("userId") String userId,
                                    @Param("userPassword") String userPassword);
}
