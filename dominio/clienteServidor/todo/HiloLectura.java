package todo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class HiloLectura implements Runnable {
	private Socket socket;
	private DataInputStream in;
	private String nombre;
	private String mensaje;

	public HiloLectura(final Socket socket, String nom) {
		this.socket = socket;
		this.nombre = nom;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			// Ciclo infinito que escucha por mensajes del servidor y los
			// muestra en el panel
			while (true) {
				mensaje = in.readUTF();
				mostrarMsg(mensaje);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	public void mostrarMsg(String mensaje){
		System.out.println("");
		System.out.println(mensaje);
	}
}
