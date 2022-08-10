package com.basicjava.server.manager;

import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedInputStream;
import java.net.Socket;
import com.basicjava.server.dto.*;

public class RequestManager {

  Socket socket;

  public RequestManager(Socket socket) {
    this.socket = socket;
  }

  public RequestDTO readRequest() {
    InputStream request = new BufferedInputStream(socket.getInputStream());
  }
}
