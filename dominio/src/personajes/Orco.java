package personajes;

public class Orco extends Personaje{

	public Orco(){
		this.ataque=15;
		this.defensa=10;
		this.velocidad=2;
	}
	
	@Override
	protected boolean puedeAtacar() {

		return energia >= this.ataque;
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return this.defensa;
	}

	@Override
	protected int calcularPuntosDeAtaque() {

		return this.ataque;
	}
	@Override
	public int obtenerPuntosDeVelocidad(){
		return this.velocidad;
	}

}
