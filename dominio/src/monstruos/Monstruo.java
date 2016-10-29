package monstruos;

import personajes.*; 

public abstract class Monstruo implements Atacable {
	
	protected int salud = 100;
	protected int ataque;
	protected int defensa;
	protected int velocidad;
	protected int nivel;
	
	public int obtenerPuntosDeAtaque(){
		return ataque;
	}
	
	public int obtenerPuntosDeDefensa(){
		return defensa;
	}
	
	public int getSalud() {
		return salud;
	}

	public int obtenerPuntosDeVelocidad(){
		return velocidad;
	}
	
	public int obtenerNivel(){
		return nivel;
	}
	
	public void atacar (Atacable atacado){
		atacado.serAtacado(obtenerPuntosDeAtaque());
	}
	
	@Override
	public void serAtacado(int danio) {
		danio = this.obtenerPuntosDeDefensa() - danio;
		if (danio > 0)
			return;
		else
			this.salud += danio;
		
		
	}
	

}
