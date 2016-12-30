
public class Konwersja {

	public static void main(String[] args) { 
		
		
		
		byte a= 65;
		int c = 2;
		double b = 3.5;
		double kon2 = c/b; //konwersja automatyczna
		String napis = "10";
		int wynik= 20 + Integer.parseInt(napis);
		int tekst = 223344;
		String tesktInt= Integer.toString(tekst);
		char kon1 = (char)a; 
		char znak1= 100;
		int liczba= 't';
		char znak2 = 'k';
		
		System.out.println("char + int + char= " +znak1+" "+liczba+" "+znak2);
		System.out.println("byte na char= " +kon1); 
		System.out.println("Dodanie int do char= "+(kon1 + c)); 
		System.out.println("Dzielenie int przez double. Wynik Double= " +kon2);
		System.out.println("Dodanie do inta przekonwertowanego na int Stringa= " +wynik);
		System.out.println("Integer na String= " +tesktInt);
		/*konwersja – tworzenie wartoœci nowego typu na bazie wartoœci innego typu;
		rzutowanie – traktowanie wartoœci danego typu tak, jakby by³a wartoœci¹ innego typu;
		koercja – konwersja typu wartoœci przekazywanej jako argument funkcji.*/
	}
}
