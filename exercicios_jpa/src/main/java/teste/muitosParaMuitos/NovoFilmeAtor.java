package teste.muitosParaMuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme filme1 = new Filme("star wars", 8.7);
		Filme filme2 = new Filme("O fugitivo", 7.7);
		Ator ator1 = new Ator("Harrison ford");
		Ator ator2 = new Ator("Carrie Fisher");
		filme2.AddAtor(ator1);
		filme1.AddAtor(ator1);
		filme1.AddAtor(ator2);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao
		.IncluirAtomico(filme1)
		;
		
	}

}
