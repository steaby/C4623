package com.onetoone;
import com.onetoone.entity.*;

import java.util.ArrayList;
import java.util.List;

import com.onetoone.dao.*;
public class App 
{
    public static void main( String[] args )
    {
    	 Instructor instructor = new Instructor();
    	 instructor.setFirstName("shona");
    	 instructor.setLastName("P");
    	 instructor.setEmail("shona@gmail.com");
    	 
    	 InstructorDao instructorDao = new InstructorDao();
    	 
    	 InstructorDetail instructorDetail = new InstructorDetail();
    	 instructorDetail.setYoutubeChannel("all mine");
    	 instructorDetail.setHobby("drawing");
    	 InstructorDetailDao idao = new InstructorDetailDao();
    	 
    	 List<Instructor> instructor1 = new ArrayList<>();
    	 instructor1.add(instructor);
    	 
    	 List<InstructorDetail> instructordetail = new ArrayList<>();
    	 instructordetail.add(instructorDetail);
    	 
    	 //instructorDetail.setInstructor(instructor);
    	 instructorDao.saveInstructor(instructor);
    	 idao.saveInstructorDetail(instructorDetail);
    	 
    	 
    	 
//    	 List<Course> courses = new ArrayList<>();
//    	 Course tempCourse1 = new Course();
//    	 tempCourse1.setTitle("aaaaa.....");
//    	 tempCourse1.setInstructor(instructor);
//    	 courses.add(tempCourse1);
//    	 
//    	 CourseDao coursedao = new CourseDao();
//    	 coursedao.saveCourse(tempCourse1);
         
         

         
         
    }
}
