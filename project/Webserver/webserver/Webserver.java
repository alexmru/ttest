package webserver;

import java.net.*;
import java.util.Date;


import java.io.*;

public class Webserver extends Thread {
	protected Socket clientSocket;
	public static final String rootFolder = "TestSite";
//	public static void main(String[] args) throws IOException {
//		ServerSocket serverSocket = null;
//
//		try {
//			serverSocket = new ServerSocket(10008);
//			System.out.println("Connection Socket Created");
//			try {
//				while (true) {
//					System.out.println("Waiting for Connection");
//					new Webserver(serverSocket.accept());
//				}
//			} catch (IOException e) {
//				System.err.println("Accept failed.");
//				System.exit(1);
//			}
//		} catch (IOException e) {
//			System.err.println("Could not listen on port: 10008.");
//			System.exit(1);
//		} finally {
//			try {
//				serverSocket.close();
//			} catch (IOException e) {
//				System.err.println("Could not close port: 10008.");
//				System.exit(1);
//			}
//		}
//	}

	public Webserver(Socket clientSoc) {
		clientSocket = clientSoc;
		start();
	}

	public void run() {
		System.out.println("New Communication Thread Started");
		PrintWriter out=null;
		BufferedReader in=null;
		try {
			out = new PrintWriter(clientSocket.getOutputStream(),
					true);
			in = new BufferedReader(new InputStreamReader(
					clientSocket.getInputStream()));
			String inputLine;
			String commandLine;
			inputLine = in.readLine();
			commandLine = inputLine;
			do {
				if (inputLine.trim().equals(""))
					break;
				
				System.out.println("Server: " + inputLine);
			}while ((inputLine = in.readLine()) != null);
			if(commandLine==null) {
				System.out.println("Error ");
			}
			
			String method = commandLine.substring(0, commandLine.indexOf(' '));
			commandLine = commandLine.substring(commandLine.indexOf(' ')+1);
			String requestedFile = commandLine.substring(0, commandLine.lastIndexOf("HTTP/")).trim();
			requestedFile = Webserver.rootFolder + requestedFile;
			
			if(requestedFile.endsWith("/"))
				requestedFile = requestedFile + "index.html"; // in index.html tin minte linkuri catre pagini
			
			switch(method) {
			case "HEAD": 
				
			case "GET":
				try {
				Pair fileContent = readFile(requestedFile);
				
				out.println("HTTP/1.1 200 OK");
				out.println("Server: Java HTTP Server upt.ac.SSC.AlexPescaru : 1.0");
				out.println("Date: " + new Date());
				out.println("Content-Type: text/html; charset=UTF-8");
				out.println("Content-Length: " + fileContent.length);
				out.println();
				out.println(fileContent.content);
				}
				catch(FileNotFoundException e) {
					//To be implemented
				}
				break;
			default:
				System.out.println("Method unimplemented: " + method);
			}
			
			
		} catch (IOException e) {
			System.err.println("Problem with Communication Server");
			System.exit(1);
		}
		finally {
			if(out!=null)
				out.close();
			if(in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(clientSocket!=null)
				try {
					clientSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	private Pair readFile(String filePath) throws FileNotFoundException {
		Pair retVal = new Pair();
		
		File f = new File(filePath);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
		
		return retVal;
	}
	
}

class Pair{
	int length;
	byte[] content;
}