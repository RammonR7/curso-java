package model;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		ContatoDao dao =  new ContatoDao();
		
		Contato c1 = new Contato();
		c1.setNome("Michael");
		c1.setSobrenome("Laudrap");
		c1.setIdade(28);
		c1.setTelefone("769833-9329");
		
		Contato c2 = new Contato();
		c2.setId(1l);
		c2.setNome("Michael");
		c2.setSobrenome("Owen");
		c2.setIdade(28);
		c2.setTelefone("769833-9329");
		
		Contato c4 = new Contato();
		c4.setId(4l);
		c4.setNome("Brian");
		c4.setSobrenome("Laudrap");
		c4.setIdade(25);
		c4.setTelefone("769785-9325");
		
		/*Contato c5 = new Contato();
		c5.setId(4l);
		c5.setNome("Laudrap");
		c5.setSobrenome("Brian");
		c5.setIdade(25);
		c5.setTelefone("789785-9325");
		
		dao.editarDao(c5);/**/ 
		
		
		List<Contato> contatos = new ArrayList<>();
		contatos = dao.consultarDao();
		for(Contato contato : contatos) {
			System.out.println(contato.getNome()+ " "+contato.getSobrenome());
		}
		
		//dao.salvarDao(c4);
		
		//dao.salvarDao(c2);
		
		
		
		
		//dao.salvarDao(c1);
		


	}

}
