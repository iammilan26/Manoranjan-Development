package com.school.schoolManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.schoolManagement.Model.Student;
import com.school.schoolManagement.service.StudentService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/student")
@EnableSwagger2
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		try {
			
			return new ResponseEntity<Student>(studentService.save(student), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Student>(studentService.save(student), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		try {
			List<Student> students = studentService.getAllStudents();
			if (students.size() < 1)
				return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
			else
				return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/getAllStudents/{id}")
	public ResponseEntity<List<Student>> getAllStudents(@PathVariable("id") long id) {
		try {
			List<Student> students = studentService.getStudentById(id);

			if (students.size() >= 1)
				return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
			else
				return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<Student>>(studentService.getStudentById(id),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	@GetMapping("/getAllStudentsByFirstName/{firstName}")
	public ResponseEntity<List<Student>> getAllStudentsByFirstNam(@PathVariable("firstName") String firstName) {
		try {
			List<Student> students = studentService.getStudentByFirstName(firstName);

			if (students.size() >= 1)
				return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
			else
				return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<Student>>(studentService.getStudentByFirstName(firstName),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	@GetMapping("/getAllStudentsByName")
	public ResponseEntity<List<Student>> getAllStudentsByName(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName) {
		try {
			List<Student> students = studentService.getStudentByFirstNameAndLastName(firstName, lastName);

			if (students.size() >= 1)
				return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
			else
				return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<Student>>(studentService.getStudentByFirstNameAndLastName(firstName, lastName),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping("/getAllStudentsByRankAndBGroup")
	public ResponseEntity<List<Student>> getAllStudentsByRankAndBGroup(@RequestParam("rank") String rank,@RequestParam("bloodGroup") String bloodGroup) {
		try {
			List<Student> students = studentService.getStudentsByRankAndBGroup(rank, bloodGroup);

			if (students.size() >= 1)
				return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
			else
				return new ResponseEntity<List<Student>>(students, HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<Student>>(studentService.getStudentsByRankAndBGroup(rank, bloodGroup),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
}
