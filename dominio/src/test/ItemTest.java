package test;

import org.junit.Assert;
import org.junit.Test;

import items.BotaDeBronce;
import items.EspadaDobleFilo;
import personajes.Humano;
import personajes.Personaje;

public class ItemTest {

	@Test
	public void quePuedoAgregarItemBota() {
		Personaje pepe = new Humano();
		Assert.assertEquals(10, pepe.obtenerPuntosDeDefensa());
		Assert.assertEquals(5, pepe.obtenerPuntosDeVelocidad());

		// Le agrego una bota
		pepe = new BotaDeBronce(pepe);
		Assert.assertEquals(10 + 5, pepe.obtenerPuntosDeDefensa());
		Assert.assertEquals(5 + 10, pepe.obtenerPuntosDeVelocidad());

	}

	public void agregoEspadaAndBota() {
		Personaje pepe = new Humano();
		// Le agrego una bota
		pepe = new BotaDeBronce(pepe);
		Assert.assertEquals(10 + 5, pepe.obtenerPuntosDeDefensa());
		Assert.assertEquals(5 + 10, pepe.obtenerPuntosDeVelocidad());

		// agrego espada
		pepe = new EspadaDobleFilo(pepe);
		Assert.assertEquals(10 + 15, pepe.obtenerPuntosDeAtaque());
		// agrego otra espada
		pepe = new EspadaDobleFilo(pepe);
		Assert.assertEquals(10 + 15 + 15, pepe.obtenerPuntosDeAtaque());
	}
}
