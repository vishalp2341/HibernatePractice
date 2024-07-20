import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PrintCdOdC {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Customer.class);
		config.addAnnotatedClass(CustomerDetails.class);
		config.addAnnotatedClass(Orders.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();

		Customer c = session.get(Customer.class, 14);

		CustomerDetails cd = c.getCid();

		List<Orders> orders = c.getOrders();

		System.out.println(c);
		System.out.println(cd);

		for (Orders order : orders) {
			System.out.println(order);
		}

		transaction.commit();
	}

}
