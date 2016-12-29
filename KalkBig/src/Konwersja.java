
public class Konwersja {

	public static void main(String[] args) { 
		
		
		
		byte a= 65;
		int c = 2;
		double b = 3.5;
		double kon2 = c/b; //konwersja automatyczna
		String napis = "10";
		int wynik= 20 + Integer.parseInt(napis);
		
		char kon1 = (char)a; // byte to char
		System.out.println(kon1); 
		System.out.println((char) (kon1 + c)); // int na char
		System.out.println(kon2);
		System.out.println(wynik);
		
	}
}
