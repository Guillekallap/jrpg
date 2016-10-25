package items;

import personajes.Personaje;


public class EspadaLarga extends Espada{

	public EspadaLarga(Personaje personajeDecorado) {
		super(personajeDecorado);
		ataque=18;
	}
	
	@Override
	public int obtenerPuntosDeAtaque(){
		return super.obtenerPuntosDeAtaque()+ataque;
	}
}