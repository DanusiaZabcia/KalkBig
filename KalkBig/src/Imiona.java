import java.util.Scanner;

public class Imiona {

	public static void main(String[] args) {
		
		String imiona[]= new String[5];
		


		for(int i=0;i<5;i++){
			
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Prosz� poda� "+ (i+1)+ " imi�");
		imiona[i] = odczyt.nextLine();
		odczyt.nextLine();
		}
		
		for(int j=0; j<5; j++){
		
			System.out.println("Witaj "+ imiona[j]);
	}
	}
}
