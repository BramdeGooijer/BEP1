import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class BepClientApp {
    class Client {
        public static void main(String[] args) throws IOException {
            Socket s = new Socket("localhost", 4711);
            OutputStream os = s.getOutputStream();
            os.write("hello\n".getBytes());
            s.close();
        }
    }
}
