package test;

import org.junit.Assert;
import org.junit.Test;

import items.EspadaClaymore;
import personajes.Asesino;
import personajes.Guerrero;
import personajes.Humano;
import personajes.Orco;
import personajes.Personaje;

public class CastaTest {

	@Test
	public void probarSoloCasta(){
		Personaje juan = new Humano();
		juan.setCasta(new Guerrero());
		
		Assert.assertEquals(10+5, juan.obtenerPuntosDeAtaque());
	}
	@Test
	public void castaMasItem(){
		Personaje juan = new Orco();
		
		juan.setCasta(new Asesino());
		
		Assert.assertEquals(10+2, juan.obtenerPuntosDeDefensa());
		Assert.assertEquals(15+10, juan.obtenerPuntosDeAtaque());
		
		juan = new EspadaClaymore(juan);
		System.out.println(juan.obtenerPuntosDeAtaque());
		Assert.assertEquals(15+10+22, juan.obtenerPuntosDeAtaque());
		
		
	}
}
