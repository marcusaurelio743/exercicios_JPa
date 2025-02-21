package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E > {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios_jpa");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public DAO() {
		this(null);
	}
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	public DAO<E> Incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	public DAO<E> IncluirAtomico(E entidade){
		
		return this.abrirT().Incluir(entidade).fecharT();
	}
	public List<E> obterTodos(){
		return obterTodos(50, 0);
	}
	public List<E> obterTodos(int qtd, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe está nula");
		}
		String jpql = "select e from "+classe.getName()+" e";
		TypedQuery<E> query = em.createQuery(jpql,classe);
		query.setMaxResults(qtd);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public void fechar() {
		em.close();
	}
	

}
