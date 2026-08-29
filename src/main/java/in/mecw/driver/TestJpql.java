package in.mecw.driver;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import in.mecw.entity.Student;

public class TestJpql {
	public static void main(String[] args) {
		EntityManagerFactory emf = 	Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Student> query  = em.createQuery("select s from student s",Student.class);
		List<Student> l = query.getResultList();
		
	} 

}
