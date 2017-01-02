import java.util.*;
import static java.lang.Math.*;

public class PobieranieDanych {

		  public static void main(String[] args){
		      final String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		      System.out.println("Podaj swoje imiê");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wyœwietlamy powitanie
		     
		      
		/*  Utwórz dwie zmienne typu double. Nastêpnie przy u¿yciu klasy Scanner 
		 * pobierz od u¿ytkownika dwie liczby i wykonaj na nich dodawanie, odejmowanie
		 * , mno¿enie i dzielenie, wyœwietlaj¹c wyniki w kolejnych liniach na  konsoli.*/
		  final double zmiennaB;
		  final double zmiennaA;
		  odczyt.useLocale(Locale.ENGLISH); // receives dots instead of commas
		 
		  System.out.println(imie+ " podaj pierwsz¹ liczbê dzia³ania." );
		   zmiennaA = odczyt.nextDouble();
		  
		   
		   
		   System.out.println(imie+ " podaj drug¹ liczbê dzia³ania." );
		   
		   zmiennaB = odczyt.nextDouble();
		   
		   System.out.printf(imie+ " ,to Twój wynik z dodawania= " + "%.2f%n" ,(zmiennaA+zmiennaB));
		   System.out.printf(imie+ " ,to Twój wynik z odejmnowania= " + "%.2f%n" ,(zmiennaA-zmiennaB));
		   System.out.printf(imie+ " ,to Twój wynik z mno¿enia= " + "%.2f%n" ,(zmiennaA*zmiennaB));
		   System.out.printf(imie+ " ,to Twój wynik z dzielenia= " + "%.2f%n" ,(zmiennaA/zmiennaB));
		   odczyt.close();
		  
}
}
