package exemplo.classes;

public class CarroBuilder extends VeiculoBuilder {

	public void buildRoda() { veiculo.rodas = 4; }
	public void buildAssento() { veiculo.assentos = 4; }
	public void buildMotor() { veiculo.motor = "Motor de carro"; }	
}
