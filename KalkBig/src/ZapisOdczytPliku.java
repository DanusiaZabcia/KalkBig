import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZapisOdczytPliku {

	public static void main(String[] args) throws IOException {
		
		final File PLIK = new File("ala2.txt");
        final Scanner ODCZYT = new Scanner(PLIK);
        
        final String ZDANIE = ODCZYT.nextLine();
        
        System.out.println(ZDANIE);
        ODCZYT.close();
        
        final PrintWriter ZAPIS = new PrintWriter(new BufferedWriter(new FileWriter("ala.txt", true)));
        
        ZAPIS.append("I zielone myszki te¿ ma");
        ZAPIS.close();
        
	}
}

