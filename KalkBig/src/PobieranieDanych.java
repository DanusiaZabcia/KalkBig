import java.util.Scanner;
 

public class PobieranieDanych {

		  public static void main(String[] args){
		      String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u�ytkownika
		      System.out.println("Podaj swoje imi�");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wy�wietlamy powitanie
		     
		      odczyt.close();
		
	}

}
