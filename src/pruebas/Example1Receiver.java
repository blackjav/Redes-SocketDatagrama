/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author javier
 */
import java.net.*;
import java.io.*;

public class Example1Receiver {
  public static void main(String[] args) throws SocketException, IOException {
    
      int port = 6666;
      final int MAX_LEN = 100;
      while(true)
      {
        DatagramSocket  mySocket = new DatagramSocket(port);
        
        byte[ ] buffer = new byte[MAX_LEN];
        byte[ ] buffer1 = new byte[MAX_LEN];
        byte[ ] buffer2 = new byte[MAX_LEN];
        
        DatagramPacket datagram = new DatagramPacket(buffer, MAX_LEN);
        DatagramPacket datagram1 = new DatagramPacket(buffer1, MAX_LEN);
        DatagramPacket datagram2 = new DatagramPacket(buffer2, MAX_LEN);
        
        mySocket.receive(datagram);
        mySocket.receive(datagram1);
        mySocket.receive(datagram2);
        
        String message = new String(buffer);
        String message1 = new String(buffer1);
        String message2 = new String(buffer2);
        
        System.out.println(message);
        System.out.println(message1);
        System.out.println(message2);
        
        mySocket.close( ); 
      }
        
      
    
  } // end main
} // end class