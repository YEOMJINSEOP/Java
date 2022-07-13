package com.basicjava.server.handler;

import java.net.Socket;
import com.basicjava.*;
import com.basicjava.server.dto.*;
import com.basicjava.server.manager.ResponseManager;

public class RequestHandler extends Thread {
  public RequestHandler(Socket socket) {
  };

  public void run(Socket socket) {
    RequestHandler requestHandler = new RequestHandler(socket);
    requestHandler.readRequest();
    ResponseManager responseManager = new ResponseManager(socket, requestDTO);
  };
}
