
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class KalkulatorBig {

	/* Napisz program analogiczny do 1.4 wykorzystuj¹c klasê BigInteger. Utwórz dwie liczby wykraczaj¹ce poza zakres long, wypróbuj funkcje dodawania, odejmowania i mno¿enia, a tak¿e podniesienie do potêgi(zobacz w API jaki typ parametru przyjmuje ta funkcja) i wartoœæ bezwzglêdn¹.
	 *  Wszystkie wyniki zaprezentuj w konsoli. */
	
	public static void main(String[] args){
		
	    BigInteger a = new BigInteger("-5898798");
	    BigInteger b = new BigInteger("242343432432241445353");
	    BigInteger c = new BigInteger("2");

	    BigDecimal doDziel= new BigDecimal(b);
	    BigDecimal doDziel2 = new BigDecimal(a);
    
	    System.out.println("Suma= "+ a.add(b).toString());
	    System.out.println("Roznica= "+ a.subtract(b).toString());
	    System.out.println("Iloczyn= "+ a.multiply(b).toString());
	    System.out.println("Potega= "+ a.pow(c.intValue()).toString());
	    System.out.println("Iloraz= "+ doDziel.divide(doDziel2,7, RoundingMode.HALF_UP).toString());
	    System.out.println("Wartosc bezwzgledna= " + a.abs());
	  }
}
