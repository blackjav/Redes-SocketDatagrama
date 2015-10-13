/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author javier
 */
public class ClienteSend {
    
     public void enviar(String paterno, String materno,String nombre, String nacimiento,String lugar,String sexo) throws UnknownHostException, SocketException, IOException {
        

        InetAddress receiverHost = InetAddress.getByName("127.0.0.1");
        int receiverPort = 6666;
       
        DatagramSocket  mySocket = new DatagramSocket();
        
        byte[ ] buffpaterno =paterno.getBytes();
        byte[ ] buffmaterno = materno.getBytes();
        byte[ ] buffnombre = nombre.getBytes();
        byte[ ] buffnacimiento = nacimiento.getBytes();
        byte[ ] bufflugar = lugar.getBytes();
        byte[ ] buffsexo =sexo.getBytes();
        
        DatagramPacket dPaterno = new DatagramPacket(buffpaterno, buffpaterno.length,receiverHost, receiverPort);
        DatagramPacket dMaterno = new DatagramPacket(buffmaterno, buffmaterno.length,receiverHost, receiverPort);
        DatagramPacket dNombre = new DatagramPacket(buffnombre, buffnombre.length,receiverHost, receiverPort);
        DatagramPacket dNacimiento = new DatagramPacket(buffnacimiento, buffnacimiento.length,receiverHost, receiverPort);
        DatagramPacket dlugar = new DatagramPacket(bufflugar, bufflugar.length,receiverHost, receiverPort);
        DatagramPacket dFecha = new DatagramPacket(buffsexo, buffsexo.length,receiverHost, receiverPort);
        
        mySocket.send(dPaterno);
        mySocket.send(dMaterno);
        mySocket.send(dNombre);
        mySocket.send(dNacimiento);
        mySocket.send(dlugar);
        mySocket.send(dFecha);
        
        mySocket.close( );
            
        
  } // end main
    
}
