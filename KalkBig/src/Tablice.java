
public class Tablice {

	public static void main(String[] args) {
		int liczby[] = new int[10];
		
		for (int i=0; i<10; i++){
			liczby[i]= i+1;
			
			int zmienna= liczby[i];
			System.out.println("kolejna komórka to "+ zmienna);
		}
			int test[] = new int[10];
			
			test[10]=123; // celowe generowanie wyjatku
	}

}
