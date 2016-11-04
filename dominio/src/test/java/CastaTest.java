package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.items.*;
import main.java.personajes.*;



public class CastaTest {

	@Test
	public void probarSoloCasta(){
		Personaje juan = new Humano("juan");
		juan.setCasta(new Guerrero());
		
		Assert.assertEquals(10+5, juan.obtenerPuntosDeAtaque());
	}
	@Test
	public void castaMasItem(){
		Personaje juan = new Orco("juan");
		
		juan.setCasta(new Asesino());
		
		Assert.assertEquals(10+2, juan.obtenerPuntosDeDefensa());
		Assert.assertEquals(15+10, juan.obtenerPuntosDeAtaque());
		
		juan = new EspadaClaymore(juan);
		Assert.assertEquals(15+10+22, juan.obtenerPuntosDeAtaque());
		
		
	}
}
