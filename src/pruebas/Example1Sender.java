/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.net.*;
import java.io.*;

public class Example1Sender {
  
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
        

        InetAddress receiverHost = InetAddress.getByName("127.0.0.1");
        int receiverPort = 6666;
        
        String message = "hola que hace1";
        String message1 = "hola que hace2";
        String message2 = "hola que hace3";
        
        DatagramSocket  mySocket = new DatagramSocket();
        byte[ ] buffer = message.getBytes( );
        byte[ ] buffer1 = message1.getBytes( );
        byte[ ] buffer2 = message2.getBytes( );
        
        DatagramPacket datagram = new DatagramPacket(buffer, buffer.length,receiverHost, receiverPort);
        DatagramPacket datagram1 = new DatagramPacket(buffer1, buffer1.length,receiverHost, receiverPort);
        DatagramPacket datagram2 = new DatagramPacket(buffer2, buffer2.length,receiverHost, receiverPort);
        
        mySocket.send(datagram);
        mySocket.send(datagram1);
        mySocket.send(datagram2);
        mySocket.close( );
            
        
  } // end main
} // end class

