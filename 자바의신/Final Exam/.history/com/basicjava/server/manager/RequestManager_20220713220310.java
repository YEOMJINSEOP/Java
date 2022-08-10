package com.basicjava.server.manager;

import java.net.Socket;
import com.basicjava.server.dto.*;

public class RequestManager {

  public RequestManager(Socket socket) {
  }

  public RequestDTO readRequest() {

    RequestDTO requestDTO = new RequestDTO();

    return requestDTO;
  }
}
