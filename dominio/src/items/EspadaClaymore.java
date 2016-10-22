package items;

import personajes.Personaje;

public class EspadaClaymore extends Espada{

	public EspadaClaymore(Personaje personajeDecorado) {
		super(personajeDecorado);
		ataque=22;
	}
	
	@Override
	public int obtenerPuntosDeAtaque(){
		return obtenerPuntosDeAtaque()+ataque;
	}
}