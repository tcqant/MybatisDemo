package org.test.mybatisxmldemo.mapper;

import org.apache.ibatis.annotations.*;
import org.test.mybatisxmldemo.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAll();

    User getOne(int id);

    void insert(User user);
}
