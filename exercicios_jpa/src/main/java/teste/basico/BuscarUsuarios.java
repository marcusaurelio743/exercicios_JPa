package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class BuscarUsuarios {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios_jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql,Usuario.class);
		//limita a quantidade de resultado da classe
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();
		usuarios.stream().forEach(System.out::println);
		
		
		em.close();
		emf.close();
	}

}
