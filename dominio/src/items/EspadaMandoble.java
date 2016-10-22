package items;

import personajes.Personaje;
public class EspadaMandoble extends Espada{

	public EspadaMandoble(Personaje personajeDecorado) {
		super(personajeDecorado);
		ataque=26;
	}
	
	@Override
	public int obtenerPuntosDeAtaque(){
		return obtenerPuntosDeAtaque()+ataque;
	}
}