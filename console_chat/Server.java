package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Server {
    static List<ClientHandler> clients = Collections.synchronizedList (new ArrayList<ClientHandler>());
    public static void main(String[] args) {

        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8289);
            System.out.println("Сервер запущен!");
            while(true) {
                socket = serverSocket.accept();
                clients.add(new ClientHandler(socket));
                //     System.out.println("Клиент " + clients.iterator() + " подключился!");
            }
        /*    synchronized(clients) {
                Iterator<ClientHandler> iter = clients.iterator();
                while(iter.hasNext()) {
                    ((Connection) iter.next()).out.writeUTF("клиент " + iter.toString() + " подключился к серверу");
 ТУТ надо написать вывод в консоль !!!
                  while(iter.hasNext()) {
                     ((Connection) iter.next()).close();
                  }
            } */
      /*      for(ClientHandler c : clients) {
                System.out.println(clients + " подключился к серверу");
            } */
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static public void broadcastMsg(String msg){
        for(ClientHandler o: clients){
            o.sendMsg(msg);
        }
    }
}
