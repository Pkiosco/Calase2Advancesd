/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMinimo {
    public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(5000);   
    String mensaje = "Hola Soy Ezequiel";
    
        while(true){
            System.out.println("Esperando conexion de un cliente");
            Socket so = ss.accept();
            System.out.println("Se conecto cliente : " +so.getInetAddress());
            OutputStream out = so.getOutputStream();
            out.write(mensaje.getBytes());
            so.close();
            System.out.println("La conexion esta cerrada");
        }
    }//Fin MAIN 
}//Fin Minimo
