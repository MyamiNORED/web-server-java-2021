package com.Hello.Browser;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================THE INTERNETS!===============Where to? ");
        String ip = scanner.nextLine();
        int port = 80 ;
        try (Socket socket = new Socket(ip , port)) {
			PrintWriter client = new PrintWriter(socket.getOutputStream());
			client.println("GET / HTTP/1.1");
			client.println("Host: "+ip);
			client.println();
			client.flush();
			Scanner reader = new Scanner(socket.getInputStream());
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
		}
    }
    
}
