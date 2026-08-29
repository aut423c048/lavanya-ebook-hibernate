package in.mecw.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.mecw.entity.Student;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et =em.getTransaction();
		Student s = new Student();
		s.setId(5);
		s.setName("Kavinesh");
		s.setDept("CSE");
		s.setMark(95.00);
		et.begin();
		em.persist(s);
		et.commit();
		
				
		
	}

}
