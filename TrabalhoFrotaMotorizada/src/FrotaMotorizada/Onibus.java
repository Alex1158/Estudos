package FrotaMotorizada;

public class Onibus extends Veiculo {

	private static final long serialVersionUID = 1L;

	public String soar() {
		return "40 assentos ";
	}
	public Onibus(String marca, String modelo, int ano, String placa) {
		super(marca, modelo, ano, placa);
	}
}