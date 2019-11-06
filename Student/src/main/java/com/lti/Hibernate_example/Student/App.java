package com.lti.Hibernate_example.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    
    	Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder =
    			new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	SessionFactory factory= configuration.buildSessionFactory(builder.build());
    	Session session = factory.openSession();
    	
    	StudentNew student = new StudentNew();
    	student.setStudent_name("Ila");
    	student.setCourse_id(11);
    	student.setCollege_name("GLBITM");
    	session.beginTransaction();
    	session.save(student);
    	session.getTransaction().commit();
    }
}
