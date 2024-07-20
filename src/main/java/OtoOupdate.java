import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OtoOupdate {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Customer c = session.get(Customer.class, 12);
		
		c.getCid().setEmail("hi@gmail.com");
		session.update(c);
		
		System.out.println(c);

		
		
		transaction.commit();
	}

}
