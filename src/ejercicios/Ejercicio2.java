package ejercicios;

public class Ejercicio2 {
	/* Leer dos valores enteros e informar la suma y su cociente */

	public static void leerSumarCociente(int num1, int num2) {
		int resultSuma = num1 + num2;
		int resultCociente = num1 / num2;

		System.out.println("resultado de suma: " + resultSuma);
		System.out.println("resultado de cociente: " + resultCociente);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerSumarCociente(4, 2);
	}

}
