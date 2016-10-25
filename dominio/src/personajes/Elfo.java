package personajes;

public class Elfo extends Personaje {
	
	public Elfo() {
		this.ataque = 12;
		this.defensa = 5;
		this.velocidad = 7;
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
