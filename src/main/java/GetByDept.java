import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class GetByDept {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		SessionFactory sessionfactory = config.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query hql = session.createQuery("from Employee where dept = 'HR'",Employee.class);
		
		List<Employee> employees = hql.list();
		
		for(Employee emp:employees)
		{
			System.out.println(emp);
		}
			
		transaction.commit();

	}

}
