
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binarne_strumienie {

	public static void main(String[] args) {
		
		
		try{
		String plik = "binarnie.txt";
	
		FileOutputStream strumie�Wyj�ciowy= new FileOutputStream(plik);
		strumie�Wyj�ciowy.close();   
		  
        } catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch(IOException e){
            System.out.println("B��d wej�cia-wyj�cia");
        }
	}

}
