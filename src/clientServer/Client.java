package clientServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
        public static void main(String[] args) throws IOException {
            Socket s = new Socket("localhost", 4711);
            OutputStream os = s.getOutputStream();
            os.write("hello\n".getBytes());
            s.close();
        }
}
