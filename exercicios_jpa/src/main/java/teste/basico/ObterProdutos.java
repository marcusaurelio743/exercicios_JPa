package teste.basico;

import java.util.List;

import infra.ProdutoDao;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		ProdutoDao dao = new ProdutoDao();
		List<Produto> produtos = dao.obterTodos();
		
		produtos.stream().forEach(System.out::println);
		
	}

}
