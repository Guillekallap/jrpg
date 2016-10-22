package personajes;

public class PersonajeEquipado extends Personaje{

	private Personaje personajeDecorado;
	
	public PersonajeEquipado(Personaje personajeDecorado){
		this.personajeDecorado=personajeDecorado;
	}
	@Override
	protected boolean puedeAtacar() {
		return this.personajeDecorado.puedeAtacar();
	}

	@Override
	public int obtenerPuntosDeDefensa() {
		// TODO Auto-generated method stub
		return this.personajeDecorado.obtenerPuntosDeDefensa();
	}
	@Override
	public int obtenerPuntosDeVelocidad() {
		// TODO Auto-generated method stub
		return this.personajeDecorado.obtenerPuntosDeVelocidad();
	}
	@Override
	public int obtenerPuntosDeAtaque() {
		// TODO Auto-generated method stub
		return this.personajeDecorado.obtenerPuntosDeAtaque();
	}
	@Override
	protected int calcularPuntosDeAtaque() {
		return this.personajeDecorado.calcularPuntosDeAtaque();
	}
	
	

}
