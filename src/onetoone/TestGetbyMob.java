package onetoone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class TestGetbyMob {
public static void main(String[] args) {
	

	Configuration con = new AnnotationConfiguration().configure();
	 SessionFactory sf = con.buildSessionFactory();
	 Session s = sf.openSession();
	
	 Query q = s.createQuery("select p.pname,p.page,p.pqual, m.mnum,m.msim from Person p inner join p.mob m where p.pname=:name");
	 q.setParameter("name", "bablu");
	
	  List<Object[]> n = q.list();
	  for(Object[] m : n)
	  {
	  System.out.println(m[0]+"--"+m[1]+"--"+m[2]+"--"+m[3]+"--"+m[4]); 
	  }
	
}
}