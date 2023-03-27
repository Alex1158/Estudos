package FrotaMotorizada;

public class Caminhao extends Veiculo {

	private static final long serialVersionUID = 1L;
	
	public String soar() {
		return "23 toneladas";
	}
	public Caminhao(String marca, String modelo, int ano, String placa) {
		super(marca, modelo, ano, placa);
	}
}