package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create a student object
			System.out.println("Creating new student object.");
			Student student = new Student("Daffy", "Duck", "dduck@gmail.com");	
			
			//start a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving student.");
			session.save(student);
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done.");
			
			
			//new code
			System.out.println("Saved student. Generated id: " + student.getId());
			
			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("Getting student with id: "+student.getId());
			Student myStudentData = session.get(Student.class, student.getId());
			System.out.println("Get complete: " + myStudentData);
			
			// commit the transaction
			session.getTransaction().commit();
			
			
			
			
		} finally {
			factory.close();
		}
		
		
	}

}
