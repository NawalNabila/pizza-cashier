
/**
 * Write a description of class Welcome here.
 * 
 * @author (Nawal Nabila) 
 * @version (17 Nov 2015)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Welcome
{
    private JFrame frame;
    private JOptionPane optionpane;
    
    ImageIcon background = new ImageIcon(getClass().getResource("kayu.jpg"));
    JLabel Background = new JLabel(background);
    
    JLabel kata = new JLabel(" Berbagi Bersama di Pizza Hut ");
    
    JLabel nama = new JLabel(" Design by Nawal Nabila ");
    
    JButton menu = new JButton(" M e n u ");
    
    JButton order = new JButton(" O r d e r ");
    
    JButton no = new JButton(" No, Thanks ");
    
    public Welcome(){
        makeFrame();
        frame.setVisible(true);
        Reaksi();
    }
    
    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }
    
    private void makeFrame(){
        frame = new JFrame("Hallo Guys");
        frame.setSize(650,500);
        komponenVisual();
    }
    
    private void komponenVisual(){
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);
        
        panel.add(kata);
        kata.setBounds(150,80,500,30);
        kata.setForeground(Color.black);
        kata.setFont(new Font("hot pizza", Font.BOLD,20));
        
        JLabel logo = new JLabel("");
        logo.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("logoo.png")));
        panel.add(logo); 
        logo.setBounds(200,130,250,150); 
        
        panel.add(nama);
        nama.setBounds(20,435,400,20);
        nama.setForeground(Color.white);
        nama.setFont(new Font("hot pizza", Font.BOLD,15));
        
        panel.add(menu);
        menu.setForeground(Color.white);
        menu.setBackground(Color.black);
        menu.setFont(new Font("hot pizza", Font.BOLD,12));
        menu.setBounds(70,300,120,40);
        
        panel.add(order);
        order.setForeground(Color.white);
        order.setBackground(Color.black);
        order.setFont(new Font("hot pizza", Font.BOLD,12));
        order.setBounds(260,300,120,40);
        
        panel.add(no);
        no.setForeground(Color.white);
        no.setBackground(Color.black);
        no.setFont(new Font("hot pizza", Font.BOLD,12));
        no.setBounds(440,300,120,40);
        
        panel.add(Background);
        Background.setBounds(0,0,654,475);
    }
    
    public void Reaksi(){
        menu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(true);
                Resto piza = new Resto();
            }
        });
        
        order.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(true);
                menu pizza = new menu();
            }
        });
        
        no.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
