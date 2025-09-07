package myami;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws  IOException {
		
		
		String site = "127.0.0.1";
		int port = 43000;
		
		
		
		Socket socket = new Socket(site, port);
		Scanner in = new Scanner(System.in);
		/*
		PrintWriter send = new PrintWriter(socket.getOutputStream());
		System.out.println("Enter message");
		String message = in.nextLine();
		send.println(message);
		send.flush();
		
		*/
		
		
	}

}
