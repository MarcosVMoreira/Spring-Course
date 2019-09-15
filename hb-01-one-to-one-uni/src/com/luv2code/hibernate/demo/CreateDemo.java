package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(InstructorDetail.class)
								 .addAnnotatedClass(Instructor.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create the objects

			/*Instructor tempInstructor = new Instructor("Marcos", "Moreira", "contato.marcosvmoreira@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/canalk", "gaming");
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start a transaction
			session.beginTransaction();*/
			
			Instructor tempInstructor = new Instructor("João", "Silva", "joaosilva@gmail.com");
			
			InstructorDetail tempInstructorDetail = new InstructorDetail("youtube.com/joao", "coding");
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start a transaction
			session.beginTransaction();
			

			// save the instructor
			// this will also save the details object because of CascadeType.ALL
			
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);
			
			
			
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Done.");
			
			
		} finally {
			factory.close();
		}
		
		
	}

}
