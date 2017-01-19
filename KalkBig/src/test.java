
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class test {
 
    public static void main(String[] args) {
        DataInputStream strumieñWejœciowy = null;
        DataOutputStream strumieñWyjœciowy = null;
 
        try {
            strumieñWejœciowy = new DataInputStream(new FileInputStream("binarnie.txt"));
            strumieñWyjœciowy = new DataOutputStream(new FileOutputStream("przekopiowane.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono takiego pliku");
        }
 
        int iloœæSczytanychBajtów = 0;
        int ca³kowitaIloœæBajtów = 0;
        byte[] bufor = new byte[1024];
 
        try {
            while ((iloœæSczytanychBajtów = strumieñWejœciowy.read(bufor)) != -1) {
                strumieñWyjœciowy.write(bufor, 0, iloœæSczytanychBajtów);
                ca³kowitaIloœæBajtów += iloœæSczytanychBajtów;
            }
        } catch (IOException e) {
            System.out.println("B³ad wejœcia-wyjœcia");
        }
 
        try {
            if(strumieñWejœciowy != null) strumieñWejœciowy.close();
            if(strumieñWyjœciowy != null) strumieñWyjœciowy.close();
        } catch (IOException e) {
            System.out.println("B³¹d zamykania strumieni");
        }
 
        System.out.println(ca³kowitaIloœæBajtów);
    }
 
}