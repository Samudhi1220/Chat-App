package lk.ijse.chatApp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ServerInitializer {
   private static ArrayList<Handle> handles = new ArrayList<>();
   public static void main(String[]args) throws IOException {

       ServerSocket serverSocket = new ServerSocket(6705);
       Socket accept;

       while (true){
           System.out.println("Waiting for Client");
           accept = serverSocket.accept();
           System.out.println("Client Connected");
           Handle clientThread = new Handle(accept, handles);
           handles.add(clientThread);
           clientThread.start();
       }
   }
}