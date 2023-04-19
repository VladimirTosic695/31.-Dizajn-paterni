package paket;

public class Main {

	public static void main(String[] args) {
		// Sva nabrajanja imaju dve unapred definisane metode
		
		// 1. values() - vraca niz i sadrzi niz konstanti definisanih u nabrajanju (tj boje)
		// 2. valuesOf() - vraca konstantu iz nabrajanja cija vrednost odgovara znakovnom nizu
		// prosledjenom argumentu
		
		Boja b; 
		
		System.out.println("Boje: ");
		
		Boja nizBoja[] = Boja.values();
		
		for(Boja c : nizBoja) {
			System.out.print(c + ", ");
		}
		
		Boja c1;
		c1 = Boja.valueOf("Bela");
		// vraca vrednost iz nabrajanja koja odgovara imenu zadate konstante
		
		System.out.println("\nBoja: " + c1);

	}

}
