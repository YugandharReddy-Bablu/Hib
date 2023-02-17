package onetoone;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class TestOtoM {
public static void main(String[] args) {
	
	
	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	 Transaction t = s.beginTransaction();
	 
	 
	 Person p = new Person();
	 p.setPname("bablu");
	 p.setPage(26);
	 p.setPqual("mtech");
	 
	 Passport pt = new Passport();
	 pt.setPnum("bed@345");
	 pt.setPloc("sed");
	 pt.setPexpdate("2030");
	 pt.setPer(p);
	 
	 
	 Mobiles m1 = new Mobiles();
	 m1.setMnum("4235");
	 m1.setMsim("airtel");
	 m1.setPmob(p);
	
	 
	 Mobiles m2 = new Mobiles();
	 m2.setMnum("1233");
	 m2.setMsim("vi");
	 m2.setPmob(p);
	 
	 Mobiles m3 = new Mobiles();
	 m3.setMnum("7777");
	 m3.setMsim("bsnl");
	 m3.setPmob(p);
	 
	List<Mobiles> a = new ArrayList();
	a.add(m1);
	a.add(m2);
	a.add(m3);
	
	List<Course> co = new ArrayList<>();
	
	Course c = new Course();
	
	c.setCname("java");c.setCdur(45);c.setCfee(456.2);
	
    Course c1 = new Course();
	
	c1.setCname("pythan");c1.setCdur(55);c1.setCfee(863.2);
	
    Course c2 = new Course();
	
	c2.setCname("mysql");c2.setCdur(85);c2.setCfee(63.23);
	
	co.add(c);co.add(c1);co.add(c2);
	 
	p.setPt(pt);
	p.setMob(a);
	p.setCou(co);
	s.save(p);
	
	t.commit();
	s.close();
	
}

}
