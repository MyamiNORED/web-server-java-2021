package srv;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class App {
	


	
	public static void main(String args[]) throws IOException {
	
		
		ServerSocket server = new ServerSocket(30000) ;
		
		while(true) {
			Socket socket = server.accept() ;
			
			Scanner writer = new Scanner(socket.getInputStream());
			PrintWriter reader = new PrintWriter(socket.getOutputStream());
			
			writer.close();
			reader.close();
			socket.close();
		}
		
	}
	
}