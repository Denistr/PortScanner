package ru.ncedu.istratenko;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by denis on 13.10.15.
 */
public class Program {

    public static void main (String[] args){
        Client client = new Client();
        client.runProgram();
        }
    }
