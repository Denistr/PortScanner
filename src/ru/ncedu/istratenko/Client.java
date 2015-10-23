package ru.ncedu.istratenko;

import java.io.IOException;
import java.net.*;

/**
 * Created by denis on 19.10.15.
 */
public class Client {
    Socket clientsocket=null;

    private void checkPorts(InetAddress hostaddr, int port1, int port2 ){
        for (int i = port1; i <= port2; i++) {
                try {
                    clientsocket=new Socket();
                    InetSocketAddress addr=new InetSocketAddress(hostaddr, i);
                    if (clientsocket!=null) {
                        clientsocket.connect(addr, 50); 
                        if (clientsocket.isConnected()) {
                            System.out.println("Port  " + i + " is open");
                        }
                        clientsocket.close();
                    }

            }catch(Exception e){
                //System.out.println("Port " + i + " is close");
            }
        }
    }

    public void runProgram(){
        int port1, port2;
        DataInput data = new DataInput();
        System.out.println("Enter IP address:");
        InetAddress hostaddr= data.inputhostaddr();
        while (true) {
            System.out.println("Enter start port (0 to 65535):");
            port1 = data.inputport();
            System.out.println("Enter end port (0 to 65535):");
            port2 = data.inputport();
            if (port1<=port2){
                break;
            } else
                System.out.println("Start port must be less than end ");
        }
        checkPorts(hostaddr, port1, port2);
    }
}
