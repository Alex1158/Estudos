
public class Peixe extends Animal {
	private boolean agua;
	
	public Peixe(String nome,int patas, double velocidade,int localizacao) {
		super(nome, patas, velocidade, localizacao);		
	}

	public boolean isAgua() {
		return agua;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}
	
	public void mover() {
		super.setLocalização(super.getLocalização() + 1);
		System.out.println("Peixe \n  ~~ ~~ ~~ ~~ ~~ ~~ ~~ \n Local Atual " + (super.getLocalização()*super.getVelocidade()));
		
	}
	
	

}
