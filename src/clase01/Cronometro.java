package clase01;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cronometro implements Runnable{
    private JTextField swText=null;
    private JLabel swLabel=null;
    private TextField fxText=null;
    private Label fxLabel=null;
    
    private boolean correr=false;
    private int tiempo=0;

    public Cronometro(JTextField swText) {
        this.swText = swText;
    }
    public Cronometro(JLabel swLabel) {
        this.swLabel = swLabel;
    }
    public Cronometro(TextField fxText) {
        this.fxText = fxText;
    }
    public Cronometro(Label fxLabel) {
        this.fxLabel = fxLabel;
    }
    public void setText(String text){
        if(swText!=null) swText.setText(text);
        if(swLabel!=null) swLabel.setText(text);
        if(fxText!=null) fxText.setText(text);
        if(fxLabel!=null) fxLabel.setText(text);
    }
    
    
    @Override
    public void run() {
        while(true){
            if(correr) setText((++tiempo)+"");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void start(){
        correr=true;
    }
    public void pause(){
        correr=false;
    }
    public void reset(){
        tiempo=0;
        setText(tiempo+"");
    }
}
