import java.util.*;

public class InstrSter {
	/*
	 * 1.9 Pobierz w konsoli dwie liczby ca³kowite, nastêpnie porównaj je i
	 * wyœwietl stosowny komunikat z wynikiem.
	 */

	public static void main(String[] args) {

		final Integer PIERWSZA;
		final Integer DRUGA;
		final Scanner ODCZYT = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê ca³kowit¹");

		PIERWSZA = ODCZYT.nextInt();

		System.out.println("Podaj drug¹ liczbê ca³kowit¹");
		DRUGA = ODCZYT.nextInt();

		if (PIERWSZA > DRUGA)
			System.out.println("Pierwsza liczba jest wiêksza od drugiej");

		else if (PIERWSZA < DRUGA)
			System.out.println("Pierwsza liczba jest mniejsza od drugiej");

		else
			System.out.println("Liczby s¹ takie same");
		
		
		/*
		 * Napisz program, który pobierze od u¿ytkownika imiê i przechowa je w
		 * zmiennej. Nastêpnie stwórz kilka warunków z ró¿nymi imionami. Jeœli
		 * któreœ z imion bêdzie pasowa³o wyœwietl "Czeœæ jakieœ_imiê", gdy
		 * program nie znajdzie imienia wyœwietl "Przykro mi, ale Ciê nie znam".
		 */

		final String IMIE;
		//Scanner ODCZYT = new Scanner(System.in);
		System.out.println("Podaj swoje imiê ");
		ODCZYT.nextLine();
		IMIE = ODCZYT.nextLine();

		switch (IMIE) {

		case "Danusia":
			System.out.println("Czeœæ " + IMIE);
			break;
		case "Kamil":
			System.out.println("Czeœæ " + IMIE);
			break;
		case "Alicja":
			System.out.println("Czeœæ " + IMIE);
			break;
		case "Anna":
			System.out.println("Czeœæ " + IMIE);
			break;
		default:
			System.out.println("Przykro mi, nie znam Ciê");
		}

		ODCZYT.close();

	}
}
