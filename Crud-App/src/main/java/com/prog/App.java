package com.prog;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory= HibernateUtils.getSessionFactory();
    	Session session= factory.openSession();
    	
    	
    	//Student save
//    	Student st= new Student();
//    	st.setName("Becoder");
//    	st.setEmail("Becoder@gmail.com");
//    	st.setAddress("India");
//    	st.setCollegename("Mumbai University");
//    	
//    	Student st2= new Student();
//    	st2.setName("Becoder2");
//    	st2.setEmail("Becoder2@gmail.com");
//    	st2.setAddress("Bhutan");
//    	st2.setCollegename("Pune University");
//    	
//    	
//    	Transaction tx= session.beginTransaction();
//    	
//    	session.save(st);
//    	session.save(st2);
//    	
//    	tx.commit();
//    	
//    	System.out.println("Student Register Successfully....");
    	
    	
    	
    	//Read data
//    	
//    	List<Student> s=session.createQuery("from Student", Student.class).list();
//    	
//    	s.forEach(e->System.out.println(e));
    	
    	
    	
    	//Get by ID
//    	Student st= session.get(Student.class, 1);
//    	System.out.println(st);
    	
    	
    	//Update 
//    	Student st= session.get(Student.class, 1);
//    	st.setName("YCoder");
//    	st.setEmail("YCoder@gmail.com");
//    	st.setAddress("Bangladesh");
//    	st.setCollegename("Ghatak University");
//    	
//    	Transaction tx=session.beginTransaction();
//    	
//    	session.saveOrUpdate(st);
//    	tx.commit();
//
//    	System.out.println("Data Updated Successfully......");
    	

    	
    	
    	// Delete
//    	Student st= session.get(Student.class, 1);
//    	Transaction tx=session.beginTransaction();
//
//    	session.delete(st);
//    	
//    	
//    	
//    	tx.commit();
//    	System.out.println("Data deleted successfully....");
    	
    	session.close();
    	factory.close();
    }
}
