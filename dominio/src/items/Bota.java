package items;

import personajes.Personaje;
import personajes.PersonajeEquipado;

public abstract class Bota extends PersonajeEquipado {

	public Bota(Personaje personajeDecorado) {
		super(personajeDecorado);
	}

	protected int defensa;
	protected int velocidad;
	
}
