import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OtoOFetch {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Customer c = session.get(Customer.class, 12);
		
		CustomerDetails cd = c.getCid();
	
		
		
		System.out.println(c);
		System.out.println(cd);
		
		
		transaction.commit();
	}

}
