package com.tillu.service;

import java.util.List;

import com.tillu.exception.UserException;
import com.tillu.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
