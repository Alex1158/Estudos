package zoologico;

public class Reptil extends Animal {


	private double temperatura;
	private boolean venenoso;
	
	
	
	public Reptil (String habitatNatural, String nome, double temperatura, boolean venenoso) {
		super (habitatNatural, nome); // parametros da superclasse.
		this.temperatura = temperatura;
		this.venenoso = venenoso;
	}
	
	public String toString() {
		return super.toString() + "\n Reptil \n"+ "Temperatura: " + this.temperatura + "\t venenoso: " + this.venenoso;
	}
	
	
	
}

