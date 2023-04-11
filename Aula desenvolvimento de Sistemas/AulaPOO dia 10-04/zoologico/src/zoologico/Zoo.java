package zoologico;
import java.util.Scanner;

public class Zoo  {
	
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Nome do animal");
			String nome = (sc.next());
			sc.reset();
			System.out.println("Habitat do animal");
			String habitat = (sc.next());	
			sc.reset();
			Animal zebra = new Animal (habitat, nome);
			
			System.out.println("Altura do animal");
			zebra.setAltura(sc.nextDouble());
			System.out.println("Peso do animal");
			zebra.setPeso(sc.nextDouble());	
			sc.reset();
			
			//System.out.println(zebra.toString());
			
			Recinto recinto1 = new Recinto();
			recinto1.setArea(150);
			recinto1.setBioma("Savana");
			recinto1.setAnimal(zebra);
			System.out.println(recinto1.toString());
			
			Reptil cobra = new Reptil("Cerrado", "Coral", 36.0, true);
			cobra.alimentado();
			
			
			Recinto recinto2 = new Recinto();
			recinto2.setBioma("Antartico");
			recinto2.setAnimal(cobra);
			zebra.alimentado();
			System.out.println(cobra.toString());
			
			Ave pinguim = new Ave ("Antartico", "Pinguin Imperador",5, true, true);
			System.out.println(pinguim.toString());
			
			
			
			sc.close();
	}
}
