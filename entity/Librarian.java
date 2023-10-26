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
@Table(name="Librarian")
public class Librarian 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int libId;
	private String libName;
	private String libEmail;
	private String libusername;
	private String libpassword;
	private String libMobno;
	 private String libGender;
	 private String libDOB;
	 
//	@OneToMany(cascade=CascadeType.ALL)
//	@JsonManagedReference
//	private Book book ;
////	private List<Book> books;
//	@OneToMany(cascade=CascadeType.ALL)
//	@JsonManagedReference
//	private Student student;
////	private List<Student> students;
//	@OneToMany(cascade=CascadeType.ALL)
//	@JsonManagedReference     	
//	//use JsonManagedReference for bidirectional relationship
//   private Faculty faculty;
////	private List<Faculty> faculties;


}
