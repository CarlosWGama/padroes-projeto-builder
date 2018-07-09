package exemplo.classes;

public class Director {

	public Veiculo montar(VeiculoBuilder builder) {
		Veiculo v = new Veiculo();
		builder.setVeiculo(v);
		
		builder.buildAssento();
		builder.buildRoda();
		builder.buildMotor();
		
		return builder.getVeiculo();
	}
}
