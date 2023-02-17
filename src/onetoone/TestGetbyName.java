package onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestGetbyName {
public static void main(String[] args) {
	
	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	
	 Query q = s.createQuery("from Person p where p.pname=:name");
	 q.setParameter("name", "bablu");
	
	  List<Person> n = q.list();
	  for(Person m : n)
	  {
	  System.out.println("Person details=="+m.getPname()+"---"+m.getPqual());
	  System.out.println("Passport details=="+m.getPt().getPnum()+"---"+m.getPt().getPexpdate());
	  List<Mobiles> b = m.getMob();
	  System.out.println("mobile details---");
	  for(Mobiles d : b)
	  {
	  System.out.println(d.getMnum()+"----"+d.getMsim());
	  }
	 
	  }
	
	
}
}
