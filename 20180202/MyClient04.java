import java.io.*;
import java.net.*;

public class MyClient04{
    public static void main(String[] args){
        Socket sock;
        byte[] buff = new byte[1024];
        OutputStream os = null;


        try{
            sock = new Socket(args[0],Integer.parseInt(args[1]));
            os = sock.getOutputStream();

            String msg =   "170148" + "\n"
                         + "SugarDoll" + "\n"
                         + "E-8-M----ethyl---N-4-h---ydr";

            os.write(msg.getBytes());
            os.write(buff);

            sock.close();
        }catch(Exception e){
            System.out.println("JoinError");
        }
    }
}
