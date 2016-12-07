/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample;

import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gabi
 */
public class Hibernatesample {

    private static SessionFactory factory;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            factory = configuration.buildSessionFactory();
            Session session = factory.openSession();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            System.exit(0);
            
        }     
        
        addEmployee("Ionescu", "Marius", 1000);
        
        listEmployees();
        
        factory.close();
    }
    
     public static boolean addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Employee employee = new Employee();
         employee.setId(5);
         employee.setFirst_name(fname);
         employee.setLast_name(lname);
         employee.setSalary(salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return (employeeID>0);
   }
     
      public static void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = 
                           employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("Id is: " + employee.getId()); 
            System.out.print("First Name is: " + employee.getFirst_name()); 
            System.out.print("  Last Name is: " + employee.getLast_name()); 
            System.out.println("  Salary is: " + employee.getSalary()); 
            System.out.println("---------------------------------");
         }
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }

}
