package poo.operacionesaritmeticas;

import java.util.ArrayList; 


public class Multi {
	String[] args;
	int numeroasumar;
	int resultado = 1;
	ArrayList<String> novalidos = new ArrayList<String>();

	public Multi(String[] args) {
		this.args = args;
	}

	public String mostrar() {
		if (args.length > 1) {
			for (int i = 1; i < args.length; i++) {
				try {
					numeroasumar = Integer.parseInt(args[i]);
					resultado = resultado * numeroasumar;
				} catch (Exception e) {
					return "Solo numeros";

				}
			}
		}

		return "" + this.resultado;
	}

}
