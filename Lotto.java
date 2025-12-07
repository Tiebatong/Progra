public class Lotto {
	static void main() {
		
		 
		int[] arr = ziehung(10, 10);
		for (int L : arr) {
		System.out.println(L);
		}
		
	}

	static int[] ziehung(int x, int y) {
		int counter = 0;
		int[] Losung = new int[x];
		while (counter < x) {
			int Zahl = -1;
			Zahl = (int) (Math.random() * (y + 1));

			// Auf Dopplung prüfen
			boolean dopplung = false;
			for (int i = 0; i < counter; i++) {
				if (Zahl == Losung[i] || Zahl < 1) {
					dopplung = true;
				}
			}
			if (!dopplung) {
			Losung[counter] = Zahl;
			counter++;
			}

		}
		return Losung;
	}
}


