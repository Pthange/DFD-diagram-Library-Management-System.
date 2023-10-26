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
@Table(name="Transaction")
public class Transaction 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String borrowDate;
    private  String dueDate;
    private  String returnDate;
    private int total_fine;
    
//    @ManyToOne(cascade=CascadeType.ALL)
//	 @JsonManagedReference
//	private Student student;
////	private List<Student> students;
//    @ManyToOne(cascade=CascadeType.ALL)
//	 @JsonManagedReference
//	 private Faculty faculty;
////	 private List<Faculty> faculties;
//	 @ManyToOne(cascade=CascadeType.ALL)
//	 @JsonManagedReference 
//	 //use JsonManagedReference for bidirectional relationship
//	 private Book book;
////	 private List<Book> books;
	    
}