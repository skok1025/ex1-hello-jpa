package hello.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
	public static void main(String[] args) {
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("hello");
		
		EntityManager em = enf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		try {
			/* INSERT */
//			Member member = new Member();
//			member.setId(2L);
//			member.setName("helloB");
//			em.persist(member);
			
			/* UPDATE */
//			Member findMember = em.find(Member.class, 1L);
//			findMember.setName("Hello JPA");
			
			/* SELECT */
//			List<Member> resultList = 
//					em.createQuery("SELECT m FROM Member as m", Member.class)
//					.setFirstResult(0)
//					.setMaxResults(2)
//					.getResultList();
//			
//			for (Member member : resultList) {
//				System.out.println(member);
//			}
			
			Member member = new Member(200L, "member200");
			em.persist(member);
			em.flush();
			
			System.out.println("=======end=========");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		} finally {
			em.close();
		}
		
		enf.close();
	}

}
