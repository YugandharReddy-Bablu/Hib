package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String[] args) {
	
	
	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	 Transaction t = s.beginTransaction();
	 
	 
	 Passport n = new Passport();
	 n.setPnum("456@asd");
	 n.setPloc("zbd");
	 n.setPexpdate("2050");
	 
	 
	 Person p = new Person();
	 p.setPname("virat");
	 p.setPage(26);
	 p.setPqual("mca");
	 p.setPt(n);
	 
	 
	 n.setPer(p);
	 
	 s.save(n);
	 t.commit();
	 s.close();
	
}
}
