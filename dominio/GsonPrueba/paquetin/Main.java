package paquetin;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {

	public static void main(String[] args) {
		// CONVERTIMOS DE JAVA A JSON
		// Prueba 1 un solo objeto
		Alumno misa = new Alumno("Misael Zurdo", 20, 39280050);
		Gson gson = new Gson();
		System.out.println(gson.toJson(misa));
		/////

		// Prueba 2 un array

		ArrayList<Alumno> Alumnos = new ArrayList<>();
		Alumnos.add(misa);
		Alumnos.add(new Alumno("El brallan de lafe", 23, 37524566));
		Alumnos.add(new Alumno("El kevin de catan", 23, 37584564));
		Alumnos.add(new Alumno("Wuachiturro", 16, 48));
		System.out.println(gson.toJson(Alumnos));
		/////

		/// CONVERTIMOS DE JSON A JAVA
		// Prueba 1 un solo objeto
		Type objeto = new TypeToken<Alumno>() {
		}.getType();
		Alumno misa2 = gson.fromJson(gson.toJson(misa), objeto);
		System.out.println(misa2);
		
		//Prueba 2 un array
		// primero necesitaremos tener el tipo de objeto donde guardaremos la
		// informacion que sera una lista de Alumnos
		// despues en gson.gromjson los dos parametros son: la cadena en formato
		// JSON donde leeras la informacion
		// y el tipo de clase/objeto donde guardaras la informacion
		Type tipoObjeto = new TypeToken<ArrayList<Alumno>>() {
		}.getType();
		ArrayList<Alumno> Alumnos2 = gson.fromJson(gson.toJson(Alumnos), tipoObjeto);

		System.out.println(Alumnos2);
	}

}
