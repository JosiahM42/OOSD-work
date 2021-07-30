package week.pkg19s;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String argv[]) throws Exception {
        String clientSentence;
        String uppercaseSentence;
        ServerSocket welcomeSocket = new ServerSocket(8080);
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient
                    = new BufferedReader(new
                    InputStreamReader(connectionSocket.getInputStream()));
            clientSentence = inFromClient.readLine();
            System.out.println("Received data from a client: " +
                    clientSentence);

            DataOutputStream outToClient = new
                    DataOutputStream(connectionSocket.getOutputStream());
            uppercaseSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(uppercaseSentence);

            connectionSocket.close();
        }
    }
}


