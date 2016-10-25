package test;

import org.junit.Assert;

import items.BotaDeBronce;
import items.EspadaDobleFilo;
import personajes.Humano;
import personajes.Personaje;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaje pepe = new Humano();
		// Le agrego una bota
		pepe = new BotaDeBronce(pepe);

		// agrego espada
		pepe = new EspadaDobleFilo(pepe);
		System.out.println(pepe.obtenerPuntosDeAtaque());
		
	}

}
