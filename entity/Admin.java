package com.library.mgmt.system.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@Table(name="Admin")
public class Admin 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int adminId;
	private String adminName;
	private String adminEmail;
	private String adminusername;
	private String adminpassword;
	
//	@OneToOne(mappedBy = "admin",cascade=CascadeType.ALL)
//	// Use @JsonManagedReference for bidirectional relationship
//	@JsonManagedReference
//	private Librarian librarian ;
//	 //private List<Librarian> librarians;
//	@OneToOne(mappedBy = "admin",cascade=CascadeType.ALL)
//	@JsonManagedReference
//	private Student student;
//	//private List<Student> students;
//	@OneToOne(mappedBy = "admin",cascade=CascadeType.ALL)
//	@JsonManagedReference
//	private Faculty faculty;
//	//private List<Faculty> faculties;


}
