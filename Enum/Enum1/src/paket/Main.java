package paket;

	// Nabrajanje je lista imenovanih vrednosti koje definisu nov tip podataka i njegove 
	// dozvoljene vrednosti. To znaci da nabrajanje moze da sadrzi samo vrednosti koje su navedene
	// na listi. Druge vrednosti nisu  dozvoljene.

public class Main {

	public static void main(String[] args) {
		
		Boje b; // prost tip podatka (bez new Boje)
		
		b = Boje.Crvena; // inicijalizacija promenljive
		
		System.out.println("Boja: " + b);
		
		b = Boje.Zuta;
		
		if (b == Boje.Plava) {
			System.out.println("Plava");
		}
		
		switch (b) {
		
		case Crvena:
			System.out.println("Crvena");
			break;
		case Zelena:
			System.out.println("Zelena");
			break;
		case Plava:
			System.out.println("Plava");
			break;
		case Crna: 
			System.out.println("Crna");
			break;
		case Bela: 
			System.out.println("Bela");
			break;
		case Narandzasta: 
			System.out.println("Narandzasta");
			break;
		case Zuta: 
			System.out.println("Zuta");
			break;
		default:
			System.out.println("Ta boja nije unutar nabrajanja");
		}
	
		
		

	}

}
