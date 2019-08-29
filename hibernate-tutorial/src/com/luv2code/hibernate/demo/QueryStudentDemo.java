package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query students: lastName='Silva'
			theStudents = session.createQuery("from Student s where s.lastName='Antonio'").getResultList();
			
			System.out.println("Students who have the last name of Antonio");
			displayStudents(theStudents);
			
			// query students: lastName='Antonio' OR firstName='Maria'
			theStudents =
					session.createQuery("from Student s where s.lastName='Antonio' OR s.firstName='Maria'").getResultList();
			
			System.out.println("Students who have the last name of Antonio or the first name of Maria");
			displayStudents(theStudents);
			
			// query students where email LIKE '%luv2code.com' (email termina com luv2code.com)
			theStudents =
					session.createQuery("from Student s where s.email LIKE '%email.com'").getResultList();
			
			System.out.println("Students who have the email ends with email.com");
			displayStudents(theStudents);
			
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done.");
			
			
		} finally {
			factory.close();
		}
		
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
