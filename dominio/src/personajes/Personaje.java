package personajes;

public abstract class Personaje implements Atacable {

	protected int energia = 100;
	protected int salud = 100;
	
	protected int energiaMax = 100;
	protected int saludMax = 100;
	
	protected int ataque;
	protected int defensa;
	protected int velocidad;
	protected Casta casta;
	

	public final void atacar(Atacable atacado) {
		if (puedeAtacar()) {
			atacado.serAtacado(calcularPuntosDeAtaque());
			energia -= calcularPuntosDeAtaque();
			despuesDeAtacar();
		}
	}

	@Override
	public void serAtacado(int danio) {
		danio = this.obtenerPuntosDeDefensa() - danio;
		if (danio > 0)// si el danio es mayor a 0 es que el danio no pudo
			return;// contra la defenza entonces no baja vida
		else
			this.salud -= danio;
	}

	protected void despuesDeAtacar() {
	}

	protected abstract boolean puedeAtacar();
	
	public abstract int obtenerPuntosDeDefensa();
	public abstract int obtenerPuntosDeVelocidad();
	protected abstract int calcularPuntosDeAtaque();

	public void serCurado() {
		this.salud = saludMax;
	}

	public void serEnergizado() {
		this.energia = energiaMax;
	}

	public int getSalud() {
		return this.salud;
	}

	public int obtenerPuntosDeAtaque() {
		return calcularPuntosDeAtaque();
	}
}
