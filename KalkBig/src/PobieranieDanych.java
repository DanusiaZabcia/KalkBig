import java.util.*;
import static java.lang.Math.*;

public class PobieranieDanych {

		  public static void main(String[] args){
		      final String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
		      System.out.println("Podaj swoje imi�");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wy�wietlamy powitanie
		     
		      
		/*  Utw�rz dwie zmienne typu double. Nast�pnie przy u�yciu klasy Scanner 
		 * pobierz od u�ytkownika dwie liczby i wykonaj na nich dodawanie, odejmowanie
		 * , mno�enie i dzielenie, wy�wietlaj�c wyniki w kolejnych liniach na  konsoli.*/
		  final double zmiennaB;
		  final double zmiennaA;
		  odczyt.useLocale(Locale.ENGLISH); // receives dots instead of commas
		 
		  System.out.println(imie+ " podaj pierwsz� liczb� dzia�ania." );
		   zmiennaA = odczyt.nextDouble();
		  
		   
		   
		   System.out.println(imie+ " podaj drug� liczb� dzia�ania." );
		   
		   zmiennaB = odczyt.nextDouble();
		   
		   System.out.printf(imie+ " ,to Tw�j wynik z dodawania= " + "%.2f%n" ,(zmiennaA+zmiennaB));
		   System.out.printf(imie+ " ,to Tw�j wynik z odejmnowania= " + "%.2f%n" ,(zmiennaA-zmiennaB));
		   System.out.printf(imie+ " ,to Tw�j wynik z mno�enia= " + "%.2f%n" ,(zmiennaA*zmiennaB));
		   System.out.printf(imie+ " ,to Tw�j wynik z dzielenia= " + "%.2f%n" ,(zmiennaA/zmiennaB));
		   odczyt.close();
		  
}
}
