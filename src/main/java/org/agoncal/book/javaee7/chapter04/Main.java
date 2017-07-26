package org.agoncal.book.javaee7.chapter04;
public class Main{
	public static void main(String[] args){
		Book book = new Book("H2G2", "Автостопом по галактике", 12.5F, "1-84023-742-2", 354, false);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter04PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(book);
		tx.commit();
		em.close();
		emf.close();
	}
}	