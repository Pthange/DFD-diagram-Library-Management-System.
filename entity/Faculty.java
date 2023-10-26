package com.library.mgmt.system.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Faculty")
public class Faculty 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int facultyId;
	private String facultyName;
	private String facultyEmail;
	private String facultyusername;
	private String facultypassword;
	private String facultyDOB;
	private String facultyGender;
	private String facultyAddress;
	private String mobno;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JsonManagedReference
//	//use JsonManagedReference for bidirectional relationship
//       private Book book;
////	private List<Book> books;
//	
	



}
