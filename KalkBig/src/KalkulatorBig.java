
import java.math.BigInteger;

public class KalkulatorBig {

	/* Napisz program analogiczny do 1.4 wykorzystuj¹c klasê BigInteger. Utwórz dwie liczby wykraczaj¹ce poza zakres long, wypróbuj funkcje dodawania, odejmowania i mno¿enia, a tak¿e podniesienie do potêgi(zobacz w API jaki typ parametru przyjmuje ta funkcja) i wartoœæ bezwzglêdn¹.
	 *  Wszystkie wyniki zaprezentuj w konsoli. */
	
	public static void main(String[] args){
		
	    BigInteger a = new BigInteger("123123123123123123123123123123");
	    BigInteger b = new BigInteger("987654321987654321987654321987");
	    BigInteger suma = a.add(b);
	    System.out.println("Suma "+suma.toString());
	  }
}
