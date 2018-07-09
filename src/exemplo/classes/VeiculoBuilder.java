package exemplo.classes;

public abstract class VeiculoBuilder {
	
	protected Veiculo veiculo;

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public abstract void buildRoda();
	public abstract void buildAssento();
	public abstract void buildMotor();
}
