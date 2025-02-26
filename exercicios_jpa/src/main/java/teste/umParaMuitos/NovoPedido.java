package teste.umParaMuitos;

import java.util.Date;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.ItemPedido;
import modelo.umparamuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		Pedido pedido = new Pedido(new Date());
		Produto produto = new Produto("Geladeira",27500.0);
		
		ItemPedido itemPedido = new ItemPedido(pedido, produto, 10);
		
		dao
			.abrirT()
			.Incluir(produto)
			.Incluir(pedido)
			.Incluir(itemPedido)
			.fecharT()
			.fechar();
	}

}
