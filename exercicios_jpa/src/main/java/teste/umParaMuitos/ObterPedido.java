package teste.umParaMuitos;

import infra.DAO;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class ObterPedido {
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<Pedido>(Pedido.class);
		
		Pedido pedido = dao.buscaPorId(14L);
		
		for (ItemPedido pedidos : pedido.getItens()) {
			System.out.println(" |"+pedidos.getQuantidade());
		}
	}
}
