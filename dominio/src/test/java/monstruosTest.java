package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.personajes.*;
import main.java.monstruos.*;;

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
