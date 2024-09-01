package ejercicios;

public class Ejercicio37 {
	/*
	 * Escribir una función que reciba una cadena de caracteres muestre por pantalla
	 * la frecuencia de aparición de cada letra. Por ejemplo:
	 * frecuencias("hola como estas..."); // debe mostrar por pantalla: a: 2 c: 1 e:
	 * 1 h: 1 l: 1 m: 1 o: 3 s: 2 t: 1 (int) (cadena.charAt(i)) devuelve numero de
	 * caracter segun tabla ascii
	 */
	public static void frecuencia(String cadena) {
		cadena = cadena.toUpperCase();
		int[] frecuencia = new int[26];

		// cargar frecuencias
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			int posicionParaFrecuencias = letra - 65;
			if (posicionParaFrecuencias >= 0 && posicionParaFrecuencias <= 25) {
				frecuencia[posicionParaFrecuencias]++;
			}
		}

		// mostrar frecuencias
		for (int i = 0; i < frecuencia.length; i++) {
			if (frecuencia[i] != 0) {
				System.out.println((char) (i + 65) + ": " + frecuencia[i]);
			}
		}

	}

	public static void main(String[] args) {

		String frase = " creo que funciona bien ";
		frecuencia(frase);
	}

}
