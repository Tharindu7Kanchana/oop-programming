package BotNet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public Client(){
        try {
            Socket ss = new Socket("localhost",2222);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void sendMessage(Socket server, String msg) {
        try {
            DataOutputStream sdos = new DataOutputStream(server.getOutputStream());
            sdos.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    String recieveMessage(Socket server) {
        try {
            DataInputStream sdis = new DataInputStream(server.getInputStream());
            return sdis.readUTF();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
