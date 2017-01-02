import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class ZapisOdczytPliku {

	public static void main(String[] args) throws FileNotFoundException {
		
		final File PLIK = new File("ala2.txt");
        final Scanner ODCZYT = new Scanner(PLIK);
        
        final String ZDANIE = ODCZYT.nextLine();
        
        System.out.println(ZDANIE);
        ODCZYT.close();
        
        final PrintWriter ZAPIS = new PrintWriter("ala.txt");
        
        ZAPIS.println("I zielone myszki te¿ ma");
        ZAPIS.close();
        
	}
}

