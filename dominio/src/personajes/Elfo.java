package personajes;

public class Elfo extends Personaje {

	public Elfo(String nom) {
		this.ataque = 12;
		this.defensa = 5;
		this.velocidad = 7;
		this.nombre =nom;
	}

	@Override
	protected boolean puedeAtacar() {

		return energia >= this.ataque;
	}
	
	@Override
	public int obtenerPuntosDeDefensa() {
		if (this.casta != null)
			return this.defensa + casta.getDefensa();
		else
			return this.defensa;
	}

	@Override
	protected int calcularPuntosDeAtaque() {

		if (this.casta != null)
			return this.ataque + casta.getAtaque();
		else
			return this.ataque;
	}

	@Override
	public int obtenerPuntosDeVelocidad() {
		if (this.casta != null)
			return this.velocidad + casta.getVelocidad();
		else
			return this.velocidad;
	}

	
}
