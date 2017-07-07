package operacioncreacion;

import java.util.ArrayList;
import java.util.Iterator;

public class Duplicar {

	String[] args;
	ArrayList<String> validos = new ArrayList<String>();
	int numeroasumar;
	int resultado = 0;
	String mensaje = "";

	public Duplicar(String[] args) {
		this.args = args;
	}
	
	public boolean es_valido(){
		
		return false;
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

		for (int a = 1; a < args.length; a++) {
			validos.add(args[a]);
		}

		Iterator<String> nombreIterator = validos.iterator();
		while (nombreIterator.hasNext()) {

			String elemento = nombreIterator.next();
			numeroasumar = (Integer.parseInt(elemento) * 2);
			mensaje = mensaje + (numeroasumar + " ");
		}

		return mensaje;
	}



}
