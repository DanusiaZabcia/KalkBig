
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class test {
 
    public static void main(String[] args) {
        DataInputStream strumie�Wej�ciowy = null;
        DataOutputStream strumie�Wyj�ciowy = null;
 
        try {
            strumie�Wej�ciowy = new DataInputStream(new FileInputStream("binarnie.txt"));
            strumie�Wyj�ciowy = new DataOutputStream(new FileOutputStream("przekopiowane.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono takiego pliku");
        }
 
        int ilo��SczytanychBajt�w = 0;
        int ca�kowitaIlo��Bajt�w = 0;
        byte[] bufor = new byte[1024];
 
        try {
            while ((ilo��SczytanychBajt�w = strumie�Wej�ciowy.read(bufor)) != -1) {
                strumie�Wyj�ciowy.write(bufor, 0, ilo��SczytanychBajt�w);
                ca�kowitaIlo��Bajt�w += ilo��SczytanychBajt�w;
            }
        } catch (IOException e) {
            System.out.println("B�ad wej�cia-wyj�cia");
        }
 
        try {
            if(strumie�Wej�ciowy != null) strumie�Wej�ciowy.close();
            if(strumie�Wyj�ciowy != null) strumie�Wyj�ciowy.close();
        } catch (IOException e) {
            System.out.println("B��d zamykania strumieni");
        }
 
        System.out.println(ca�kowitaIlo��Bajt�w);
    }
 
}