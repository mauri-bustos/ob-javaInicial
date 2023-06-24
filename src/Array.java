import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] notas = { 1, 2, 4, 5, 6, 7 };
		int[] notas2 = { 3, 4, 6, 4, 6, 1, 5, 7 };
		String[] nombres = { "Melisa", "Mauricio", "Mario", "Lucho", "Diego", "Juan" };

		for (String i : nombres) {
			System.out.println(i);
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

		Boolean igual = notas.equals(nombres);
		System.out.println(igual);

		Arrays.sort(nombres);
		System.out.println();

	}

}
