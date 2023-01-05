package com.spring.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started....." );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		/*
		 * Student student=new Student(); student.setId(128);
		 * student.setName("Nilbheda"); student.setCity("Gaya"); int
		 * result=studentDao.insert(student); System.out.println("Student Added"
		 * +result);
		 */
        Student student=studentDao.getStudent(128);
        System.out.println(student);
        List<Student> students=studentDao.getAllStudents();
        for(Student s:students) {
        	System.out.println(s);
        }
    }
}