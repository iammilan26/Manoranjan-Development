package com.school.schoolManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@JsonIgnore
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "blood_group")
	private String bloodGroup;
	
	@Column(name="rank")
	private long rank;

	/*
	 * public long getId() { return id; }
	 * 
	 * public void setId(long id) { this.id = id; }
	 * 
	 * public String getFirstName() { return firstName; }
	 * 
	 * public void setFirstName(String firstName) { this.firstName = firstName; }
	 * 
	 * public String getMiddleName() { return middleName; }
	 * 
	 * public void setMiddleName(String middleName) { this.middleName = middleName;
	 * }
	 * 
	 * public String getLastName() { return lastName; }
	 * 
	 * public void setLastName(String lastName) { this.lastName = lastName; }
	 * 
	 * public String getBloodGroup() { return bloodGroup; }
	 * 
	 * public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup;
	 * }
	 * 
	 * public long getRank() { return rank; }
	 * 
	 * public void setRank(long rank) { this.rank = rank; }
	 * 
	 * public Student(long id, String firstName, String middleName, String lastName,
	 * String bloodGroup, long rank) { super(); this.id = id; this.firstName =
	 * firstName; this.middleName = middleName; this.lastName = lastName;
	 * this.bloodGroup = bloodGroup; this.rank = rank; }
	 * 
	 * public Student() { super(); }
	 * 
	 * @Override public String toString() { return "Student [id=" + id +
	 * ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" +
	 * lastName + ", bloodGroup=" + bloodGroup + ", rank=" + rank + "]"; }
	 */


	
	
}
