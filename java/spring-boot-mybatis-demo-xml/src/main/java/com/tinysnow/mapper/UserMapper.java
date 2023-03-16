package com.tinysnow.mapper;

import com.tinysnow.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findAll();

}
