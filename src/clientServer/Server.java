package clientServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(4711);

        Socket eenPersoon = ss.accept();

        InputStream input = eenPersoon.getInputStream();
        int readByte = input.read();

        while(readByte != -1) {
            System.out.println((char)readByte);
            readByte = input.read();
        }

        eenPersoon.close();
        ss.close();
    }
}
