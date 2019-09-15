package com.luv2code.hibernate.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Employee;
import com.luv2code.hibernate.demo.entity.Student;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Employee.class)
				 .buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {

			
			//Develop code to save objects. 
			
			/*System.out.println("Creating new employee object.");
			Employee employee = new Employee("Marcos", "Moreira", "IFSULDEMINAS");	
			
			session.beginTransaction();
			
			System.out.println("Saving employee.");
			session.save(employee);
			
			session.getTransaction().commit();
			System.out.println("Done.");*/
			
			
			//Develop code to retrieve an object by primary key. 
			
			/*Employee employee = new Employee();	
			
			employee.setIdEmployee(4);

			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Getting employee with id: "+employee.getIdEmployee());
			Employee myEmployeeData = session.get(Employee.class, employee.getIdEmployee());
			System.out.println("Get complete: " + myEmployeeData);

			session.getTransaction().commit();*/
			
			
			//Develop code to query objects to find employees for a given company. 
			
			/*session.beginTransaction();
			
			String company;
			
			System.out.println("Insert company name: ");
			Scanner s = new Scanner(System.in);
			
			company = s.next();
			
			List<Employee> employeeList = session.createQuery("from Employee s where s.company='"+company+"'").getResultList();
			
			if (!employeeList.isEmpty()) {
				System.out.println("Employees working in "+company+": "+employeeList);
			} else {
				System.out.println("There is no employees working in giving company.");
			}
			
			session.getTransaction().commit();
			System.out.println("Done.");*/
			
			//Develop code to delete an object by primary key. 
			
			
			int theId = 1;
			
			session.beginTransaction();
			
			Employee employee = session.get(Employee.class, theId);
			
			
			if (employee != null) {
				System.out.println("Deleting: " + employee);

				
				session.delete(employee);
			}
			
			session.getTransaction().commit();
			
			System.out.println("Done.");
			
			
		} catch (Exception e)  {
			
			System.out.println("Something went bad: "+e);
			
		}
		
		
		finally {
			factory.close();
		}
		
	}

}
