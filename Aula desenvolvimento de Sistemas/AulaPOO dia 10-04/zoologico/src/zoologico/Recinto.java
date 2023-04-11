package zoologico;

public class Recinto {
	private double area;
	private String bioma;
	private Animal animal;
	
	public double getArea() {
		return this.area;
	}
	 public void setArea(double area){
		 this.area = area;
	 }
	 
	 public String getBioma() {
		 return this.bioma;
	 }
	 
	 public void setBioma(String bioma) {
		 this.bioma = bioma;
	 }
	 
	 public Animal getAnimal() {
		 return this.animal;
	 }
	 
	 public void setAnimal(Animal animal) {
		 String habitat = animal.getHebitatNatural();
		 if(habitat.equals(this.bioma)) {
			 this.animal = animal;
		 }else {
			 System.out.println("Este recinto eh de um bioma incompativel"
			 		+ " com o habitat do animal " + animal.getNome());
		 }
	 }
	 
	 public String toString() {
		 return "Area:" + this.area + 
				 "\t Bioma: " + this.bioma +
				 "\n Animal \n" + this.animal.toString();
	 }
}