
public class Animal {
	private String nome;
	private int patas;
	private double velocidade;
	private int localizacao;
	
	public Animal(String nome,int patas, double velocidade,int localizacao) {
		this.nome = nome;
		this.patas = patas;
		this.velocidade = velocidade;
		this.localizacao = localizacao;		
	}
	
	public void mover() {
		System.out.println("Animal \n"+ "-_-_-_-_-_-_-_ \n Local Atual " + (this.localizacao*this.velocidade));
		this.localizacao++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	public int getLocalização() {
		return localizacao;
	}
	public void setLocalização(int localização) {
		this.localizacao = localização;
	}
	
	
}
