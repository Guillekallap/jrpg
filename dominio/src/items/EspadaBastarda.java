package items;

import personajes.Personaje;

public class EspadaBastarda extends Espada{

	public EspadaBastarda(Personaje personajeDecorado) {
		super(personajeDecorado);
		ataque=20;
	}
	
	@Override
	public int obtenerPuntosDeAtaque(){
		return super.obtenerPuntosDeAtaque()+ataque;
	}
}