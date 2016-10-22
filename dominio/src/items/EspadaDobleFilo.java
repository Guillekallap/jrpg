package items;

import personajes.Personaje;

public class EspadaDobleFilo extends Espada{

	public EspadaDobleFilo(Personaje personajeDecorado) {
		super(personajeDecorado);
		ataque=15;
	}
	
	@Override
	public int obtenerPuntosDeAtaque(){
		return obtenerPuntosDeAtaque()+ataque;
	}
}
