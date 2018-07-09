package atividade;

import atividade.classes.Director;
import atividade.classes.MagoBuilder;
import atividade.classes.Personagem;

public class Main {

	public static void main(String[] args) {
		// Criando personagem
		Personagem p = new Personagem();
		Director director = new Director();
		
		//Mago
		p = director.montar(new MagoBuilder());
	}

}
