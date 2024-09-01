package ejercicios;

import java.util.Arrays;

public class Ejercicio34 {
	/*
	 * Escribir una función que reciba dos arreglos a1 y a2, de enteros ordenados de
	 * menor a mayor e intercale los elementos de los arreglos que recibe en un
	 * nuevo arreglo, tal que el arreglo resultante también esté ordenado. Por
	 * ejemplo:
	 * 
	 * a1 = [-5, 0, 0, 1, 5] a2 = [-10, 0, 7] resultado = [-10, -5, 0, 0, 0, 1, 5,
	 * 7]
	 */

	public static int[] mezcla(int[] a1, int[] a2) {
		int[] resultado = new int[a1.length + a2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				resultado[k] = a1[i];
				i++;

			} else {
				resultado[k] = a2[j];
				j++;

			}
			k++;
		}

		if (i == a1.length) {
			while (j < a2.length) {
				resultado[k] = a2[j];
				k++;
				j++;
			}
		} else {
			while (i < a1.length) {
				resultado[k] = a1[i];
				k++;
				i++;
			}
		}

		return resultado;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { -5, 0, 0, 1, 5 };
		int[] a2 = { -10, 0, 7 };
		int[] res = mezcla(a1, a2);

		System.out.println("resultado " + Arrays.toString(res));

	}

}
