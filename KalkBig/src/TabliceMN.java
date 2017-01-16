
public class TabliceMN {

	public static void main(String[] args) {
		
		int[][] tablica = new int[3][]; 
		tablica[0] = new int[3]; 
		tablica[1] = new int[2]; 
		tablica[2] = new int[1]; 
		
		/*for(int i=0; i< tablica.length; i++){
		    for(int j=0; j< tablica[i].length; j++)
		        tablica[i][j] = 0;}
		*/
		for(int i=0; i< tablica.length; i++){
		    for(int j=0; j< tablica[i].length; j++)
		        System.out.print(tablica[i][j]);
		    System.out.println();
		}

	}

}
