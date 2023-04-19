package paket;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Za UI operacija Java koristi tokove (stream)
		
		// Klasa koja omogucuje da se poveze tastatura sa stream-om
		DataInputStream dis = new DataInputStream(System.in);
		
		
		// Povezivanje fajla sa klasom FileOutputStream
		FileOutputStream fos = new FileOutputStream("rezultat.txt");
		
		System.out.println("Unesite string (unos prekinite unosom znaka $)");
		
		// read()
		// write()
		
		char ch;
		
		while((ch = (char) dis.read()) != '$') {
			fos.write(ch);
			
		}
		fos.close();
		
		
		
		
		

	}

}
