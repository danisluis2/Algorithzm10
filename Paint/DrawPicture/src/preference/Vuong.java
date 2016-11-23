package preference;

public class Vuong {

	public static void main(String[] args) {
		int n = 5;
		for (int r = 0; r < n; ++r) {
			for (int c = 0; c < n; ++c) {
				if (r == 0 || c == 0 || r == n - 1 || c == n - 1) {
					System.out.print(r);
				} else if ((r + c) == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
