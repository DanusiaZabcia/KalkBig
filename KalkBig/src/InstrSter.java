import java.util.*;


public class InstrSter {
/*1.9 Pobierz w konsoli dwie liczby ca�kowite,
 *  nast�pnie por�wnaj je i wy�wietl stosowny komunikat z wynikiem. 
 */
	
	public static void main ( String[] args){
		
		final Integer PIERWSZA ;
		final Integer DRUGA;
		final Scanner ODCZYT = new Scanner(System.in) ;
		System.out.println("Podaj pierwsz� liczb� ca�kowit�");
		
		PIERWSZA = ODCZYT.nextInt();
		
		System.out.println("Podaj drug� liczb� ca�kowit�");
		DRUGA = ODCZYT.nextInt();
		
		if (PIERWSZA > DRUGA )
			System.out.println("Pierwsza liczba jest wi�ksza od drugiej");
			
		else if (PIERWSZA < DRUGA)
			System.out.println("Pierwsza liczba jest mniejsza od drugiej");
			
		else
			System.out.println("Liczby s� takie same");
		
		ODCZYT.close();
		
	}
}
