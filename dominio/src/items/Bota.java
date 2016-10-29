package items;

import personajes.Personaje;
import personajes.PersonajeEquipado;

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
