
public class Anfibio extends Animal {
	public Anfibio(String nome,int patas, double velocidade,int localizacao) {
		super(nome, patas,velocidade, localizacao);
	}
	public void mover() {
		super.setLocalização(getLocalização()+1);
		System.out.println("Passaro \n ^ V ^ V ^ V ^ V  \n " + "Local atual " + (super.getLocalização()* super.getLocalização()));
	}

}
