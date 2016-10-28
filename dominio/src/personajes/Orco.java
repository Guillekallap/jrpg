package personajes;




public class Orco extends Personaje {

	

	public Orco(String nom) {
		this.ataque = 15;
		this.defensa = 10;
		this.velocidad = 2;
		nombre =nom;
	}

	@Override
	protected boolean puedeAtacar() {

		return energia >= this.ataque;
	}

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
