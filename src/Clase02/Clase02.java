/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02;

import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class Clase02 {
    public static void main(String[] args) throws Exception {
////        class Alumno implements Runnable {
////            private String mensaje;
////            private int time;
////
////            public Alumno(String nombre, int time) {
////                this.mensaje = "hola soy " + nombre +" mensaje numero: ";
////                this.time =  time;
////            }
////            
////            @Override
////            public void run() {
////            
////                    for (int a = 1 ; a <= 20 ; a++){
////                        System.out.println(mensaje +" "+a);     
////                        try {
////                                Thread.sleep(time);
////                            } catch (InterruptedException ex) {
////                        }
////                    }
////            }
////        }// end class alumno
////        
////    Thread juan = new Thread(new Alumno("juan",100));
////    Thread luis = new Thread(new Alumno("luis",70));
////    Thread nora = new Thread(new Alumno("nora",50));
//        
//        //try {
////            juan.start();
////            
////            luis.start();
////            
////            nora.start();
////juan.join();
////luis.join();
////nora.join();
//            //Thread.sleep(5000);
////        } catch (Exception e) {
////            System.out.println(e);
////        }
////        System.out.println("final del programa");
////        class AccionX{
////            public void accion1() throws InterruptedException{
////                System.out.println("Pante 1");
////                System.out.println("Pante 2");
////                Thread.sleep(2000);
////                System.out.println("Pante 3");
////            }
////            public synchronized void accion2()throws InterruptedException{
////                System.out.println("Parte 1");
////                System.out.println("Parrte 2");
////                Thread.sleep(2000);
////                System.out.println("PaRte 3");            
////            }
////            public synchronized void accion3()throws InterruptedException{
////                System.out.println("PaRte 1");
////                synchronized(this){
////                    System.out.println("Parte 2");
////                    Thread.sleep(2000);
////                }
////
////                System.out.println("Parte 3");            
////            }
////        }    //accionx fin
////        
////        class RunnableX implements Runnable{
////            private AccionX accion;
////
////            public RunnableX(AccionX accion) {
////                this.accion = accion;
////            }
////
////            @Override
////            public void run() {
////            
////                try {
////                  //  accion.accion1();
////                    accion.accion3();
////                } catch (Exception ex) {
////                    System.out.println(ex);
////                }
////            }
////        
////        
////        }
////    AccionX accion = new AccionX();
////    new Thread(new RunnableX(accion)).start();
////    new Thread(new RunnableX(accion)).start();
//    
//    class Saludo{
//    
//            public synchronized void esperarJefe(String empleado){
//                try {
//                    wait();//esto frena el hilo de ejecucion
//                    System.out.println(empleado+" > buenos dias JEfe!!!");
//                    
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//  
//            }
//            public synchronized void saludoJefe(){
//                System.out.println("Jefe> Buenos dìas!!!");
//              //  notifyAll();
//              notifyAll();
//              dormir(2000);
//            } 
//
//            private void dormir(int time) {
//                try {
//                    Thread.sleep(time);
//                } catch (Exception e) {
//                    
//                }
//            } 
//    } // finsaludo
//        class Personal extends Thread{
//                private String nombre;
//                Saludo saludo;
//                boolean esJefe;
//                public Personal(String nombre, Saludo saludo, boolean esJefe) {
//                    this.nombre = nombre;
//                    this.saludo = saludo;
//                    this.esJefe = esJefe;
//                    }
//            public void run(){
//                System.out.println("("+nombre+" llega)");
//                if(esJefe) {saludo.saludoJefe();}
//                else{saludo.esperarJefe(nombre);}
//            }        
//        } // end personal
//    Saludo Hola = new Saludo();
//    Personal pablo = new Personal("pablo",Hola,false);
//    Personal pedro = new Personal("pedro",Hola,false);
//    Personal marcelo = new Personal("marcelo",Hola,false);
//    Personal pablo2 = new Personal("pablo2",Hola,true);
//    pablo.start();
//
//    
//    marcelo.start();
//    pablo2.start();
//    //Thread.sleep(2000);
//    pedro.start();

    InetAddress inet = InetAddress.getLocalHost();
        System.out.println(inet);

        //direccion  ip de google
        
        System.out.println(InetAddress.getByName("www.google.com.ar"));
        System.out.println(InetAddress.getByName("instructor-806"));
        //System.out.println(InetAddress.getByName("152.100.73.355"));
        
        System.out.println(inet.getHostName());
        System.out.println(InetAddress.getByName("192.168.73.20").getHostName());


/*  server                          Cliente
    --------------                  ----------    
ServerSocket(port#, timeOut)        
acept()                             Socket(Host,port#)
OutPutStream         ---->          InputStream
InputStream         <-----          OutPutStream    
 --------------                  ----------           
     close()                    close()
        
     OutPutSStream Caracteres de texto
        PrtintStream BUffer de texto
        
        DataInpoutSream TipoDe datos primitivos
        ObjectInputStream --- ObjectOutputStream    Transmiten objetos
        
*/                
    }

}    
    
    

