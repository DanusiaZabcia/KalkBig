import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ZapisOdczytPliku {

	public static void main(String[] args) throws FileNotFoundException {
		
		final File PLIK = new File("ala.txt");
        final Scanner ODCZYT = new Scanner(PLIK);
        
        final String ZDANIE = ODCZYT.nextLine();
        
        System.out.println(ZDANIE);
        ODCZYT.close();
	}
}

