package com.library.springboot.mapper;

import com.library.springboot.controller.request.BaseRequest;
import com.library.springboot.controller.request.LoginRequest;
import com.library.springboot.controller.request.PasswordRequest;
import com.library.springboot.controller.request.UserPageRequest;
import com.library.springboot.entity.Admin;
import com.library.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AdminMapper {
//    @Select("select * from user")
    List<Admin> list();

//    @Select("select * from user where name like concat('%', #{ name }, '%') and phone like concat('%', #{ phone }, '%')")
    List<Admin> listByCondition(BaseRequest baseRequest);

    void save(Admin obj);

    Admin getById(Integer id);

    void updateById(Admin obj);

    void deleteById(Integer id);
    Admin getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    int updatePassword(PasswordRequest request);

    Admin getByUsername(String username);
}
