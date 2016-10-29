package personajes;

public class PersonajeEquipado extends Personaje {

	private Personaje personajeDecorado;

	public PersonajeEquipado(Personaje personajeDecorado) {
		this.personajeDecorado = personajeDecorado;
	}

	@Override
	protected boolean puedeAtacar() {
		return this.personajeDecorado.puedeAtacar();
	}

	@Override
	public int obtenerPuntosDeDefensa() {

		return this.personajeDecorado.obtenerPuntosDeDefensa();
	}

	@Override
	public int obtenerPuntosDeVelocidad() {

		return this.personajeDecorado.obtenerPuntosDeVelocidad();
	}

	@Override
	public int obtenerPuntosDeAtaque() {

		return this.personajeDecorado.obtenerPuntosDeAtaque();
	}

	@Override
	protected int calcularPuntosDeAtaque() {
		return this.personajeDecorado.calcularPuntosDeAtaque();
	}

	@Override
	public String getNombre() {
		return personajeDecorado.getNombre();
	}
	@Override
	public int ataqueEspecialCasta() {

		return this.personajeDecorado.ataqueEspecialCasta();

	}

	@Override
	public int ataqueEspecial() {
		return this.personajeDecorado.ataqueEspecial();
	}
	
}
