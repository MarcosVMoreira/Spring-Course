package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			int studentId = 3;

			// get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("Getting student with id: " + studentId);
			
			Student myStudentData = session.get(Student.class, studentId);
			
			//session.delete(myStudentData);
			session.createQuery("delete from Student where id=3").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			

			
			
		} finally {
			factory.close();
		}
		
		
	}

}
