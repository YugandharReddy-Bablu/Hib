package onetoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestOtoMUpdate {
public static void main(String[] args) {
	
	
	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	  Person p = (Person) s.get(Person.class, 1);
	  
	  p.setPqual("maters");
	 
	  List<Mobiles> m = p.getMob();
		for(Mobiles n : m)
		{
		
			if(n.getMsim().equals("airtel"))
			{
				n.setMsim("uninor");
			}
		
		}
	  
	  s.update(p);
	  
	  t.commit();
	  s.close();

}
}
