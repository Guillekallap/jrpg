package test.java;

import java.io.IOException;
import java.io.StringWriter;



import main.java.items.*;
import main.java.personajes.*;

public class Main {

	public static void main(String[] args) {

		Personaje pepe = new Humano("Pepe");
		pepe = new EspadaDobleFilo(pepe);

		pepe.setCasta(new Asesino());
		System.out.println(pepe.getCasta());
	}

}
