package test;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import items.EspadaDobleFilo;
import personajes.Asesino;
import personajes.Humano;
import personajes.Personaje;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Personaje pepe = new Humano("Pepe");
		pepe = new EspadaDobleFilo(pepe);

		StringWriter out = new StringWriter();

		pepe.writeJSONString(out);
		
		System.out.println(out);
		/*	JSONObject obj = new JSONObject();
		obj.put("pepe", out);// le pongo pepe pero hace referencia a todos los
								// personajes guardados en out

		JSONParser parser = new JSONParser();
		try {
			JSONObject objPersonajes = (JSONObject) parser.parse(obj.toJSONString());
			JSONArray array = (JSONArray) objPersonajes.get("pepe");
			
		//	for 	
			JSONObject personaje = (JSONObject) array.get(0);
			String ataque = personaje.get("nombre").toString();

			System.out.println(ataque);
		//		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Todo mal");
		}*/
		
		pepe.setCasta(new Asesino());
		System.out.println(pepe.getCasta());
	}

}
