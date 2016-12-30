import java.util.Scanner;
import static java.lang.Math.*;

public class PobieranieDanych {

		  public static void main(String[] args){
		      String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		      System.out.println("Podaj swoje imiê");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wyœwietlamy powitanie
		     
		      odczyt.close();
		/*  Utwórz dwie zmienne typu double. Nastêpnie przy u¿yciu klasy Scanner 
		 * pobierz od u¿ytkownika dwie liczby i wykonaj na nich dodawanie, odejmowanie
		 * , mno¿enie i dzielenie, wyœwietlaj¹c wyniki w kolejnych liniach na  konsoli.*/
	
		  double zmienna1= 234.23;
		  double zmienna2= 32.34;
		  double zmiennaA;
		  double zmiennaB;
		  Scanner odczytA= new Scanner(System.in);
		  Scanner odczytB= new Scanner(System.in);
		  System.out.println(imie+ " podaj pierwsz¹ liczbê dzia³ania." );
		   zmiennaA = odczytA.nextDouble();
		   
		   System.out.println(imie+ " podaj drug¹ liczbê dzia³ania." );
		   
		   zmiennaB = odczytB.nextDouble();
		   
		   System.out.println(imie+ "to Twój wynik z dodawania= " + zmienna1+zmiennaA);
		 
		  
		   odczytA.close();
		   odczytB.close();
}
}
