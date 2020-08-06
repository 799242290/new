package SocketDemo;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),6666);
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        PrintWriter pw = new PrintWriter(os);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        pw.println("客服你好");
        pw.flush();
        String s = br.readLine();
        System.out.println(s);
        br.close();
        is.close();
        pw.close();
        os.close();
    }
}
