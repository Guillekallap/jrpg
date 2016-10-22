package items;

import personajes.Personaje;

public class BotaDePlata extends Bota{

	public BotaDePlata(Personaje personajeDecorado) {
		super(personajeDecorado);
		this.defensa=8;
		this.velocidad=12;
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