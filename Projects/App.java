package com.student.main;

import com.student.dao.studentsDao;
import com.student.model.students;

public class App
{

	public static void main(String[] args) 
	{
		studentsDao stD = new studentsDao();

        // test saveStudent
        students st =new students("Stella","N","stella@gmail.com");
        students st1 =new students("Ajay","Z","ajay@gmail.com");
        students st2 =new students("Anu","P","anu@gmail.com");
        
        //passing value in parameterized constructor
        stD.saveStudent(st);
        stD.saveStudent(st1);
        stD.saveStudent(st2);
        
        // test updateStudent
        st.setFirstName("Stella");
        stD.updateStudent(st);
        
        stD.deleteStudent(st1);


	}

}
