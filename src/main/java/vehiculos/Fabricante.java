package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	String nombre;
	Pais pais;
	int numeroVentas;
	static List<Fabricante> listado = new ArrayList<>();

	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		listado.add(this);
	}

	public static Fabricante fabricaMayorVentas() {
		Fabricante Winner = null;
		int aux = 0;
		for (Fabricante fabricante : listado) {
			if (fabricante.numeroVentas > aux) {
				aux = fabricante.numeroVentas;
				Winner = fabricante;
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
