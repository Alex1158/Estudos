package FrotaMotorizada;

import java.io.Serializable;

public abstract class Veiculo implements Serializable {

	private static final long  serialVersionUID = 1L;
	private   String marca;
	private   String modelo;
	private int ano;
	private String placa;
	
	public Veiculo(String marca, String modelo, int ano, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
	}
	public String toString() {
		String retorno = "";
		retorno += "Marca: "     + this.marca     + "\n";
		retorno += "Modelo: "    + this.modelo    + "\n";
		retorno += "Ano: "     + this.ano     + "\n";
		retorno += "Placa: "  +  this.placa        + "\n";
		retorno += "Caracteristica: "  + soar()   + "\n";
		return retorno;
	}
	public abstract String soar();
}
