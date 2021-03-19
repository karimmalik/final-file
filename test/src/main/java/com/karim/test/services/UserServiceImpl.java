package com.karim.test.services;

import com.karim.test.domain.User;
import com.karim.test.exceptions.EtAuthException;
import com.karim.test.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String login_code, String password) throws EtAuthException {
        if(login_code != null) login_code = login_code.toLowerCase();
        return userRepository.findByEmailAndPassword(login_code, password);
    }
    
}
