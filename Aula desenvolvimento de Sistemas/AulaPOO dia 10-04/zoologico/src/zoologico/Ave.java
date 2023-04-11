package zoologico;

public class Ave extends Animal {
	
	private int ovos;
	private boolean voa;
	private boolean mergulha;
	
	public Ave (String habitatNatural, String nome, int ovos, boolean voa, boolean mergulha) {
		super (habitatNatural, nome); // parametros da superclasse.
		this.ovos = ovos;
		this.voa = voa ;
		this.mergulha = mergulha;
	}
	
	public String toString() {
		return super.toString() + "\n Ave \n"+ "ovos: " + this.ovos + "\t voa: " + this.voa + "\t mergulha "+ this.mergulha;
	}

	
	public int getOvos() {
		return ovos;
	}
	public void setOvos(int ovos) {
		this.ovos = ovos;
	}
	public boolean getVoa() {
		return voa;
	}
	public void setVoa(boolean voa) {
		this.voa = voa;
	}
	public boolean getMergulha() {
		return mergulha;
	}
	public void setMergulha(boolean mergulha) {
		this.mergulha = mergulha;
	}
		
	

}
