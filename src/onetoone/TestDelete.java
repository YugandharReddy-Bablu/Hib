package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestDelete {
public static void main(String[] args) {
		
		
		Configuration con = new AnnotationConfiguration().configure();
		 SessionFactory sf = con.buildSessionFactory();
		 Session s = sf.openSession();
		 Transaction t = s.beginTransaction();
		 
		Person p = (Person) s.get(Person.class, 4);
		 
		s.delete(p);
		 t.commit();
		 s.close();
	
	
}
}
