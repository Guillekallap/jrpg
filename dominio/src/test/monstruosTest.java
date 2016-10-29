package test;

import org.junit.Assert;
import org.junit.Test;

import monstruos.DragonDeFuego;
import monstruos.Monstruo;
import personajes.Humano;
import personajes.Personaje;

public class monstruosTest {

	
	@Test
	public void moutruosAtacan(){
		Personaje misa = new Humano( "Misa");
		Monstruo fire = new DragonDeFuego();
		
		fire.atacar(misa);
		Assert.assertEquals(65, misa.getSalud());
		
		misa.atacar(fire);
		Assert.assertEquals(100,fire.getSalud());

	}
}
