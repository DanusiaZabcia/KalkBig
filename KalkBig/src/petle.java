
public class petle {

	public static void main(String[] args) {

		int licznik = 4;

		while (licznik < 10) {
			System.out.println("To jest p�tla");
			licznik++;
		}
		System.out.println("Koniec p�tli");

		int drugi_licznik = 4;

		do {
			System.out.println("Druga petla");
			drugi_licznik++;
		} while (drugi_licznik < 10);
		System.out.println("Koniec drugiej petli");

		for (int i = 4; i < 10; i++) {
			System.out.println("To jest trzecia petla");

		}
		System.out.println("Koniec trzeciej petli");
	}

}
