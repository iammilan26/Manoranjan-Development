package com.school.schoolManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.schoolManagement.Model.Student;
import com.school.schoolManagement.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		//return studentRepository.getAllStudents().stream().collect(Collectors.toList());
		//return all student
		//
		//adding4th
		return studentRepository.findAll();
	}

	public List<Student> getStudentById(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id);
	}
	
	public List<Student> getStudentByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return studentRepository.findByFirstName(firstName);
	}

	public List<Student> getStudentByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return studentRepository.findByFirstNameAndLastName(firstName, lastName);
	}

	public List<Student> getStudentsByRankAndBGroup(String rank, String bloodGroup) {
		// TODO Auto-generated method stub
		
		return studentRepository.findByRankAndBloodGroup(Long.parseLong(rank), bloodGroup);
	}
}
