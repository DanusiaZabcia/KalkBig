
public class Konwersja {

	public static void main(String[] args) { 
		
		
		
		byte a= 65;
		int c = 2;
		double b = 3.5;
		char znak = 'v';
		double kon2 = c/b; //konwersja automatyczna
		
		
		
		char kon1 = (char)a; // byte to char
		System.out.println(kon1); 
		System.out.println((char) (kon1 + c)); // int na char
		System.out.println(kon2);
		
	}
}
