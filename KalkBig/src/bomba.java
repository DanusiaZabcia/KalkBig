import java.util.Scanner;

public class bomba {

	public static void main(String[] args) {
		final int Liczba;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj za ile sekund ma wybuchnac bomba");
		Liczba = odczyt.nextInt();
		
		
		int i = Liczba;
		do {
			System.out.println("Bomba wybuchni za " + i + "sekund");
			i--;
		} while (i > 0);

		System.out.println("Bum!");
		odczyt.nextLine();
		int Liczba_2;
		
		
		
		System.out.println("Podaj za ile sekund ma wybuchnac druga bomba");
		Liczba_2= odczyt.nextInt();
		
		int j = Liczba_2;
		

		for (int g = j; g > 0; g--) {
			System.out.println("Druga bomba wybuchnie za " + j + "sekund");
			j--;
		}
		System.out.println("Bum Bum!");
		odczyt.nextLine();
		int Liczba_3;
		
		
		
		System.out.println("Podaj za ile sekund ma wybuchnac trzecia bomba");
		Liczba_3= odczyt.nextInt();
		odczyt.close();
		int h= Liczba_3;
		
		while (h>0){
			System.out.println("Trzecia bomba wybuchnie za " +h+ "sekund");
			h--;
		}
		System.out.println("Bum Bum Bum!");
	}
}
