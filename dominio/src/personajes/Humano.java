package personajes;

public class Humano extends Personaje {

	public Humano(String nom) {
		this.ataque = 10;
		this.defensa = 15;
		this.velocidad = 5;
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

	@Override
	public int ataqueEspecial() {
		
		return this.calcularPuntosDeAtaque()+this.obtenerPuntosDeDefensa()*2+this.obtenerPuntosDeVelocidad();
	}
	
}
