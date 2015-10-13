/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author javier
 */
public class Servidor { 
    
    
    public static void main(String[] args) throws SocketException, IOException {
    
      int port = 6666;
      final int MAX_LEN = 100;
      while(true)
      {
        DatagramSocket  mySocket = new DatagramSocket(port);
        
//        Armamos buffers de entrada 
        byte[ ] buffpaterno = new byte[MAX_LEN];
        byte[ ] buffmaterno = new byte[MAX_LEN];
        byte[ ] buffnombre = new byte[MAX_LEN];
        byte[ ] buffnacimiento = new byte[MAX_LEN];
        byte[ ] bufflugar = new byte[MAX_LEN];
        byte[ ] buffsexo = new byte[MAX_LEN];
        
//        cramos el paquete
        DatagramPacket paterno = new DatagramPacket(buffpaterno, MAX_LEN);
        DatagramPacket materno = new DatagramPacket(buffmaterno, MAX_LEN);
        DatagramPacket nombre = new DatagramPacket(buffnombre, MAX_LEN);
        DatagramPacket nacimiento = new DatagramPacket(buffnacimiento, MAX_LEN);
        DatagramPacket lugar = new DatagramPacket(bufflugar, MAX_LEN);
        DatagramPacket sexo = new DatagramPacket(buffsexo, MAX_LEN);
        
//        Recibimos el paquete
        mySocket.receive(paterno);
        mySocket.receive(materno);
        mySocket.receive(nombre);
        mySocket.receive(nacimiento);
        mySocket.receive(lugar);
        mySocket.receive(sexo);
        
//        Lo convertimos a cadena
        String mPaterno = new String(buffpaterno);
        String mMaterno = new String(buffmaterno);
        String mNombre = new String(buffnombre);
        String mNacimiento = new String(buffnacimiento);
        String mLugar = new String(bufflugar);
        String mSexo = new String(buffsexo);
        
        System.out.println(mPaterno);
        System.out.println(mMaterno);
        System.out.println(mNombre);
        System.out.println(mNacimiento);
        System.out.println(mLugar);
        System.out.println(mSexo);
        
        
        mySocket.close( ); 
      }
        
      
    
  } // end main
    
}
