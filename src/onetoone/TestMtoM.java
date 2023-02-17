package onetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestMtoM {
	
	
	
	
	
	
	public static void main(String[] args) {
		Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
		 SessionFactory sf = con.buildSessionFactory();
		 Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Course c1 = new Course();
		c1.setCname("project"); c1.setCdur(36); c1.setCfee(76543.99);
		
		
		List<Person> p = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setPname("ram");
		p1.setPage(24);
		p1.setPqual("mca");
		
		Person p2 = new Person();
		p2.setPname("virat");
		p2.setPage(34);
		p2.setPqual("msc");
		
		Person p3 = new Person();
		p3.setPname("bablu");
		p3.setPage(22);
		p3.setPqual("btech");
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		c1.setPcou(p);
		
		s.save(c1);
		t.commit();
		s.close();
		
		
	}
	
	
public static void main1(String[] args) {
	
	
	Configuration con = new AnnotationConfiguration().configure("hibernate.cfg.xml");
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	
	Person p = new Person();
	p.setPname("siva");
	p.setPage(23);
	p.setPqual("mtech");
	
	
	List<Course> c = new ArrayList<>();
	
	Course c1 = new Course();
	c1.setCname("java"); c1.setCdur(45); c1.setCfee(3850.99);
	
	
	Course c2 = new Course();
	c2.setCname("mysql"); c2.setCdur(15); c2.setCfee(2345.99);
	
	Course c3 = new Course();
	c3.setCname("hib"); c3.setCdur(35); c3.setCfee(4567.99);
	
	c.add(c1);
	c.add(c2);
	c.add(c3);
	
	p.setCou(c);
	
	s.save(p);
	
	t.commit();
	s.close();
	
}
}
