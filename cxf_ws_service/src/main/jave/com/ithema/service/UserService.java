package com.ithema.service;

import com.ithekma.domain.User;

import javax.jws.WebService;

@WebService
public interface UserService {
    public void save(User user);
}
