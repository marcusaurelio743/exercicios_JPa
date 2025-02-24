package teste.basico;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {
		DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
		Cliente  cliente = dao.buscaPorId(4L);
		System.out.println(cliente.getAssento().getCliente().getNome());
		System.out.println(cliente.getAssento().getNome());
		dao.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.buscaPorId(1L);
		System.out.println(assento.getCliente().getNome());
		System.out.println(assento.getNome());
	}

}
