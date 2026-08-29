package in.mecw.driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.mecw.entity.Student;

public class FindDriver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student s = em.find(Student.class,1);
		s.setName("Juliet");
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println(s);
		
		
	}

}
