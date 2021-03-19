package com.karim.test.repositories;

import java.util.Date;

import com.karim.test.domain.User;
import com.karim.test.exceptions.EtAuthException;

public interface UserRepository {
	
	// digunakan ketika login
    User findByEmailAndPassword(String email, String password) throws EtAuthException;

}
