package ejercicios;

import java.util.Arrays;

public class Ejercicio4 {
	/*
	 * Se ingresa un valor num�rico de 8 d�gitos que representa una fecha con el
	 * siguiente formato aaaammdd. Se pide informar por separado el d�a, el mes y el
	 * a�o de la fecha ingresada
	 */

	static void fechas(int fecha) {
		String anio = String.valueOf(fecha);

		String[] a = anio.split("5");

		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fechas(1859);
	}

}
