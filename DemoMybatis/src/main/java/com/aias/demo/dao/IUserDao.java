package com.aias.demo.dao;

import com.aias.demo.bean.User;
import org.apache.ibatis.annotations.Select;


public interface IUserDao {
    @Select("select * from t_user where id = #{id}")
    public User selectUserById(Integer id);
}
