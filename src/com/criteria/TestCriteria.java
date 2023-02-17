package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import onetoone.Course;
import onetoone.Mobiles;
import onetoone.Passport;
import onetoone.Person;

public class TestCriteria {
public static void main(String[] args) {
	
	
	
	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	 
	  Criteria c = s.createCriteria(Person.class, "p");
	  c.createAlias("p.pt", "pp");
	  c.createAlias("p.mob", "m");
	  
	  List<Person> data =  c.list();
	  for (Person b : data) {
		
		  System.out.println("=====>> Person Details <<=====");
		  System.out.println(b.getPname()+"---"+b.getPage()+"---"+b.getPqual());
		  
		  Passport pass = b.getPt();
		  System.out.println("=====>> Passport Details <<=====");
		  if(pass!=null)
		  {
			  System.out.println(pass.getPnum()+"---"+pass.getPloc()+"---"+pass.getPexpdate());
		  }
		  
		  List<Mobiles> mobi = b.getMob();
		  System.out.println("=====>> Mobile Details <<=====");
		  if(mobi!=null)
		  {
			  for(Mobiles n : mobi)
			  {
			  System.out.println(n.getMnum()+"---"+n.getMsim());
			  }
		  }
		  
		  List<Course> cour = b.getCou();
		  System.out.println("=====>> Course Details <<=====");
		  if(cour!=null)
		  {
			  for(Course n : cour)
			  {
			  System.out.println(n.getCname()+"---"+n.getCfee()+"---"+n.getCdur());
			  }
		  }
		  
	  }
	
}
}
