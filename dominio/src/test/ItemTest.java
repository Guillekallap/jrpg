package test;

import org.junit.Assert;
import org.junit.Test;

import items.BotaDeBronce;
import items.EspadaBastarda;
import items.EspadaDobleFilo;
import personajes.Humano;
import personajes.Personaje;

public class ItemTest {

	@Test
	public void quePuedoAgregarItemBota() {
		Personaje pepe = new Humano("pepe");
		Assert.assertEquals(15, pepe.obtenerPuntosDeDefensa());
		Assert.assertEquals(5, pepe.obtenerPuntosDeVelocidad());

		// Le agrego una bota
		pepe = new BotaDeBronce(pepe);
		Assert.assertEquals(15 + 5, pepe.obtenerPuntosDeDefensa());
		Assert.assertEquals(5 + 10, pepe.obtenerPuntosDeVelocidad());

	}
	
	@Test
	public void agregoEspadaYBota() {
		Personaje pepe = new Humano("pepe");
		// Le agrego una bota
		pepe = new BotaDeBronce(pepe);
		Assert.assertEquals(15 + 5, pepe.obtenerPuntosDeDefensa());
		Assert.assertEquals(5 + 10, pepe.obtenerPuntosDeVelocidad());

		// agrego espada
		pepe = new EspadaDobleFilo(pepe);
		System.out.println(pepe.obtenerPuntosDeAtaque());
		Assert.assertEquals(10 + 15, pepe.obtenerPuntosDeAtaque());
		
		// agrego otra espada
		pepe = new EspadaBastarda(pepe);
		Assert.assertEquals(10 + 15 + 20, pepe.obtenerPuntosDeAtaque());
		

	}
	
}
