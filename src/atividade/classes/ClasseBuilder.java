package atividade.classes;

public abstract class ClasseBuilder {

	protected Personagem personagem;

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	public abstract void buildVida();
	public abstract void buildMana();
	public abstract void buildForca();
	public abstract void buildDefesa();
	public abstract void buildInteligencia();
}
