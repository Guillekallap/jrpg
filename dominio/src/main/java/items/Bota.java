package main.java.items;

import main.java.personajes.Personaje;
import main.java.personajes.PersonajeEquipado;

public abstract class Bota extends PersonajeEquipado {
	protected int defensa;
	protected int velocidad;
	public Bota(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	@Override
	public int obtenerPuntosDeDefensa(){
		return super.obtenerPuntosDeDefensa()+defensa;
	}
	@Override
	public int obtenerPuntosDeVelocidad(){
		return super.obtenerPuntosDeVelocidad()+velocidad;
	}
	
}
