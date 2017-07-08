package clase01;

public class Clase01 {

    public static void main(String[] args) throws Exception {
        /*
        Curso: Java Advanced 15 horas
        Profe: Carlos Ríos  carlos.rios@educacionit.com
        */
//        int suma=0;
//        for(int a=1;a<=1000000000;a++){
//            suma+=a;
//        }
//        System.out.println(suma);
//        for(int a=1;a<=1000000;a++){
//            System.out.println(a);
//        }

        // Cantidad de nucleos del procesador
        System.out.println("Nucleos: "+Runtime.getRuntime().availableProcessors());
        
        //Clase Interna
        class Hilo extends Thread{
            
            private String descripcion;

            public Hilo(String descripcion) {
                this.descripcion = descripcion;
            }
            
            @Override
            public void run(){
                // Este método ejecuta en un hilo distinto
                for(int a=1;a<=10;a++){
                    System.out.println(descripcion+":"+a);
                    dormir(500);
                    //this.yield();
                    //System.out.println("--"+this.getState());
                }
            }           

            private void dormir(int ms) {
                try {
                    Thread.sleep(ms);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }// end class
        
        Hilo hilo1=new Hilo("hilo 1");
        Hilo hilo2=new Hilo("hilo 2");
        
        System.out.println(hilo1.getClass().getName());
        
        System.out.println(hilo1.getState());
        System.out.println(hilo1.isAlive());
        
        /*
            Ciclo de vida de un hilo
        
            NEW     RUNNABLE    BLOCKED                 TERMINATED
                    .start()    TIME_WAITING .sleep()   Muerte Natural
                                WAITING      .wait()    Asesinato .stop
                                I/O
        */
        
        hilo1.setPriority(Thread.MAX_PRIORITY);
        hilo2.setPriority(Thread.MIN_PRIORITY);
        hilo1.setPriority(2);
        
        
        // El método start invoca a run en un hilo a parte
        hilo1.start();
        hilo2.start();
        //hilo1.start(); //no se puede startear dos veces un hilo
        if(!hilo1.isAlive()) hilo1.start();
        // El método no ejecuta en un hilo a parte
        //hilo1.run();
        //hilo2.run();
        
        new Hilo("hilo 3").start();
        
        System.out.println(hilo1.getState());
        System.out.println(hilo1.isAlive());
        
        System.out.println("-- Fin del programa. --");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.err.println("Ocurrio un error!");
        
        Thread.sleep(1000);
        
        System.out.println(hilo1.getState());
        System.out.println(hilo1.isAlive());
        
        
    }//end main
    
}//end class
