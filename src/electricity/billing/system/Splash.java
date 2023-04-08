/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;

//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
import java.awt.Image;
import javax.swing.*;


public class Splash extends JFrame implements Runnable {
    Thread t;
    Splash(){
        
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2=i1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        t= new Thread(this);
        t.start();
        
        setVisible(true);
        
        int x=1;
        for(int i=2;i<600;i+=4, x+=1){
        setSize(i+x,i);
        setLocation(700-((i+x)/2),400-(i/2));
        
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
        
        
    }
    
    public static void main(String[] s){
        new Splash();
        
    }

    @Override
    public void run() {
        try{
            Thread.sleep(7000);
            setVisible(false);
        }
        catch(Exception e){
            
            e.printStackTrace();
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
