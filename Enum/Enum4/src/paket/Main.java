package paket;

public class Main {

	public static void main(String[] args) {
		
		
		// ordinal() - ovom metodom se dobija redni broj tj polozaj date konstante na listi 
		// konstanti u nabrajanju. Redni brojevi pocinju od 0.
		
		
		System.out.println("Boja - redni broj ");
		for(Boja b : Boja.values()) {
			System.out.println (b + " "+ b.ordinal());
		}
		
		// compareTo() - metoda poredi redne brojeve dve konstante iz istog nabrajanja
		// Ako je redni broj pozivajuce konstante manji od rednog broja konstante, 
		// metoda compareTo() vraca negativan broj
		
		// Ukoliko su redni brojevi jednaki metoda vraca 0
		// Ako pozivajuca konstanta ima redni broj veci od rednog broja konstante,
		// metoda vraca pozitivan broj
		
		Boja b1, b2, b3;
		
		b1 = Boja.Crvena;
		b2 = Boja.Zelena;
		b3 = Boja.Plava;
		
		if(b1.compareTo(b2) < 0) {
			System.out.println(b1 + " dolazi pre " + b2);
		}
		if(b1.compareTo(b2) > 0) {
			System.out.println(b2 + " dolazi pre " + b1);
		}
		if(b1.compareTo(b2) == 0) {
			System.out.println(b1 + " = " + b2);
		}
		
		// equals() - poredi jednakost konstante iz nabrajanja sa svakim drugim objektom
		
		if(b1.equals(b2)) {
			System.out.println("Greska");
		}
		if(b1.equals(b3)) {
			System.out.println(b1 + " jednako " + b3); 
		}
		if(b1 == b3) {
			System.out.println(b1 + " == " + b3);
		}
		
	}

}
