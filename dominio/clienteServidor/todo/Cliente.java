package todo;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Cliente cliente = new Cliente("Misael2");
	
	}

	// Declaramos las variables necesarias para la conexion y comunicacion
	private Socket cliente;

	// El puerto debe ser el mismo en el que escucha el servidor
	private int puerto = 2027;
	// Si estamos en nuestra misma maquina usamos localhost si no la ip de la
	// maquina servidor
	private String host = "localhost";
	private final String nombre;

	// Constructor recibe como parametro el panel donde se mostraran los
	// mensajes
	public Cliente(String nombre) throws IOException {
		this.nombre = nombre;
		try {
			cliente = new Socket(host, puerto);
			//out = new DataOutputStream(cliente.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
        Thread hiloEscritura = new Thread(new HiloEscritura(cliente ,this.nombre));
        hiloEscritura.start();
        Thread hiloLectura = new Thread(new HiloLectura(cliente ,this.nombre));
        hiloLectura.start();

	}
	public String getNombre(){
		return this.nombre;
	}
	
	public void mostrarMsg(String mensaje){
		System.out.println("");
		System.out.println(mensaje);
	}
	// Funcion sirve para enviar mensajes al servidor
	
}
