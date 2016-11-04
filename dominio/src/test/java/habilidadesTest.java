package test.java;

import org.junit.Assert;
import org.junit.Test;

import main.java.items.*;
import main.java.personajes.*;


public class habilidadesTest {

	@Test
	public void probarAtaqueCastaGuerrro() {
		Personaje misa = new Humano("Misa");

		misa.setCasta(new Guerrero());
		misa = new EspadaDobleFilo(misa);
		Assert.assertEquals(15 * 2 + 15, misa.ataqueEspecialCasta());
		misa = new Espadon(misa);
		Assert.assertEquals(15 * 2 + 15 + 25, misa.ataqueEspecialCasta());
	}

	@Test
	public void probarAtaqueCastaAsesino() {
		Personaje misa = new Orco("Misa");

		misa.setCasta(new Asesino());
		misa = new EspadaDobleFilo(misa);
		/*
		 * System.out.println(misa.ataqueEspecialCasta());
		 * System.out.println(misa.obtenerPuntosDeAtaque());
		 */
		misa = new Espadon(misa);
		/*
		 * System.out.println(misa.ataqueEspecialCasta());
		 * System.out.println(misa.obtenerPuntosDeAtaque());
		 */
	}

	@Test
	public void probarAtaqueRaza() {
		Personaje misa = new Orco("Misa");

		misa.setCasta(new Guerrero());
		Assert.assertEquals((15 + 5) * 2 + (10 + 8) + (2 + 2), misa.ataqueEspecial());

		Personaje kim = new Elfo("Kim");

		kim.setCasta(new Guerrero());
		System.out.println(misa.ataqueEspecial());
		Assert.assertEquals((12 + 5) + (5 + 8) + (10 + 2) * 3, kim.ataqueEspecial());
	}

	@Test
	public void probarAtaqueRazaEquipado() {
		Personaje misa = new Orco("Misa");

		misa.setCasta(new Guerrero());
		misa = new EspadaDobleFilo(misa);

		Assert.assertEquals((15 + 5) * 2 + (10 + 8) + (2 + 2) + 15, misa.ataqueEspecial());

		misa = new EspadaLarga(misa);
		Assert.assertEquals((15 + 5) * 2 + (10 + 8) + (2 + 2) + 15 + 18, misa.ataqueEspecial());

	}
}
