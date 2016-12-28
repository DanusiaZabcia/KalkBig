
import java.math.BigInteger;
import java.math.BigDecimal;
public class KalkulatorBig {

	/* Napisz program analogiczny do 1.4 wykorzystuj¹c klasê BigInteger. Utwórz dwie liczby wykraczaj¹ce poza zakres long, wypróbuj funkcje dodawania, odejmowania i mno¿enia, a tak¿e podniesienie do potêgi(zobacz w API jaki typ parametru przyjmuje ta funkcja) i wartoœæ bezwzglêdn¹.
	 *  Wszystkie wyniki zaprezentuj w konsoli. */
	
	public static void main(String[] args){
		
	    BigInteger a = new BigInteger("123123123");
	    BigInteger b = new BigInteger("987654321987654321987654321987");
	    BigInteger c = new BigInteger("22");
	    BigInteger suma = a.add(b);
	    BigInteger roznica = a.subtract(b);
	    BigInteger mnozenie = a.multiply(b);
	    BigInteger potega= a.pow(c.intValue());
	    BigDecimal test = new BigDecimal( b.divide(a));
	   
	    
	    System.out.println("Suma= "+suma.toString());
	    System.out.println("Roznica= "+roznica.toString());
	    System.out.println("Iloczyn= "+ mnozenie.toString());
	    System.out.println("Potega= "+ potega.toString());
	    System.out.println("Iloraz= "+ test.toString());
	  }
}
