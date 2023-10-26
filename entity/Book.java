package com.library.mgmt.system.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name="Book")
public class Book 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookId;
	private String title;
	private String author;
	private String ISBN;
	private String genre;
	private String language;
	
	
//	    @ManyToOne(cascade = CascadeType.ALL)
//	    @JsonManagedReference
//		//use JsonManagedReference for bidirectional relationship
//      private Student student;
////		private List<Student> students;
//	    @ManyToOne(cascade = CascadeType.ALL)
//	    @JsonManagedReference
//	    private Author author;
////		private List<Author> authors;
//	    @ManyToOne(cascade = CascadeType.ALL)
//	    @JsonManagedReference
//	    private Librarian librarian;
////	    private List<Librarian> librarians;
//	    @ManyToOne(cascade = CascadeType.ALL)
//	    @JsonManagedReference
//	    private Faculty faculty;
////	    private List<Faculty> faculties;

	
	

}
