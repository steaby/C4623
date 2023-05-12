//package com.onetoone.entity;
//
//import javax.persistence.*;
//import lombok.*;
//
//@Entity
//@Table(name = "course")
//@Getter
//@Setter
//@ToString
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Course 
//{
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//	
//	@Column(name="title")
//	private String title;
//	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="instructor_id")
//	private Instructor instructor;
//
//
//}
