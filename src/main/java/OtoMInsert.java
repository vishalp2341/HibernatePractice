import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OtoMInsert {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		config.addAnnotatedClass(Orders.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		CustomerDetails cd = new CustomerDetails(5,"david@gmail.com","98771652");
		
		Customer c = new Customer(14,"David");
		
		Orders o1 = new Orders(21, "Burger", "250");
		Orders o2 = new Orders(22, "Fries", "150");
		Orders o3 = new Orders(23, "Coke", "100");
		
		o1.setCustomer(c);
		o2.setCustomer(c);
		o3.setCustomer(c);


		
		session.save(o1);
		session.save(o2);
		session.save(o3);
		
		
		
		transaction.commit();
	}

}
