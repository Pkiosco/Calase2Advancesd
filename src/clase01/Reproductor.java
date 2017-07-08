/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author educacionit
 */
public class Reproductor implements Runnable {
    public static void main(String[] args) {
        try {
//            FileInputStream fis = new  FileInputStream("res/La llave.mp3");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            Player player = new Player(fis);
//            player.play();
            new Player(new BufferedInputStream(
                        new FileInputStream("res/La llave.mp3")
                       )

            ).play();
        } catch (Exception e) {
        }
                
    }

    @Override
    public void run() {
        try {
//            FileInputStream fis = new  FileInputStream("res/La llave.mp3");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            Player player = new Player(fis);
//            player.play();
        new Player(new BufferedInputStream(
                    new FileInputStream("res/La llave.mp3")
                   )
        
        ).play();
        } catch (Exception e) {
        }
    }
}
