package com.school.schoolManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.school.schoolManagement.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findAll();
	
	List<Student> findById(long id);
	
	List<Student> findByFirstName(String firstName);

	List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	@Query("SELECT s FROM Student s WHERE s.rank = ?1 and s.bloodGroup = ?2")
	List<Student> findByRankAndBloodGroup(Long rank, String bloodGroup);

}
