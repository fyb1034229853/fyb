package com.ithema.service.impl;

import com.ithekma.domain.User;
import com.ithema.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("执行了保存操作"+user);
    }
}
