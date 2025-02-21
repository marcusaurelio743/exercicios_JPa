package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		Produto produto = new Produto("Fonte ATX", 300.00);
		DAO<Produto> produtoDao = new DAO<Produto>(Produto.class);
		produtoDao.abrirT().Incluir(produto).fecharT().fechar();
	}

}
