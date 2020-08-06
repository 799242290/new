package SocketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("连接上来了");
            ServerThread serverThread = new ServerThread(socket);
            Thread thread = new Thread(serverThread);
            thread.start();

        }
    }
}