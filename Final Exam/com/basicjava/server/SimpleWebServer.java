package com.basicjava.server;

import java.net.ServerSocket;
import java.net.Socket;

import com.basicjava.server.handler.*;

public class SimpleWebServer {
  public static void main(String[] args) {

  }

  public void run() {
    ServerSocket server = null;
    try {
      server = new ServerSocket();
      while (true) {
        Socket socket = server.accept();
        RequestHandler requestHandler = new RequestHandler(socket);
        requestHandler.start();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
