import java.util.Scanner;
 

public class PobieranieDanych {

		  public static void main(String[] args){
		      String imie; //w nim zapiszemy swoje imie
		      Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od u¿ytkownika
		      System.out.println("Podaj swoje imiê");
		      imie = odczyt.nextLine();
		 
		      System.out.println("Witaj "+imie); //wyœwietlamy powitanie
		     
		      odczyt.close();
		
	}

}
