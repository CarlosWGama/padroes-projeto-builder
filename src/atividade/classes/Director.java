package atividade.classes;

public class Director {

	public Personagem montar(ClasseBuilder builder) {
		Personagem p = new Personagem();
		builder.setPersonagem(p);

		builder.buildDefesa();
		builder.buildForca();
		builder.buildInteligencia();
		builder.buildMana();
		builder.buildVida();
		
		return builder.getPersonagem();
	}
}
