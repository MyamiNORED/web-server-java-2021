package myami;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	private static int  PORT =  43000;

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(PORT);
		
		Socket socket = server.accept();
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("Connected to the Server");
		out.flush();
		 
	
		out.close();
		socket.close();
		server.close();
		
	}
}
