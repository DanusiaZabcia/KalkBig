import java.util.Scanner;

public class bomba {

	public static void main(String[] args) {
		final int Liczba;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj za ile sekund ma wybuchnac bomba");
		Liczba = odczyt.nextInt();
		odczyt.close();
		int i = Liczba;
		do { 
			System.out.println("Bomba wybuchni za "+ i + "sekund" );
			i--;
		}while (i>0);
		
		System.out.println("Bum!");
		}

	

}
