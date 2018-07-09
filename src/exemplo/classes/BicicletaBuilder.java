package exemplo.classes;

public class BicicletaBuilder extends VeiculoBuilder {

	public void buildRoda() { veiculo.rodas = 2; }
	public void buildAssento() { veiculo.assentos = 1; }
	public void buildMotor() { veiculo.motor = "Sem Motor"; }	
}

