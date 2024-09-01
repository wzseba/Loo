package ejercicios;

import java.util.Arrays;

public class Ejercicio31 {

	/*
	 * Escribir una función que reciba un arreglo de enteros y devuelva la suma de
	 * los elementos que se encuentran en posiciones pares (incluido el elemento de
	 * la posición 0). Por ejemplo: Dado el arreglo [1, 2, 13, 4, 8, 6] => devuelve
	 * 22 (1+13+8)
	 */
	public static int sumaPosicionesPares(int[] a) {
		int suma = 0;
		for (int i = 0; i < a.length; i += 2) {
//			if (i % 2 == 0) {
//				suma += a[i];
//			}
			suma += a[i];
		}
		return suma;
	}

	/*
	 * Escribir una función que reciba dos arreglos a1 y a2, de enteros otro arreglo
	 * resultado de poner uno a continuacion del otro . Por ejemplo: a1 =
	 * [-5,0,0,1,5] a2 = [-10,0,7] resultado = [-5,0,0,1,5,-10,0,7]
	 */

	public static int[] resultadoDosArreglos(int[] a1, int[] a2) {

		int[] unir = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			unir[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			unir[a1.length + i] = a2[i];
		}

		return unir;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 13, 4, 8, 6 };
		int suma = sumaPosicionesPares(a);
		System.out.println("Suma de elementos en posiciones pares del array: " + suma);

		System.out.println("--------------------------------------------");

		int[] a1 = { -5, 0, 0, 1, 5 };
		int[] a2 = { -10, 0, 7 };

		int[] res = resultadoDosArreglos(a1, a2);

		System.out.println("resultado: " + Arrays.toString(res));
	}

}
