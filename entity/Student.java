package com.library.mgmt.system.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

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
@Table(name="Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int stud_Id;
	private String studName;
	private String studEmail;
	private String studUsername;
	private String studPassword;
	private String studDOB;
	private String studGender;
	private String studAddress;
	private String studMobno;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JsonManagedReference
	//use JsonManagedReference for bidirectional relationship
	private List<Book> books;

}
