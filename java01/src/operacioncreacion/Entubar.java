package operacioncreacion;

import java.util.ArrayList;
import operacioncreacion.Duplicar;
import operacioncreacion.Entubar;
import operacioncreacion.Invertir;
import operacioncreacion.Rango;
import operacioncreacion.Repetir;
import poo.operacionesaritmeticas.Multi;
import poo.operacionesaritmeticas.Suma;
import poo.operacionescomparacion.Mayor;
import poo.operacionescomparacion.Menor;

public class Entubar {

	String[] args;
	String[] auxiliar;
	ArrayList<String> operaciones = new ArrayList<String>();
	ArrayList<Integer> punteros = new ArrayList<Integer>();
	int numeroasumar;
	int resultado = 0;
	int numoperaciones = 0;
	Rango rango;
	Invertir invertir;
	Suma suma;
	Multi multi;
	Mayor mayor;
	Menor menor;
	Repetir repetir;
	Duplicar duplicar;

	public Entubar(String[] args) {
		this.args = args;
	}

	public String mostrar() {

		if (args.length > 1) {
			if (args[1].equals("rango") || args[1].equals("+") || args[1].equals("*") || args[1].equals("mayor")
					|| args[1].equals("menor") || args[1].equals("invertir") || args[1].equals("duplicar")
					|| args[1].equals("repetir")) {
				for (int i = 0; i < args.length; i++) {
					if (args[i].equals("rango") || args[i].equals("+") || args[i].equals("*") || args[i].equals("mayor")
							|| args[i].equals("menor") || args[i].equals("invertir") || args[i].equals("duplicar")
							|| args[i].equals("repetir")) {
						if (args[i].equals("rango")) {
							operaciones.add("rango");
							punteros.add(i);
						}
						if (args[i].equals("+")) {
							operaciones.add("+");
							punteros.add(i);
						}
						if (args[i].equals("*")) {
							operaciones.add("*");
							punteros.add(i);
						}
						if (args[i].equals("mayor")) {
							operaciones.add("mayor");
							punteros.add(i);
						}
						if (args[i].equals("menor")) {
							operaciones.add("menor");
							punteros.add(i);
						}
						// invertir,duplicar,repetir
						if (args[i].equals("invertir")) {
							operaciones.add("invertir");
							punteros.add(i);
						}
						if (args[i].equals("duplicar")) {
							operaciones.add("duplicar");
							punteros.add(i);
						}
						if (args[i].equals("repetir")) {
							operaciones.add("repetir");
							punteros.add(i);
						}

					}
				}

			} else {
				return "no es operacion valida";
			}
		} else {
			return "necesita parametros";
		}

		// obtener elementos entre la primera operacion y la segunda para
		// entubar

		int valorestomados = punteros.get(1) - 2;

		String[] ari = new String[valorestomados + 1];
		int a = 1;
		// System.out.println(punteros.get(1));
		for (int x = 2; x < punteros.get(1); x++) {

			ari[a] = args[x];
			a++;
		}

		// hola[1] = "0";
		// hola[2] = "10";
		String acumulador = "";
		a = 0;

		// System.out.println(operaciones.size());
		for (int n = 0; n < operaciones.size(); n++) {

			System.out.println(acumulador);

			if (operaciones.get(n).equals("rango")) {
				String[] auxiliar = new String[ari.length + 1];

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				if (n == 0) {
					rango = new Rango(ari);
					acumulador = rango.mostrar();
				} else {
					rango = new Rango(auxiliar);
					acumulador = rango.mostrar();

				}

			}
			if (operaciones.get(n).equals("invertir")) {
				String[] auxiliar = new String[ari.length + 1];

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				if (n == 0) {
					invertir = new Invertir(ari);
					acumulador = invertir.mostrar();
				} else {
					invertir = new Invertir(auxiliar);
					acumulador = invertir.mostrar();

				}

			}
			if (operaciones.get(n).equals("mayor")) {
				String[] auxiliar = new String[ari.length + 1];
				auxiliar[0] = "mayor";

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				mayor = new Mayor(auxiliar);
				acumulador = mayor.mostrar();

			}
			if (operaciones.get(n).equals("menor")) {
				String[] auxiliar = new String[ari.length + 1];
				auxiliar[0] = "menor";

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				menor = new Menor(auxiliar);
				acumulador = menor.mostrar();
			}
			if (operaciones.get(n).equals("+")) {
				String[] auxiliar = new String[ari.length + 1];
				auxiliar[0] = "+";

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				suma = new Suma(auxiliar);
				acumulador = suma.mostrar();
			}
			if (operaciones.get(n).equals("*")) {
				String[] auxiliar = new String[ari.length + 1];
				auxiliar[0] = "*";

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				multi = new Multi(auxiliar);
				acumulador = multi.mostrar();

			}
			if (operaciones.get(n).equals("duplicar")) {
				String[] auxiliar = new String[ari.length + 1];

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}
				if (n == 0) {
					duplicar = new Duplicar(ari);
					acumulador = duplicar.mostrar();
				} else {
					duplicar = new Duplicar(auxiliar);
					acumulador = duplicar.mostrar();
				}

			}

			if (operaciones.get(n).equals("repetir")) {
				String[] auxiliar = new String[ari.length + 1];

				for (int x = 1; x < ari.length + 1; x++) {
					auxiliar[x] = ari[x - 1];
				}

				if (n == 0) {
					repetir = new Repetir(ari);
					acumulador = repetir.mostrar();
				} else {
					repetir = new Repetir(auxiliar);
					acumulador = repetir.mostrar();
				}

			}
			ari = acumulador.split(" ");

		}

		System.out.println("Resultado = " + acumulador);

		return "";
	}


}
