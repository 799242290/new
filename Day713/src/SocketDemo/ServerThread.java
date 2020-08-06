package SocketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread implements Runnable {
     private Socket socket;
     public ServerThread(Socket socket){
         this.socket = socket;
     }
    @Override
    public void run() {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw= new PrintWriter(socket.getOutputStream());
            String str = br.readLine();
            System.out.println(str);
            pw.println("客户你好");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            if(pw !=null){
                pw.close();}
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
