package com.onetoone.entity;

import javax.persistence.*;
import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "instructor_detail")
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstructorDetail 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;
    
    @ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Instructor> instructor;
}
