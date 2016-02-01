/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlab1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Random;

/**
 *
 * @author Chris & Yooju
 */
public class Frame extends JFrame {
    Frame(){
        Random rand=new Random();
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension d=tk.getScreenSize();
        setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        setTitle("QLab_1");
        int random1=rand.nextInt(d.width);
        int random2=rand.nextInt(d.height);
        int random3=rand.nextInt(d.width);
        int random4=rand.nextInt(d.height);
        setSize(random1,random2);
        setLocation(random3,random4);
        
        JLabel label = new JLabel(" Soft Engineering");
        if(random1/8 <= (2*random2)/3){
            label.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, random1/8));
            label.setForeground(Color.red);
        }else{
            label.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, (2*random2)/3));
            label.setForeground(Color.red);
        }
        getContentPane().add(label);
    }
    
     public static void main(String[] args){
        JFrame f = new Frame();
        f.setVisible(true);
    }
    
}
