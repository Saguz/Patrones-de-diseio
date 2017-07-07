package poo.operacionescomparacion;
 
public class Mayor {

	String[] args;
	int numeroasumar;
	int resultado = 0; 

	public Mayor(String[] args) {
		this.args = args;
	}

	public String mostrar() {

		if (args.length > 1) {
			for (int i = 1; i < args.length; i++) {
				try {
					numeroasumar = Integer.parseInt(args[i]);

					if (numeroasumar > resultado) {
						resultado = numeroasumar;
					}
				} catch (Exception e) {
					return "Solo numeros";
				}
			}
		} else {
			return "Excepcion";
		}

		return "" + this.resultado;
	}

}
