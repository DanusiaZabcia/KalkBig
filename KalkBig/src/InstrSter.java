import java.util.*;

public class InstrSter {
	/*
	 * 1.9 Pobierz w konsoli dwie liczby ca�kowite, nast�pnie por�wnaj je i
	 * wy�wietl stosowny komunikat z wynikiem.
	 */

	public static void main(String[] args) {

		final Integer PIERWSZA;
		final Integer DRUGA;
		final Scanner ODCZYT = new Scanner(System.in);
		System.out.println("Podaj pierwsz� liczb� ca�kowit�");

		PIERWSZA = ODCZYT.nextInt();

		System.out.println("Podaj drug� liczb� ca�kowit�");
		DRUGA = ODCZYT.nextInt();

		if (PIERWSZA > DRUGA)
			System.out.println("Pierwsza liczba jest wi�ksza od drugiej");

		else if (PIERWSZA < DRUGA)
			System.out.println("Pierwsza liczba jest mniejsza od drugiej");

		else
			System.out.println("Liczby s� takie same");
		
		
		/*
		 * Napisz program, kt�ry pobierze od u�ytkownika imi� i przechowa je w
		 * zmiennej. Nast�pnie stw�rz kilka warunk�w z r�nymi imionami. Je�li
		 * kt�re� z imion b�dzie pasowa�o wy�wietl "Cze�� jakie�_imi�", gdy
		 * program nie znajdzie imienia wy�wietl "Przykro mi, ale Ci� nie znam".
		 */

		final String IMIE;
		//Scanner ODCZYT = new Scanner(System.in);
		System.out.println("Podaj swoje imi� ");
		ODCZYT.nextLine();
		IMIE = ODCZYT.nextLine();

		switch (IMIE) {

		case "Danusia":
			System.out.println("Cze�� " + IMIE);
			break;
		case "Kamil":
			System.out.println("Cze�� " + IMIE);
			break;
		case "Alicja":
			System.out.println("Cze�� " + IMIE);
			break;
		case "Anna":
			System.out.println("Cze�� " + IMIE);
			break;
		default:
			System.out.println("Przykro mi, nie znam Ci�");
		}

		ODCZYT.close();

	}
}
