package paket;

public class Main {
	
	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main (String[] args) {
		
		DivljaPatka patka = new DivljaPatka();
		
		Curka curka = new DivljaCurka();
		
		// Umotavamo Curku u CurkaAdapter zahvaljujuci kome ce izgledati kao Patka
		
		Patka CurkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Curka ");
		curka.curlice();
		curka.leti();
		
		System.out.println("Patka ");
		testPatka(patka);
		
		// pokusavamo da maskiramo tj poturimo Curku kao Patku
		System.out.println("AdapterCurka ");
		testPatka(CurkaAdapter); // metoda testPatka ne zna da je dobila Curku prerusenu u patku
		
		
		
	}

}
