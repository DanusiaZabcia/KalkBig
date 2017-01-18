
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Binarne_strumienie {

	public static void main(String[] args) {
		String plik = "binarnie.txt";
		int iloscSczytanychBajtow = 0;
		RandomAccessFile strumien = null;
		
		try{
		
			 strumien = new RandomAccessFile(plik, "rw");
		
		         } 
		catch(FileNotFoundException e){
          
		        	System.out.println("Nie znaleziono pliku");}
		
		        	try{
		        		strumien.writeUTF("Danusia");
		        		strumien.writeUTF("2017");
		        		strumien.writeDouble(50/4);
		        		strumien = new RandomAccessFile(plik, "rw");
		        		
		        	while (strumien.read() != -1)  
		        	   iloscSczytanychBajtow ++;
		        	  }
         catch(IOException e){
            System.out.println("B³¹d wejœcia-wyjœcia");
        }
		        	try{ strumien.close();
		        	
		        	}catch (IOException e)
		        	{
		        	System.out.println("B³¹d zamykania strumienia");
		        	}
		        	System.out.println("Iloœæ sczytanych bajtów "+ iloscSczytanychBajtow );
	}

}
