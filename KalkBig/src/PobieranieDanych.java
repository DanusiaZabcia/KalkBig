import java.util.Scanner;
import static java.lang.Math.*;

public class PobieranieDanych {

		  public static void main(String[] args){
		      String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
		      System.out.println("Podaj swoje imi�");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wy�wietlamy powitanie
		     
		      odczyt.close();
		/*  Utw�rz dwie zmienne typu double. Nast�pnie przy u�yciu klasy Scanner 
		 * pobierz od u�ytkownika dwie liczby i wykonaj na nich dodawanie, odejmowanie
		 * , mno�enie i dzielenie, wy�wietlaj�c wyniki w kolejnych liniach na  konsoli.*/
	
		  double zmienna1= 234.23;
		  double zmienna2= 32.34;
		  double zmiennaA;
		  double zmiennaB;
		  Scanner odczytA= new Scanner(System.in);
		  Scanner odczytB= new Scanner(System.in);
		  System.out.println(imie+ " podaj pierwsz� liczb� dzia�ania." );
		   zmiennaA = odczytA.nextDouble();
		   
		   System.out.println(imie+ " podaj drug� liczb� dzia�ania." );
		   
		   zmiennaB = odczytB.nextDouble();
		   
		   System.out.println(imie+ "to Tw�j wynik z dodawania= " + zmienna1+zmiennaA);
		 
		  
		   odczytA.close();
		   odczytB.close();
}
}
