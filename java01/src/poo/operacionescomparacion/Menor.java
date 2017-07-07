package poo.operacionescomparacion;
public class Menor {

	String[] args;
	int numeroasumar;
	int resultado = 0;

	public Menor(String[] args) {
		this.args = args;
	}

	public String mostrar() {

		if (args.length > 1) {
			for (int i = 1; i < args.length; i++) {
				try {
					numeroasumar = Integer.parseInt(args[i]);

					if (numeroasumar < resultado || i == 1) {
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
