package com.karim.test.services;

import com.karim.test.domain.User;
import com.karim.test.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String login_code, String password) throws EtAuthException;

}
