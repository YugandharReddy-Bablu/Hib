package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestGet {
public static void main(String[] args) {
		
		
		Configuration con = new AnnotationConfiguration().configure();
		 SessionFactory sf = con.buildSessionFactory();
		 Session s = sf.openSession();
		 
		 
		Person p = (Person) s.get(Person.class, 1);
		 
		System.out.println(p.getPid()+"--"+p.getPname()+"--"+p.getPage()+"--"+p.getPqual());
		
		Passport p1 =  p.getPt();
		System.out.println(p1.getPpid()+"--"+p1.getPnum()+"--"+p1.getPloc()+"--"+p1.getPexpdate());
		
		
		 s.close();
	
	
}
}
