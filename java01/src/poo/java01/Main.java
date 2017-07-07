package poo.java01;
 
import operacioncreacion.Duplicar;
import operacioncreacion.Entubar;
import operacioncreacion.Invertir;
import operacioncreacion.Rango;
import operacioncreacion.Repetir;
import poo.operacionesaritmeticas.Multi;
import poo.operacionesaritmeticas.Suma;

import poo.operacionescomparacion.Mayor;
import poo.operacionescomparacion.Menor;

public class Main {

	public static void main(String[] args) {
		Suma suma;
		Multi multi;
		Mayor mayor;
		Menor menor;
		Rango rango;
		Invertir invertir;
		Repetir repetir;
		Duplicar duplicar;
		Entubar entubar;
		boolean esta = false;
		int operacion = 0;
		String operaciones[] = { "+", "*", "mayor", "menor", "rango", "invertir", "repetir", "duplicar", "entubar" };
		for (int i = 0; i <= operaciones.length - 1; i++) {
			if (operaciones[i].equals(args[0])) {
				esta = true;
				operacion = i;
			}
		}

		if (esta) {
			if (operacion == 0) {
				suma = new Suma(args);
				System.out.println(suma.mostrar());
			}
			if (operacion == 1) {
				multi = new Multi(args);
				System.out.println(multi.mostrar());
			}
			if (operacion == 2) {
				mayor = new Mayor(args);
				System.out.println(mayor.mostrar());
			}
			if (operacion == 3) {
				menor = new Menor(args);
				System.out.println(menor.mostrar());
			}
			if (operacion == 4) {
				rango = new Rango(args);
				System.out.println(rango.mostrar());
			}
			if (operacion == 5) {
				invertir = new Invertir(args);
				System.out.println(invertir.mostrar());
			}
			if (operacion == 6) {
				repetir = new Repetir(args);
				System.out.println(repetir.mostrar());
			}
			if (operacion == 7) {
				duplicar = new Duplicar(args);
				System.out.println(duplicar.mostrar());
			}
			if (operacion == 8) {
				entubar = new Entubar(args);
				System.out.println(entubar.mostrar());
			}

		} else {
			System.out.println("No esta la operacion");
		}
	}
}