package com.github.elizabetht.service;

import com.github.elizabetht.model.Student;

public interface BaseService<T> {	
	boolean findByUserName(String userName);
	boolean findByLogin(String userName, String password);
	T save(Student student);
}
