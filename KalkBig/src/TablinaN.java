import java.util.Scanner;

public class TablinaN {

	public static void main(String[] args) {
		
		Scanner odczyt = new Scanner(System.in);
		 int n;
		 
		 int[] tablica;
		 
		 System.out.println("Podaj wielkoœæ talbicy");
		 n= odczyt.nextInt();
		 
		 
		 int j=1;
		 odczyt.close();
		 tablica= new int[n];
		 
		 while(n>0){ 
			 n--;
			 tablica[n]=j;
			 j++;
			 
			 System.out.println( n+" element tablicy to "+ tablica[n]); 
		 }
		 
		
		  
		 
		 }
	}


