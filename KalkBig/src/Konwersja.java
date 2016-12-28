
public class Konwersja {

	public static void main(String[] args) { 
		
		
		
		byte a= 65;
		int c = 2;
		double b = 3.5;
		char znak = 'v';
		String napis = "vulpix";
		
		char kon1 = (char)a; // byte to char
		System.out.println(kon1); 
		System.out.println((char) (kon1 + c)); // int na char
	}
}
