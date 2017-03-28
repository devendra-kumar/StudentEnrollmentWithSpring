package com.github.elizabetht.service;

import java.util.List;

import com.github.elizabetht.model.Student;

public interface StudentService extends BaseService<Student> {
	
	public List<Student> getAllStudent();
	public Student getStudentByID(long id);
}
