package clasesGenericas;

public class MetodosGenericos {

	public MetodosGenericos() {
		
	}
	
	public boolean validarNullosOVacios(String cadena) {
		if (cadena.equals("")||cadena.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}
