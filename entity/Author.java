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
@Table(name="Author")
public class Author 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int authorId;
	private String authorName;
    private String nationality;
    private String authorGender;
    
//	@OneToMany(cascade=CascadeType.ALL)
//	//use JsonManagedReference for bidirectional relationship
//	@JsonManagedReference
//	private Book book;
//	//private List<Book> books;
}
