package org.test.mybatisannotationdemo.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import org.test.mybatisannotationdemo.model.User;

import java.util.List;


//@Service
@Mapper
public interface UserDao {

    @Select("SELECT * FROM userinfo")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "anme"),
        @Result(property = "age", column = "age"),
        @Result(property = "address", column = "address")
    })
    List<User> getAll();

    @Select("SELECT * FROM userinfo WHERE id = #{id}")
    User getOne(int id);

    @Insert("INSERT INTO userinfo(name, age, address) values (#{name}, #{age}, #{address})")
    void insert(User user);
}
