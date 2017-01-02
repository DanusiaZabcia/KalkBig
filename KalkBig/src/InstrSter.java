import java.util.*;


public class InstrSter {
/*1.9 Pobierz w konsoli dwie liczby ca³kowite,
 *  nastêpnie porównaj je i wyœwietl stosowny komunikat z wynikiem. 
 */
	
	public static void main ( String[] args){
		
		final Integer PIERWSZA ;
		final Integer DRUGA;
		final Scanner ODCZYT = new Scanner(System.in) ;
		System.out.println("Podaj pierwsz¹ liczbê ca³kowit¹");
		
		PIERWSZA = ODCZYT.nextInt();
		
		System.out.println("Podaj drug¹ liczbê ca³kowit¹");
		DRUGA = ODCZYT.nextInt();
		
		if (PIERWSZA > DRUGA )
			System.out.println("Pierwsza liczba jest wiêksza od drugiej");
			
		else if (PIERWSZA < DRUGA)
			System.out.println("Pierwsza liczba jest mniejsza od drugiej");
			
		else
			System.out.println("Liczby s¹ takie same");
		
		ODCZYT.close();
		
	}
}
