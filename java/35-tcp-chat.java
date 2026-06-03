/*
35. TCP Client-Server Chat
• Objective: Use Java sockets for TCP communication.
• Task: Implement a simple TCP chat system.
• Instructions:
o Create a ServerSocket that listens for connections.
o Accept client connections and use InputStream and OutputStream for two-way
communication.
o Run server and client in different terminals.
*/



import java.io.*;
import java.net.*;

class ChatServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader serverInput = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String clientMsg, serverMsg;

            while (true) {

                clientMsg = in.readLine();
                if (clientMsg == null || clientMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("Client: " + clientMsg);

                System.out.print("Server: ");
                serverMsg = serverInput.readLine();
                out.println(serverMsg);

                if (serverMsg.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}



import java.io.*;
import java.net.*;

class ChatClient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader clientInput = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String clientMsg, serverMsg;

            while (true) {

                System.out.print("Client: ");
                clientMsg = clientInput.readLine();
                out.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("bye")) {
                    break;
                }

                serverMsg = in.readLine();
                if (serverMsg == null || serverMsg.equalsIgnoreCase("bye")) {
                    System.out.println("Server disconnected.");
                    break;
                }

                System.out.println("Server: " + serverMsg);
            }

            socket.close();

        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
        }
    }
}