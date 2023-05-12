package com.onetoone.entity;
import javax.persistence.*;
import java.util.*;
import lombok.*;


@Entity
@Table(name = "instructor")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
    private List<InstructorDetail> instructordetail;

}
