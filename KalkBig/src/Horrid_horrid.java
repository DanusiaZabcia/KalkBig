
public class Horrid_horrid {

	public static void main(String[] args) {
		
		int[][] liczby= new int[2][3];
		
		liczby[0][0] = 1;

		liczby[0][1] = 1;

		liczby[0][2] = 2;

		liczby[1][0] = 3;

		liczby[1][1] = 4;

		liczby[1][2] = 5;
		
		for(int i=0; i< liczby.length;i++){
			for (int j=0; j< liczby[i].length; j++)
				System.out.println("wartoœæ komórki "+i+j+ " to "+liczby[i][j]);
		}
	}

}
