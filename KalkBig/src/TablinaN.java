import java.util.Scanner;

public class TablinaN {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		 int n;
		 
		 int[] tablica;
		 
		 System.out.println("Podaj wielkoœæ talbicy");
		 n= odczyt.nextInt();
		 
		 int j=1;
		 
		 tablica= new int[n];
		 
		 while(n>0){ 
			 
			 tablica[n]=j;
			 j++;
			 n--;
		 }
		 odczyt.close();
		 
		
	}

}
