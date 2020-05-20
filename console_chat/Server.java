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
    static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<ClientHandler>());
    public static void main(String[] args) {

        Socket socket = null;
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8289);
            System.out.println("Сервер запущен!");
            while(true) {
                socket = serverSocket.accept();
                // Создаём объект ClientHandler и добавляем его в список
                ClientHandler clientHndlr = new ClientHandler(socket);
                clients.add(clientHndlr);
                //  clients.add(new ClientHandler(socket));
                clientHndlr.start();
                // System.out.println("Клиент " + clients.iterator().toString() + " подключился!");
                System.out.println("Сервер говорит: Клиент подключился к серверу!");
                }
         } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Server.closeAll();
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
                }
            }
        }
    static public void broadcastMsg(String msg){
        for(ClientHandler o: clients) {
            o.sendMsg(msg);
        }
    }
    static public void closeAll() {
        try {
            // serverSocket.close(); !!!
            // Перебор всех Connection и вызов метода close() для каждого. Блок
            // synchronized {} необходим для правильного доступа к одним данным
            // их разных нитей
            synchronized(clients) {
                Iterator<ClientHandler> iter = clients.iterator();
                while(iter.hasNext()) {
                    ((Connection) iter.next()).close();
                }
            }
        } catch (Exception e) {
            System.err.println("Потоки не закрыты !!!");
        }
    }
}
