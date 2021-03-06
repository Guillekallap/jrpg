package main.java.items;

import main.java.personajes.Personaje;
import main.java.personajes.PersonajeEquipado;

public abstract class Espada extends PersonajeEquipado {
	protected int ataque;

	public Espada(Personaje personajeDecorado) {
		super(personajeDecorado);

	}

	@Override
	public int obtenerPuntosDeAtaque() {
		return super.obtenerPuntosDeAtaque() + ataque;
	}

	@Override
	public final int ataqueEspecialCasta() {

		return super.ataqueEspecialCasta() + ataque;

	}

	@Override
	public int ataqueEspecial() {

		return super.ataqueEspecial() + ataque;
	}
}
