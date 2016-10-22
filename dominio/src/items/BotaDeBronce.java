package items;

import personajes.Personaje;

public class BotaDeBronce extends Bota{

	public BotaDeBronce(Personaje personajeDecorado) {
		super(personajeDecorado);
		this.defensa=5;
		this.velocidad=10;
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
