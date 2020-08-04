package com.yy.jpatest.service.impl;

import com.yy.jpatest.repository.UserRepository;
import com.yy.jpatest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Auther: yuyue
 * @create 2020/8/3 12:40
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void updateStatusByExpirationDate() {
        userRepository.updateStatus();
//        userRepository.updateStatus1("8","0",new Date());
    }

}
