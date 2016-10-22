package items;

import personajes.Personaje;

public class BotaDeOro extends Bota{

	public BotaDeOro(Personaje personajeDecorado) {
		super(personajeDecorado);
		this.defensa=10;
		this.velocidad=15;
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
