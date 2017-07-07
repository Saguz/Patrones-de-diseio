package poo.operacionesaritmeticas;
 
public class Suma {

	String[] args;
 	int numeroasumar;
	int resultado = 0;

	public Suma(String[] args) {
		this.args = args;
	}
	
 	public String mostrar() {
		if (args.length > 1) {
			for (int i = 1; i < args.length; i++) {

				try {
					numeroasumar = Integer.parseInt(args[i]);

					resultado = resultado + numeroasumar;
				} catch (Exception e) {
					return "Solo numero";

				}

			}
		}

		return "" + this.resultado;
	}

}
