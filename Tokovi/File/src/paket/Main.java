package paket;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\Vladimir\\Desktop\\vladimir.java");
		
		System.out.println("Fajl: " + f.getName() + (f.isFile() ? " je fajl " : " nije fajl"));
		System.out.println("Apsolutna putanja " + f.getAbsolutePath());
		System.out.println(f.exists() ? "Fajl postoji " : "fajl ne postoji");
		System.out.println(f.isDirectory() ? "Direktorijum " : "Fajl");
		System.out.println(f.canRead() ? "fajl moze biti procitan" : "fajl ne moze biti procitan");
		System.out.println(f.canWrite() ? "Omoguceno je ispisivanje" : "Nije omoguceno ispisivanje");
		System.out.println("Velicina: " + f.length());
		System.out.println("Poslednja promena fajla: " + f.lastModified());
		
		
		
	}

}
