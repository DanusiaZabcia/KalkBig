
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarne_strumienie {

	public static void main(String[] args) {
		
		
		try{
		String plik = "binarnie.txt";
	
		FileOutputStream strumieñWyjœciowy= new FileOutputStream(plik);
		strumieñWyjœciowy.close();   
		  
        } catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch(IOException e){
            System.out.println("B³¹d wejœcia-wyjœcia");
        }
	}

}
