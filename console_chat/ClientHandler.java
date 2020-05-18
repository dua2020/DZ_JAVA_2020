package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.util.Iterator;

import static Server.Server.clients;


public class ClientHandler extends Thread {
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private String userName = "";   // добавили имя с кем чат

    public ClientHandler(Socket socket){
        try {
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String str = "";
                    /* try {
                        // userName = in.readLine();
                        userName = in.readUTF();
                         while (true) {
                              str = "";
                              str = in.readUTF();
                           // str = in.readLine();
                            if (str.equals("exit")) break;
                            else Server.broadcastMsg(str);
                        } */
                        try {
                            // userName = in.readLine();
                            userName = in.readUTF();
                            for(ClientHandler iter : clients) {
                                iter.out.writeUTF(userName + " вошел на серевер");
                            }
                            String str1 = "";
                            while (true) {
                            //    str = in.readLine();
                                userName = in.readUTF();
                                if(str1.equals("exit")) break;
                                else Server.broadcastMsg(str);

                                for(ClientHandler iter : clients) {
                                    iter.out.writeUTF(userName + ": " + str1);
                                }
                            }
                            for(ClientHandler iter : clients) {
                                iter.out.writeUTF(userName + " покинул чат");
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
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
