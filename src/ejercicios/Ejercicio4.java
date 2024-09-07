package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Se ingresa un valor num�rico de 8 d�gitos que representa una fecha con el
	 * siguiente formato aaaammdd. Se pide informar por separado el d�a, el mes y el
	 * a�o de la fecha ingresada
	 */

	static void fechas(int fecha) {

		// fecha valor primitivo convertido a cadena
		String anio = String.valueOf(fecha);

		if (anio.length() < 8 || anio.length() > 8) {
			throw new IllegalArgumentException("Formato incorrecto: deber�a ser aaaa mm dd");
		}
		String aaaa = "";
		String mm = "";
		String dd = "";

		// convierto el String a un arreglo de String
		String[] a = anio.split("");

		// concateno en cada variable el valor del arreglo de su posicion
		for (int i = 0; i < a.length; i++) {
			if (i <= 3) {
				aaaa += a[i];
			} else if (i > 3 && i <= 5) {
				mm += a[i];
			} else {
				dd += a[i];
			}

		}

		System.out.println("A�o: " + aaaa + " mes: " + mm + " dia: " + dd);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fecha;

		System.out.println("ingrese fecha en formato aaaa mm dd: ");
		fecha = input.nextInt();

		fechas(fecha);

	}

}
