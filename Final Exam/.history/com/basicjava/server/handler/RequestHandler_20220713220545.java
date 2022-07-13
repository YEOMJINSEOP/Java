package com.basicjava.server.handler;

import java.net.Socket;
import com.basicjava.server.*;

public class RequestHandler extends Thread {
  public RequestHandler(Socket socket) {
    this.socket = socket;
  };

  public void run(Socket socket) {
    RequestHandler requestHandler = new RequestHandler(socket);
    requestHandler.readRequest();
  };
}
