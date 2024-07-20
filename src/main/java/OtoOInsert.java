import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OtoOInsert {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		CustomerDetails cd = new CustomerDetails(5,"david@gmail.com","98771652");
		
		Customer c = new Customer(15,"david");
		
		c.setCid(cd);
		
		session.save(c);
		
		
		
		System.out.println(cd);
		
		
		transaction.commit();
	}

}
