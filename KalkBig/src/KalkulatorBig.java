
import java.math.BigInteger;

public class KalkulatorBig {

	/* Napisz program analogiczny do 1.4 wykorzystuj�c klas� BigInteger. Utw�rz dwie liczby wykraczaj�ce poza zakres long, wypr�buj funkcje dodawania, odejmowania i mno�enia, a tak�e podniesienie do pot�gi(zobacz w API jaki typ parametru przyjmuje ta funkcja) i warto�� bezwzgl�dn�.
	 *  Wszystkie wyniki zaprezentuj w konsoli. */
	
	public static void main(String[] args){
		
	    BigInteger a = new BigInteger("123123123123123123123123123123");
	    BigInteger b = new BigInteger("987654321987654321987654321987");
	    BigInteger suma = a.add(b);
	    System.out.println("Suma "+suma.toString());
	  }
}
