package com.student.main;

import com.student.Dao.StudentsDao;
import com.student.model.Students;

public class App 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		StudentsDao stD = new StudentsDao();
		Students st = new Students();
		Students st1 = new Students();
		Students st2 = new Students();
		st.setFirstname("anu");
		st.setLastname("Sharma");
		st.setEmail("anu@gmail.com");
		st.setBatch("IT");
		st1.setFirstname("manu");
		st1.setLastname("moo");
		st1.setEmail("manu@gmail.com");
		st1.setBatch("BMS");
		st2.setFirstname("gj");
		st2.setLastname("hjs");
		st2.setEmail("sgjh");
		st2.setBatch("do");
		
		StudentsDao.saveStudent(st);
		StudentsDao.saveStudent(st1);
		StudentsDao.saveStudent(st2);
		
		st1.setLastname("Mehta");
		StudentsDao.saveOrUpdateStudent(st1);
		
		StudentsDao.deleteStudent(st2);		
	}

}
