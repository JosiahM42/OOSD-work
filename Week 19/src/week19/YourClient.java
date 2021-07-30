package week19;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class YourClient {
    public static void main(String argv[]) throws Exception {
        String originalSentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new
                InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 6789);
        System.out.println("Please enter a line of text:");
        originalSentence = inFromUser.readLine();
        DataOutputStream outToServer = new
                DataOutputStream(clientSocket.getOutputStream());
        outToServer.writeBytes(originalSentence + '\n');
        BufferedReader inFromServer = new BufferedReader(new
                InputStreamReader(clientSocket.getInputStream()));
        modifiedSentence = inFromServer.readLine();
        System.out.println("Received reply from the server: " +
                modifiedSentence);
        clientSocket.close();
    }

}
