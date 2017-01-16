import java.util.Scanner;

public class TablinaN {

	public static void main(String[] args) {

		Scanner odczyt = new Scanner(System.in);
		int n;

		int[] tablica;

		System.out.println("Podaj wielkoœæ talbicy");
		n = odczyt.nextInt();

		
		int h = n;
		
		odczyt.close();
		tablica = new int[n];

		
		for (int i = 0; i < h; i++) {
			
			
			tablica[i] = i;
			
		}
		while (n > 0) {
			n--;
			System.out.println(n + " element tablicy to " + tablica[n]);
			

		}

	}
}
