package shahanshah;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import javax.swing.JFrame;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


public class PlaySound extends JFrame implements ActionListener,Runnable{
     static PlaySound f;
    JButton play,pause,stop,resume;
    Thread t;
    PlaySound(){
        play = new JButton("play");
        pause = new JButton("pause");
        stop = new JButton("stop");
        resume = new JButton("resume");

        play.setBounds(100 , 100, 100, 30);
        pause.setBounds(100, 200, 100, 30);
        stop.setBounds(100, 300, 100, 30);
        //resume.setBounds(100, 350, 100, 30);
        
        add(play);
        add(pause);
        add(stop);
        //add(resume);
        play.addActionListener(this);
        pause.addActionListener(this);
        stop.addActionListener(this);
       // resume.addActionListener(this);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        
    }
    
    public static void main(String[] args) throws JavaLayerException{
        
         f= new PlaySound();
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setBounds(100,100,600,600);
//        f.setTitle("audio");
        
        FileInputStream fis;
       
     @Override
         public void run() {
        
        
     try{
            fis = new FileInputStream("Surah Fatiha.mp3");System.out.println(fis);
            AdvancedPlayer player= new AdvancedPlayer(fis);
            
                    player.play();
        }catch(Exception ex){
           // JOptionPane.showMessageDialog(ex);
        }
    
    }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            t = new Thread();
            t.start();
            System.out.println("S");
        }else if(e.getSource()==pause){
            t.suspend();
            System.out.println("p");
        }else if(e.getSource()==stop){
            t.stop();
       }//else if(e.getSource()==resume){
//            
//        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
    
    
}
