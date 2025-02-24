package teste.basico;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAcenteumParaUm {

	public static void main(String[] args) {
		Assento assento = new Assento("6C");
		Cliente cliente = new Cliente("Amanda", assento);
		
		DAO<Object> dao = new DAO<Object>();
		dao.abrirT().Incluir(assento).Incluir(cliente).fecharT().fechar();
		
	}

}
