import java.util.ArrayList;

public class TestaPolimorfismo {
	public static void main(String args[]) {
		
		ArrayList<Animal> animais= new ArrayList<>();
		
		Animal animal1 = new Animal("Cavalo", 4, 20, 0 );
		Peixe animal2 = new Peixe ("Salmão ", 2,2,0);
		Passaros animal3 = new Passaros ("tuiuiu", 2, 5, 0);
		Anfibio animal4 = new Anfibio ("Sapo", 4, 6, 0);
		
		animais.add(animal1);
		animais.add(animal2);
		animais.add(animal3);
		animais.add(animal4);
		for(Animal a: animais) {
			a.mover();
}
}
}
