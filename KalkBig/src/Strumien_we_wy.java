import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class Strumien_we_wy {

	public static void main(String[] args) {
		
		DataInputStream wejsciowy = null;
		DataOutputStream wyjsciowy = null;
		
		try{
		wejsciowy = new DataInputStream(new FileInputStream("binarnie.txt"));
		wyjsciowy = new DataOutputStream(new FileOutputStream("przekierowane.txt"));
		}
	 catch(FileNotFoundException e){
		 System.out.print("Nie znaleziono pliku");
	 }
	
		
		int iloscBajtow1=0;
		int iloscBajtow2=0;
		byte[] bufor = new byte [2000];

		try{
		while ((iloscBajtow1 = wejsciowy.read(bufor))!= -1);
		{ 
			wyjsciowy.write(bufor,0,iloscBajtow1);
			iloscBajtow2 += iloscBajtow1;}
		} catch ( IOException e)
		{System.out.println("B³ad wejœcia-wyjœcia");
	}
		
		try{
			if(wejsciowy != null) wejsciowy.close();
			if(wyjsciowy!= null) wyjsciowy.close();
		} catch ( IOException e) 
		{ System.out.println("B³¹d zamykania strumiania");
		
	}
		System.out.println(iloscBajtow2);
	}

}
