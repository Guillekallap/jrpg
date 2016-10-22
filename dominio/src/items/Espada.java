package items;

import personajes.Personaje;
import personajes.PersonajeEquipado;

public abstract class Espada extends PersonajeEquipado{

	public Espada(Personaje personajeDecorado) {
		super(personajeDecorado);
		
	}
	protected int ataque;
	
}
