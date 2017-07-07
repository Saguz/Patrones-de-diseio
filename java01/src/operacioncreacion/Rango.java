package operacioncreacion;

import java.util.ArrayList;

public class Rango {

	String[] args;
	String[] arreglo;
	int numeroasumar;
	int resultado = 0;
	int inicio = 0;
	int tope = 0;
	int incremento = 0;
	String mensaje = "";
	ArrayList<String> novalidos = new ArrayList<String>();

	public Rango(String[] args) {
		this.args = args;
	}

	public String mostrar() {

		int cantidad = args.length;
		if (cantidad > 1) {
			if (cantidad == 3) {

				for (int i = 1; i < args.length; i++) {
					try {
						numeroasumar = Integer.parseInt(args[i]);
					} catch (Exception e) {
						return "Se necesitan numeros";
					}
				}
				inicio = Integer.parseInt(args[1]);
				tope = Integer.parseInt(args[2]);
				if (inicio < tope) {

					for (int x = inicio; x <= tope; x++) {
						// System.out.print(x + " ");
						mensaje = mensaje + (x + " ");
					}
				} else {
					mensaje = "No es valido";

				}

			} else {
				if (cantidad == 4) {
					for (int i = 1; i < args.length; i++) {
						try {
							numeroasumar = Integer.parseInt(args[i]);
						} catch (Exception e) {
							return "Se necesitan numeros";
						}
					}
					inicio = Integer.parseInt(args[1]);
					tope = Integer.parseInt(args[2]);
					incremento = Integer.parseInt(args[3]);

					if (inicio < tope && incremento > 0) {
						for (int x = inicio; x <= tope; x = x + incremento) {
							mensaje = mensaje + (x + " ");
						}
					} else {
						mensaje = "NO es valido";

					}
				} else {
					return "No es valido";
				}
			}

		} else {
			return "Excepcion 2";
		}

		return mensaje;
	}


}
