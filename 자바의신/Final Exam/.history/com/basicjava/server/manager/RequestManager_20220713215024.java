package com.basicjava.server.manager;

import java.net.Socket;
import com.basicjava.server.dto.*;

public class RequestManager {
  public RequestDTO readRequest() {
    RequestDTO requestDTO = new RequestDTO();

    return requestDTO;
  }

  public RequestManager(Socket socket) {
  }
}
