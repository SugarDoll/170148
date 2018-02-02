import java.net.*;
import java.io.*;

public class Myserver04{
    public static void main(String[] args){
        byte[] buff = new byte[1024];
        InputStream is = null;
        OutputStream os = null;
        ServerSocket ss = null;
        Socket sock;

        try{
            ss = new ServerSocket(5999,30);
            sock = ss.accept();
            os = sock.getOutputStream();

            String msg = "へろー";

            os.write(msg.getBytes());
            os.write(buff);

        }catch(Exception e){
            System.out.println("Error");
        }
    }
}