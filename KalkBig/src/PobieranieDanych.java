import java.util.*;
import static java.lang.Math.*;

public class PobieranieDanych {

	public static void main(String[] args) {
		final String IMIE; // w nim zapiszemy swoje imie
		Scanner odczyt = new Scanner(System.in); // obiekt do odebrania danych
													// od u�ytkownika
		System.out.println("Podaj swoje imi�");
		IMIE = odczyt.nextLine();

		System.out.println("Witaj " + IMIE); // wy�wietlamy powitanie

		/*
		 * Utw�rz dwie zmienne typu double. Nast�pnie przy u�yciu klasy Scanner
		 * pobierz od u�ytkownika dwie liczby i wykonaj na nich dodawanie,
		 * odejmowanie , mno�enie i dzielenie, wy�wietlaj�c wyniki w kolejnych
		 * liniach na konsoli.
		 */
		final double ZMIENNA_B;
		final double ZMIENNA_A;
		odczyt.useLocale(Locale.ENGLISH); // receives dots instead of commas

		System.out.println(IMIE + ", podaj pierwsz� liczb� dzia�ania.");
		ZMIENNA_A = odczyt.nextDouble();

		System.out.println(IMIE + " podaj drug� liczb� dzia�ania.");

		ZMIENNA_B = odczyt.nextDouble();

		System.out.printf(IMIE + ", to Tw�j wynik z dodawania= " + "%.2f%n", (ZMIENNA_A + ZMIENNA_B));
		System.out.printf(IMIE + ", to Tw�j wynik z odejmnowania= " + "%.2f%n", (ZMIENNA_A - ZMIENNA_B));
		System.out.printf(IMIE + ", to Tw�j wynik z mno�enia= " + "%.2f%n", (ZMIENNA_A * ZMIENNA_B));
		System.out.printf(IMIE + ", to Tw�j wynik z dzielenia= " + "%.2f%n", (ZMIENNA_A / ZMIENNA_B));
		odczyt.close();

	}
}
