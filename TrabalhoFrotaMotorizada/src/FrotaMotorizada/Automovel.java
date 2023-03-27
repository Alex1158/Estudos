package FrotaMotorizada;

public class Automovel extends Veiculo {

	private static final long serialVersionUID = 1L;

	public String soar() {
		return "Motor 1.0 ";
	}
	public Automovel(String marca, String modelo, int ano, String placa) {
		super(marca, modelo, ano, placa);
	}
}
