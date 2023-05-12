package com.student.model;

import javax.persistence.*;
import lombok.*;
@Entity
@Table(name = "Students")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Students 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;

	  @Column(name = "FirstName")
	  private String firstname;
	  
	  @Column(name = "LastName")
	  private String lastname;

	  @Column(name = "email")
	  private String email;
	  
	  @Column(name = "Batch")
	  private String batch;
}
