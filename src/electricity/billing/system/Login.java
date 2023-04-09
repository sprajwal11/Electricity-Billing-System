/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electricity.billing.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Asus
 */
public class Login extends JFrame{
    
    Login(){
        
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel lblUserName=new JLabel("Username");
        lblUserName.setBounds(300,20,100,20);
        add(lblUserName);

        JTextField username=new JTextField();
        username.setBounds(400,20,150,20);
        add(username);

        JLabel lblPassword=new JLabel("Password");
        lblPassword.setBounds(300,60,100,20);
        add(lblPassword);

        JTextField password=new JTextField();
        password.setBounds(400,60,150,20);
        add(password);

        JLabel lblLoginAs=new JLabel("Login as");
        lblLoginAs.setBounds(300,100,100,20);
        add(lblLoginAs);

        Choice loginIn=new Choice();
        loginIn.add("Admin");
        loginIn.add("Consumer");
        loginIn.setBounds(400,100,150,20);
        add(loginIn);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2=i1.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        JButton login=new JButton("Login",new ImageIcon(i2));
        login.setBounds(330,160,100,20);
        add(login);

        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i4=i3.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        JButton cancel=new JButton("Cancel",new ImageIcon(i4));
        cancel.setBounds(450,160,100,20);
        add(cancel);


        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6=i5.getImage().getScaledInstance(16,16,Image.SCALE_DEFAULT);
        JButton signUp=new JButton("Sign Up",new ImageIcon(i6));
        signUp.setBounds(380,200,100,20);
        add(signUp);


        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8=i7.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image=new JLabel(i9);
        image.setBounds(0,0,250,250);
        add(image);


        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    
    public static void main(String[] s){

        new Login();
    }
    
}
