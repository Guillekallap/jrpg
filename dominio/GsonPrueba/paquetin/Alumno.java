package paquetin;

import java.io.Serializable;



public class Alumno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int edad;
	private int dni;

	public Alumno(String nombre, int edad, int dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}

}
