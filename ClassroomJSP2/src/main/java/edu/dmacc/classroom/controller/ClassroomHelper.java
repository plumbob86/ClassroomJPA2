package edu.dmacc.classroom.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.dmacc.classroom.model.ClassroomModel;
import edu.dmacc.classroom.model.StudentModel;

public class ClassroomHelper {
	
	/*public static void main(String[] args) throws Exception {
		ClassroomMain poe = new ClassroomMain();
		poe.go();
	}*/
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClassroomJSP2");
	
	public void persistClassroom(ClassroomModel model) throws Exception{
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(model);
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	public void persistStudent(StudentModel model) throws Exception{
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(model);
		manager.getTransaction().commit();
		manager.close();
		
	}

	@SuppressWarnings("unchecked")
	public List<ClassroomModel> showAllClassrooms() {
		EntityManager em = factory.createEntityManager();
		List<ClassroomModel> allItems = em.createQuery("SELECT i FROM ClassroomModel i").getResultList();
		return allItems;
	}
	
	

}
