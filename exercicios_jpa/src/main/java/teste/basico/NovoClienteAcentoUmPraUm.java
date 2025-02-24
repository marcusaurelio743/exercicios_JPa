package teste.basico;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAcentoUmPraUm {

	public static void main(String[] args) {
		Assento assento = new Assento("5D");
		Cliente cliente = new Cliente("Maria", assento);
		
		DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
		dao.IncluirAtomico(cliente);
	}

}
