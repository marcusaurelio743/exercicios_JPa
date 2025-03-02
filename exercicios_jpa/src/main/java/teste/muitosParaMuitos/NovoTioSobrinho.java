package teste.muitosParaMuitos;

import infra.DAO;
import modelo.muitosparamuitos.Sobrinho;
import modelo.muitosparamuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		Tio tio1 = new Tio("Maria");
		Tio tio2 = new Tio("Jose");
		
		Sobrinho sobrinho1 = new Sobrinho("Marcos");
		Sobrinho sobrinho2 = new Sobrinho("Marta");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<Object>();
		dao.abrirT()
			.Incluir(tio1)
			.Incluir(tio2)
			.Incluir(sobrinho1)
			.Incluir(sobrinho2)
			.fecharT()
			.fechar();
		
		
	}

}
