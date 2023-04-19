package paket;

public class Main {

	public static void main(String[] args) {
		
		
		// Nabrajanje je vrsta klase. Instanca klase ne pravi se pomocu kljucne reci new
		// Rezervisana rec Enum definise klasu
		// Svaka konstanta definisana u nabrajanju je objekat ciji tip je to isto nabrajanje
		
		Boja b;
		
		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());
		
		
		System.out.println("Sve boje: ");
		for(Boja c : Boja.values()) {
			System.out.print(c + " (" + c.getUdeo() + "), ");
		}

	}

}
