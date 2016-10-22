package DB_Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyDatabase");
	public static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	public static void main(String[] args)
	{
		entityManager.close();
		entityManagerFactory.close();
	}
}
