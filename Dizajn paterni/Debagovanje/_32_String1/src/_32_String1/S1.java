package _32_String1;

public class S1 {

	public static void main(String[] args) {

		String str = "kdjabvpiuovnaos;n1563";

		System.out.println(str);

		// Kreiranje Stringa pomocu kljucne reci new
		String st = new String("Utorak, 24. Januar");
		System.out.println(st);

		// Inicijalizacija Stringa postojecim Stringom
		String s1 = "Podatak1";
		System.out.println(s1);
		String s2 = new String(s1);
		System.out.println(s2);

		// Inicijalizacija nizom char vrednosti
		char s3[] = { 'J', 'a', 'v', 'a' };

		System.out.println(s3);

		// Inicijalizacija podnizom
		// od s3 stringa, elementi od prvog do treceg
		// da bismo ovo uradili moramo prvo da imamo niz
		String s4 = new String(s3, 1, 3);
		String s5 = new String();

		System.out.println(s4);
		System.out.println("neki: " + s5);

		// Metoda charAt vraca karakter tipa char sa zadate pozicije u stringu.
		// Indeksiranje ide od 0.

		char ch2;
		String s6 = "Januar";

		ch2 = s6.charAt(0);
		System.out.println("Prvi karakter reci Januar: " + ch2);

		char ch3[] = { 'J', 'a', 'v', 'a' };
		String s7 = new String(ch3);
		// Duzina Stringa se dobija metodom length
		System.out.println("String = " + s7);
		System.out.println("Lenght = " + s7.length());
		System.out.println("Lenght = " + "Java programiranje".length());

		// Metoda equals vrsi leksikografsko poredjenje stringova, pri cemu se pravi
		// razlika izmedju // velikih i malih slova. Vraca true ako su stringovi isti, u
		// suprotnom vraca false.

		// Metoda iqualsIgnoreCase leksikograski poredi stringove, ali ne pravi razliku
		// izmedju malih i velikih slova.

		// Metoda copareTo poziva se kao: // s1.compareTo(s2) // vraca 0 ako su s1 i s2
		// jednaki, negativan broj ako je s1 manji, pozitivan broj ako je s1 veci od s2.

		String s8 = "JAVA";
		String s9 = "JAVA";
		String s10 = "Java";
		
		System.out.println(s8 + " equals " + s9 + " = " + s8.equals(s9));
		System.out.println(s8 + " equals " + s10 + " = " + s8.equals(s10));
		System.out.println(s8 + " equals " + s9 + " = " + s8.equalsIgnoreCase(s10));
		System.out.println(s8 + " == " + s10 + " = " + (s8 == s10));
		System.out.println(s8 + " == " + s9 + " = " + (s8 == s9));
		
		
		String s16 = "JAVA";
		String s17 = "JAVA";
		String s18 = "Java";
		System.out.println(s16 + " compare to " + s17 + " = " + s16.compareTo(s17));
		System.out.println(s16 + " compare to " + s18 + " = " + s16.compareTo(s18));
		System.out.println(s17 + " compare to " + s18 + " = " + s17.compareTo(s18));
		
		
	}

}
