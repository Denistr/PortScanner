package ru.ncedu.istratenko;

import java.net.*;
import java.util.Scanner;

/**
 * Created by denis on 19.10.15.
 */
public class DataInput {

    private Scanner sc = new Scanner(System.in);
    private int port=0;
    private String addrstring = null;

    public InetAddress inputhostaddr(){

        while (true) {
            addrstring = sc.nextLine();
            try {
                InetAddress addr = InetAddress.getByName(addrstring);
                return addr;
            } catch (UnknownHostException e) {
                System.out.println("Unknown Host. Try again");
            }
        }
    }


    public int inputport(){
        while(true) {
            try {
                port=0;
                port = sc.nextInt();
            } catch (Exception e){
                //e.printStackTrace();
                System.out.println("Input error Tru again");
            }
            if (port<0 || port>65535){
                System.out.println("Input error. Tru again");
            } else
                return port;
        }
    }
}
