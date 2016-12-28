
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class KalkulatorBig {

	/* Napisz program analogiczny do 1.4 wykorzystuj�c klas� BigInteger. Utw�rz dwie liczby wykraczaj�ce poza zakres long, wypr�buj funkcje dodawania, odejmowania i mno�enia, a tak�e podniesienie do pot�gi(zobacz w API jaki typ parametru przyjmuje ta funkcja) i warto�� bezwzgl�dn�.
	 *  Wszystkie wyniki zaprezentuj w konsoli. */
	
	public static void main(String[] args){
		
	    BigInteger a = new BigInteger("5");
	    BigInteger b = new BigInteger("2");
	    BigInteger c = new BigInteger("22");
	    BigInteger suma = a.add(b);
	    BigInteger roznica = a.subtract(b);
	    BigInteger mnozenie = a.multiply(b);
	    BigInteger potega= a.pow(c.intValue());
	    BigDecimal doDziel= new BigDecimal(b);
	    BigDecimal doDziel2 = new BigDecimal(a);
	    BigDecimal test =  doDziel2.divide(doDziel,7, RoundingMode.HALF_UP);
	   
	    
	    System.out.println("Suma= "+suma.toString());
	    System.out.println("Roznica= "+roznica.toString());
	    System.out.println("Iloczyn= "+ mnozenie.toString());
	    System.out.println("Potega= "+ potega.toString());
	    System.out.println("Iloraz= "+ test.toString());
	  }
}
