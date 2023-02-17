package onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestOtoMGet {
public static void main(String[] args) {
	
	
	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	
	  Person p = (Person) s.get(Person.class, 1);
	  
	  System.out.println(p.getPid()+"--"+p.getPname()+"--"+p.getPage()+"--"+p.getPqual());
		
	  
	  
		List<Mobiles> m = p.getMob();
		for(Mobiles n : m)
		{
			System.out.println(n.getMid()+"--"+n.getMnum()+"--"+n.getMsim());
		}
		
		s.close();
		
	  
}
}
