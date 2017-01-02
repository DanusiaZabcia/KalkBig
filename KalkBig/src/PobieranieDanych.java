import java.util.*;
import static java.lang.Math.*;

public class PobieranieDanych {

	public static void main(String[] args) {
		final String IMIE; // w nim zapiszemy swoje imie
		Scanner odczyt = new Scanner(System.in); // obiekt do odebrania danych
													// od u¿ytkownika
		System.out.println("Podaj swoje imiê");
		IMIE = odczyt.nextLine();

		System.out.println("Witaj " + IMIE); // wyœwietlamy powitanie

		/*
		 * Utwórz dwie zmienne typu double. Nastêpnie przy u¿yciu klasy Scanner
		 * pobierz od u¿ytkownika dwie liczby i wykonaj na nich dodawanie,
		 * odejmowanie , mno¿enie i dzielenie, wyœwietlaj¹c wyniki w kolejnych
		 * liniach na konsoli.
		 */
		final double ZMIENNA_B;
		final double ZMIENNA_A;
		odczyt.useLocale(Locale.ENGLISH); // receives dots instead of commas

		System.out.println(IMIE + ", podaj pierwsz¹ liczbê dzia³ania.");
		ZMIENNA_A = odczyt.nextDouble();

		System.out.println(IMIE + " podaj drug¹ liczbê dzia³ania.");

		ZMIENNA_B = odczyt.nextDouble();

		System.out.printf(IMIE + ", to Twój wynik z dodawania= " + "%.2f%n", (ZMIENNA_A + ZMIENNA_B));
		System.out.printf(IMIE + ", to Twój wynik z odejmnowania= " + "%.2f%n", (ZMIENNA_A - ZMIENNA_B));
		System.out.printf(IMIE + ", to Twój wynik z mno¿enia= " + "%.2f%n", (ZMIENNA_A * ZMIENNA_B));
		System.out.printf(IMIE + ", to Twój wynik z dzielenia= " + "%.2f%n", (ZMIENNA_A / ZMIENNA_B));
		odczyt.close();

	}
}
