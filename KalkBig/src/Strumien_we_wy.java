import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Strumien_we_wy {

	public static void main(String[] args) {
		DataInputStream a = null;
		DataOutputStream b = null;

		try {
			a = new DataInputStream(new FileInputStream("binarnie.txt"));
			b = new DataOutputStream(new FileOutputStream("przekierowane.txt"));
		} catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono takiego pliku");
        }

		int x1 = 0;
		int x2 = 0;
        byte[] bufor = new byte[1024];

        try {
            while ((x1 = a.read(bufor)) != -1) {
                b.write(bufor, 0, x1);
                x2 += x1;
            }
            
        } catch (IOException e) {
            System.out.println("B³ad wejœcia-wyjœcia");
        }

		try {
			if (a != null) a.close();
			if (b != null) b.close();
		} catch (IOException e) {
			System.out.println("B³¹d zamykania strumiania");

		}
		System.out.println(x2);
	}

}
