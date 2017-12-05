package com.itheima.test;

import com.ithema.service.User;
import com.ithema.service.impl.UserService;
import com.ithema.service.impl.UserServiceImplService;
import org.junit.Test;

public class App1 {
    @Test
    public void fun01( ){
        UserServiceImplService userservice = new UserServiceImplService();
        UserService userServiceImplPort = userservice.getUserServiceImplPort();
        User user = new User();
        user.setAge(15);
        user.setId(1);
        user.setNage("范远波");
        userServiceImplPort.save(user);
    }
}
