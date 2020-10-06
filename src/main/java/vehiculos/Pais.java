package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	String nombre;
	int numeroVentas;
	static List<Pais> listado = new ArrayList<>();

	public Pais(String nombre) {
		this.nombre = nombre;
		listado.add(this);
	}

	public static Pais paisMasVendedor() {
		Pais Winner = null;
		int aux = 0;
		for (Pais pais : listado) {
			if (pais.numeroVentas > aux) {
				aux = pais.numeroVentas;
				Winner = pais;
			}
		}
		return Winner;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}