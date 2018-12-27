package guipackage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class RandomGen extends JFrame{
  
  public JButton stop;
  
  public RandomGen() {
    FlowLayout flo = new FlowLayout();
    JButton stop = new JButton("Stop");
    stop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        stop();
      }
    });
    setTitle("Random Generator");
    setSize(200,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLookAndFeel();
    setLayout(flo);
    add(stop);
  }
  
  public static void main(String[] args) {
    
    Random generator = new Random();
    
    RandomGen frame = new RandomGen();
    frame.setVisible(true);
    
    while (true) {
      System.out.println(generator.nextInt());
    }
    
  }
  
  public void stop() {
    
    System.exit(0);
    
  }
  
  public void setLookAndFeel() {
    try {
      UIManager.setLookAndFeel("com.sun.java.plaf.nimbus.NimbusLookAndFeel");
    } catch(Exception exc) {
      //do nothing
    }
  }
}
