package operacioncreacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Repetir {

	String[] args;
	ArrayList<String> validos = new ArrayList<String>();
	int numeroasumar;
	int resultado = 0;
	String mensaje = "";

	public Repetir(String[] args) {
		this.args = args;
	}

	public String mostrar() {
		if (args.length > 1) {
			for (int i = 1; i < args.length; i++) {

				try {
					numeroasumar = Integer.parseInt(args[i]);

				} catch (Exception e) {
					return "no es valido";

				}

			}
		}

		for (int a = 2; a < args.length; a++) {
			validos.add(args[a]);
		}

		int veces = Integer.parseInt(args[1]);
		for (int i = 0; i < veces; i++) {
			Iterator<String> nombreIterator = validos.iterator();
			while (nombreIterator.hasNext()) {
				String elemento = nombreIterator.next();
				mensaje = mensaje + (elemento + " ");
			}
		}

		return mensaje;
	}


}
