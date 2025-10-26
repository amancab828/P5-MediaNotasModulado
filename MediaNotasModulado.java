package tema2_debug;

import java.util.Scanner;

public class MediaNotasModulado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Llamo a la función para pedir el número de alumnos
		int numAlumnos = pedirNumAlumnos(sc);

		if (numAlumnos == 0) { // Añado la condición si se inserta 0 alumnos
			System.out.println("No hay ningún alumno");
		} else {
			//Llamo a la funcion para calcular la media
			double media = calcularMediaNotas(sc, numAlumnos);
			System.out.println("La media del grupo es: " + media);
		}

		sc.close();
	}

	//Función para pedir número de alumnos
	public static int pedirNumAlumnos(Scanner sc) {
		System.out.print("Introduce el número de alumnos: ");
		return sc.nextInt();
	}

	//Función para calcular la media
	public static double calcularMediaNotas(Scanner sc, int numAlumnos) {
		int contador = 1; // El contador debe empezar en 1
		double suma = 0;
		double nota;

		while (contador <= numAlumnos) {
			do { // Lo meto un do-while para que no cuente la nota introducida en caso de que sea incorrecta
				System.out.print("Introduce la nota del alumno " + contador + ": ");
				nota = sc.nextDouble(); // Hay que definir nota fuera al principio para que afecte a la condición y al do-while

				if (nota < 0 || nota > 10) { // Falta la llave, tanto abrirla como cerrarla
					System.out.println("Error: la nota debe estar entre 0 y 10 \nIntroduzca la nota correcta");
				}
			} while (nota < 0 || nota > 10);

			suma = suma + nota;
			contador++;
		}
		double media = suma / numAlumnos;
		return media;
	}

}