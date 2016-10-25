package personajes;

public class Humano extends Personaje {

	public Humano() {
		this.ataque = 10;
		this.defensa = 10;
		this.velocidad=5;
	}

	@Override
	protected boolean puedeAtacar() {

		return energia >= this.ataque;
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		return this.defensa+casta.getDefensa();
	}

	@Override
	protected int calcularPuntosDeAtaque() {

		return this.ataque+casta.getAtaque();
	}
	@Override
	public int obtenerPuntosDeVelocidad(){
		return this.velocidad+casta.getVelocidad();
	}

}
