package todo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class HiloEscritura implements Runnable {
	private Socket socket;
	private DataInputStream in;
	private DataOutputStream out;
	private String nombre;
	public HiloEscritura(final Socket socket,String nom) {
		this.socket = socket;
		this.nombre= nom;
        try {
			out = new DataOutputStream(this.socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		String mensaje = "";
		BufferedReader bufferedReader = new java.io.BufferedReader(new InputStreamReader(System.in));

		while (!(mensaje.equals("salir") || mensaje.equals("Salir") || mensaje.equals("SALIR"))) {
			try {
				mensaje = bufferedReader.readLine();
				enviarMsg(nombre + ": " + mensaje);
			} catch (IOException e) {
			enviarMsg(nombre + ": " + "MENSAJE DAÑADO");
				e.printStackTrace();
			}

		}
	}
	public void enviarMsg(String msg) {

		try {
			out.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
