package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

import static Server.Server.clients;  // ???

public class ClientHandler extends Thread {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    public static String userName = "";   // добавили имя с кем чат

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // userName = in.readLine();
                        userName = in.readUTF().toString();
                        synchronized (clients) {
                            Iterator<ClientHandler> iter = clients.iterator();
                            while (iter.hasNext()) {
                                iter.next().out.writeUTF("клиент " + userName + " подключился к серверу");
                            }
                        }
                        String str = "";
                        while (true) {
                            //  str = in.readLine();
                            str = in.readUTF().toString();
                            if (str.equals("exit")) break;
                            Server.broadcastMsg(userName + "" + str);
                            // Отправляем всем клиентам очередное сообщение
                            synchronized (clients) {
                                Iterator<ClientHandler> iter = clients.iterator();
                                while (iter.hasNext()) {
                                    ((ClientHandler) iter.next()).out.writeUTF(userName + ": " + str);
                                }
                            }
                        }
                        synchronized(clients) {
                            Iterator<ClientHandler> iter = clients.iterator();
                            while(iter.hasNext()) {
                                ((ClientHandler) iter.next()).out.writeUTF(userName + " покинул чат");
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
     }
    public void sendMsg(String msg){
        try {
            out.writeUTF("Все привет: "+msg);
         //   System.out.println("Привет "+ userName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     //  Закрывает входной и выходной потоки и сокет

    public void close() {
        try {
            in.close();
            out.close();
            socket.close();

            // Если больше не осталось соединений, закрываем всё,
            // что есть и завершаем работу сервера
            clients.remove(this);
            if (clients.size() == 0) {
                Server.closeAll();
                System.exit(0);
            }
        } catch (Exception e) {
            System.err.println("Потоки не были закрыты!");
        }
    }
}
