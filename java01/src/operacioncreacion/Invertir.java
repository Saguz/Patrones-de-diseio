package operacioncreacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Invertir {

	String[] args;
	int numeroasumar;
	int resultado = 1;
	String mensaje = "";
	ArrayList<String> validos = new ArrayList<String>();

	public Invertir(String[] args) {
		this.args = args;
	}

	public String mostrar() {
		if (args.length > 1) {
			for (int i = 1; i < args.length; i++) {
				try {
					numeroasumar = Integer.parseInt(args[i]);
					validos.add(args[i]);
				} catch (Exception e) {
					return "Deben ser numeros";

				}
			}
		} else {
			return "";
		}

		Collections.reverse(validos);
		Iterator<String> nombreIterator = validos.iterator();
		while (nombreIterator.hasNext()) {
			String elemento = nombreIterator.next();
			mensaje = mensaje + (elemento + " ");
		}

		return mensaje;
	}



}
