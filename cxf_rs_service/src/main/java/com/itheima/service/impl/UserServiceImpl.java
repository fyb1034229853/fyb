package com.itheima.service.impl;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        System.out.println("保存了user数据"+ user );
    }

    @Override
    public void delete(Integer id) {
        System.out.println("删除了id"+id);
    }

    @Override
    public void update(User user) {
        System.out.println("修改了"+user);
    }

    @Override
    public List<User> findAll() {
        System.out.println("查到了所有数据");
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setAge(19);
        user.setName("范远波");
        list.add(user);
        return list;
    }

    @Override
    public User findById(String id) {
        System.out.println("id="+id);
        User user = new User();
        user.setName("张小三");
        user.setAge(12);
        user.setId(14);
        return user;
    }

    @Override
    public User findById1(String id) {
        System.out.println("id="+id);
        User user = new User();
        user.setName("张小三");
        user.setAge(12);
        user.setId(14);
        return user;
    }
}
