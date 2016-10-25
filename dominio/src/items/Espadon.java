package items;

import personajes.Personaje;

public class Espadon extends Espada{

	public Espadon(Personaje personajeDecorado) {
		super(personajeDecorado);
		ataque=25;
	}
	
	@Override
	public int obtenerPuntosDeAtaque(){
		return super.obtenerPuntosDeAtaque()+ataque;
	}
}
