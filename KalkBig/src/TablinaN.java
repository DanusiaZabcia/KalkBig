import java.util.Scanner;

public class TablinaN {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		 int n;
		 
		 int[] tablica;
		 
		 System.out.println("Podaj wielkoœæ talbicy");
		 n= odczyt.nextInt();
		 
		 int b=n;
		 int j=1;
		 
		 tablica= new int[n];
		 
		 while(n>0){ 
			 
			 tablica[n-1]=j;
			 j++;
			 n--;
		 }
		 odczyt.close();
		 
		 for(int i=0; i==b; i++){
		 
			 System.out.println(b+"element tablicy to "+ tablica[i]);
		 }
	}

}
