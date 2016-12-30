import java.util.Scanner;
import static java.lang.Math.*;

public class PobieranieDanych {

		  public static void main(String[] args){
		      String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		      System.out.println("Podaj swoje imiê");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wyœwietlamy powitanie
		     
		      
		/*  Utwórz dwie zmienne typu double. Nastêpnie przy u¿yciu klasy Scanner 
		 * pobierz od u¿ytkownika dwie liczby i wykonaj na nich dodawanie, odejmowanie
		 * , mno¿enie i dzielenie, wyœwietlaj¹c wyniki w kolejnych liniach na  konsoli.*/
	
		  double zmienna1= 234.23;
		  double zmienna2= 32.34;
		  double zmiennaA;
		 
		 
		  System.out.println(imie+ " podaj pierwsz¹ liczbê dzia³ania." );
		   zmiennaA = odczyt.nextDouble();
		  
		   double zmiennaB;
		   
		   System.out.println(imie+ " podaj drug¹ liczbê dzia³ania." );
		   
		   zmiennaB = odczyt.nextDouble();
		   
		   System.out.println(imie+ " to Twój wynik z dodawania= " + zmienna1+zmiennaA);
		 
		  
		   odczyt.close();
		  
}
}
