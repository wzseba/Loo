package ejercicios;

public class Ejercicio3 {
	/* Dado un valor numérico entero, informar si es par o impar */

	static void parImpar(int num) {
		int result = num % 2;

		if (result == 0) {
			System.out.println("es par");
		} else {
			System.out.println("es impar");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		parImpar(3);
		parImpar(4);
		parImpar(399);
		parImpar(5);
	}

}
