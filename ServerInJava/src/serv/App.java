package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class App {

	public static void main(String args[]) throws IOException {
		ServerSocket server = new ServerSocket(64000);
		Socket socket = server.accept();
		
		Scanner reader = new Scanner(socket.getInputStream());
		
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		
		reader.close();
		writer.close();
		socket.close();
		server.close();
	}
	
}
