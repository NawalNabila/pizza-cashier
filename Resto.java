/**
 * Write a description of class Resto here.
 * 
 * @author Nawal Nabila 
 * @version 28 Okt 2015
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

 public class Resto {
     private JFrame frame;
     private JOptionPane optionPane;
     
     ImageIcon back = new ImageIcon(getClass().getResource("bg.jpg"));
     JLabel gambarBackground = new JLabel(back);
     
     JLabel welcome = new JLabel("Pizza Hut");
     
     JLabel word = new JLabel("Berbagi Bersama ");
     
     JLabel nama = new JLabel("Design by Nawal Nabila");
    
     JLabel food = new JLabel("P I Z Z A");
     
     JLabel food1 =new JLabel("Dabu-dabu");
     JLabel harga1 = new JLabel("Rp 128.000");
     
     JLabel food2 =new JLabel("Hawaiian Chicken");
     JLabel harga2 = new JLabel("Rp 130.000");
     
     JLabel food3 =new JLabel("Super Supreme");
     JLabel harga3 = new JLabel("Rp 139.000");
     
     JLabel food4 =new JLabel("Tuna Melt");
     JLabel harga4 = new JLabel("Rp 150.000");
     
     JLabel food5 =new JLabel("Black Pepper Chicken");
     JLabel harga5 = new JLabel("Rp 128.000");
     
     JLabel drink = new JLabel("D R I N K S");
     JTextField txfdrink = new JTextField(100);
     
     JLabel drink1 =new JLabel("Blue Ocean");
     JLabel price1 = new JLabel("Rp 29.800");
     
     JLabel drink2 =new JLabel("Favourite Float");
     JLabel price2 = new JLabel("Rp 29.800"); 
     
     JLabel drink3 =new JLabel("Green Tea Shake");
     JLabel price3 = new JLabel("Rp 34.900");
     
     JLabel drink4 =new JLabel("Green Tea Yakult");
     JLabel price4 = new JLabel("Rp 34.900");
     
     JLabel drink5 =new JLabel("Italian Green Soda");
     JLabel price5 = new JLabel("Rp 32.800");
     
     JLabel junk = new JLabel("D E S S E R T");
     JTextField txjunk = new JTextField(100);
     
     JLabel junk1 =new JLabel("Hot Bread Pudding");
     JLabel hrga1 = new JLabel("Rp 38.000");
     
     JLabel junk2 =new JLabel("Happy Melody");
     JLabel hrga2 = new JLabel("Rp 39.900");
     
     JLabel junk3 =new JLabel("Banana Split");
     JLabel hrga3 = new JLabel("Rp 39.900");
     
     JLabel junk4 =new JLabel("Vanilla Oreo");
     JLabel hrga4 = new JLabel("Rp 25.000");
     
     JLabel junk5 =new JLabel("Chocolate Star");
     JLabel hrga5 = new JLabel("Rp 25.000");
     
     JButton pesan = new JButton("Order");
     JButton close = new JButton("No, Thanks");
     
     public Resto() {
         makeFrame();
         frame.setVisible(true);
         Reaksi();
        }
        
     public void setVisible(boolean visible) {
        frame.setVisible(visible);
     }
        
     private void makeFrame(){
        frame = new JFrame("Welcome to Pizza Hut");
        frame.setSize(1000,730);
        komponenVisual();
        //method pack pada frame berguna utk menampilkan frame dan menset ukuran sesuai preferredSize komponen
        //frame.pack();
     }
    
     private void komponenVisual(){
       JPanel panel = (JPanel)frame.getContentPane();
       panel.setLayout(null);
       
        panel.add(welcome);
        welcome.setBounds(380,35,300,40);
        welcome.setForeground(Color.red);
        welcome.setFont(new Font("hot pizza", Font.BOLD,35));
        
        panel.add(word);
        word.setBounds(680,70,500,30);
        word.setForeground(Color.red);
        word.setFont(new Font("hot pizza", Font.BOLD,20));
        
        panel.add(nama);
        nama.setBounds(20,650,400,30);
        nama.setForeground(Color.white);
        nama.setFont(new Font("hot pizza", Font.BOLD,20));
        
        panel.add(food);
        food.setBounds(10,120,100,20);
        food.setForeground(Color.red);
        food.setFont(new Font("kristen itc", Font.BOLD,15));
        
        JLabel FTfood1 = new JLabel("");
        FTfood1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("dabu.jpg")));
        panel.add(FTfood1); FTfood1.setBounds(40,150,90,90);
        panel.add(food1);   food1.setBounds(43,245,150,20); 
        food1.setForeground(Color.black);
        food1.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(harga1);  harga1.setBounds(40,260,150,20);
        harga1.setForeground(Color.black);
        harga1.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTfood2 = new JLabel("");
        FTfood2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("hawai.jpg")));
        panel.add(FTfood2); FTfood2.setBounds(240,150,90,90);
        panel.add(food2);   food2.setBounds(220,245,150,20);
        food2.setForeground(Color.black);
        food2.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(harga2);  harga2.setBounds(240,260,150,20);
        harga2.setForeground(Color.black);
        harga2.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTfood3 = new JLabel("");
        FTfood3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("super.jpg")));
        panel.add(FTfood3); FTfood3.setBounds(440,150,90,90);
        panel.add(food3);   food3.setBounds(425,245,150,20); 
        food3.setForeground(Color.black);
        food3.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(harga3);  harga3.setBounds(440,260,150,20);
        harga3.setForeground(Color.black);
        harga3.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTfood4 = new JLabel("");
        FTfood4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("tuna.jpg")));
        panel.add(FTfood4); FTfood4.setBounds(635,150,90,90);
        panel.add(food4);   food4.setBounds(640,245,150,20); 
        food4.setForeground(Color.black);
        food4.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(harga4);  harga4.setBounds(635,260,150,20);
        harga4.setForeground(Color.black);
        harga4.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTfood5 = new JLabel("");
        FTfood5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("blackpp.jpg")));
        panel.add(FTfood5); FTfood5.setBounds(820,150,90,90);
        panel.add(food5);   food5.setBounds(790,245,190,20);
        food5.setForeground(Color.black);
        food5.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(harga5);  harga5.setBounds(820,260,150,20);
        harga5.setForeground(Color.black);
        harga5.setFont(new Font("papyrus", Font.BOLD,15));
        
        panel.add(drink);
        drink.setBounds(10,290,200,20);
        drink.setForeground(Color.red);
        drink.setFont(new Font("kristen itc", Font.BOLD,15));
        
        JLabel FTdrink1 = new JLabel("");
        FTdrink1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("ocean.jpg")));
        panel.add(FTdrink1); FTdrink1.setBounds(40,320,90,90);
        panel.add(drink1);   drink1.setBounds(38,415,150,20); 
        drink1.setForeground(Color.black);
        drink1.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(price1);   price1.setBounds(42,430,150,20);
        price1.setForeground(Color.black);
        price1.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTdrink2 = new JLabel("");
        FTdrink2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("ffloat.jpg")));
        panel.add(FTdrink2); FTdrink2.setBounds(240,320,90,90);
        panel.add(drink2);   drink2.setBounds(227,415,150,20);
        drink2.setForeground(Color.black);
        drink2.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(price2);   price2.setBounds(242,430,150,20);
        price2.setForeground(Color.black);
        price2.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTdrink3 = new JLabel("");
        FTdrink3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("gtshake.jpg")));
        panel.add(FTdrink3); FTdrink3.setBounds(440,320,90,90);
        panel.add(drink3);   drink3.setBounds(415,415,150,20); 
        drink3.setForeground(Color.black);
        drink3.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(price3);   price3.setBounds(442,430,150,20);
        price3.setForeground(Color.black);
        price3.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTdrink4 = new JLabel("");
        FTdrink4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("gtyakult.jpg")));
        panel.add(FTdrink4); FTdrink4.setBounds(635,320,90,90);
        panel.add(drink4);   drink4.setBounds(615,415,150,20);
        drink4.setForeground(Color.black);
        drink4.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(price4);   price4.setBounds(637,430,150,20);
        price4.setForeground(Color.black);
        price4.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTdrink5 = new JLabel("");
        FTdrink5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("italian.jpg")));
        panel.add(FTdrink5); FTdrink5.setBounds(820,320,90,90);
        panel.add(drink5);   drink5.setBounds(795,415,150,20);
        drink5.setForeground(Color.black);
        drink5.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(price5);   price5.setBounds(822,430,150,20);
        price5.setForeground(Color.black);
        price5.setFont(new Font("papyrus", Font.BOLD,15));
        
        panel.add(junk);
        junk.setBounds(10,458,200,20);
        junk.setForeground(Color.red);
        junk.setFont(new Font("kristen itc", Font.BOLD,15));
        
        JLabel FTjunk1 = new JLabel("");
        FTjunk1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("bread.jpg")));
        panel.add(FTjunk1); FTjunk1.setBounds(40,488,90,70);
        panel.add(junk1);   junk1.setBounds(15,563,150,20); 
        junk1.setForeground(Color.black);
        junk1.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(hrga1);   hrga1.setBounds(42,578,150,20);
        hrga1.setForeground(Color.black);
        hrga1.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTjunk2 = new JLabel("");
        FTjunk2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("happy.jpg")));
        panel.add(FTjunk2); FTjunk2.setBounds(240,488,90,70);
        panel.add(junk2);   junk2.setBounds(230,563,150,20);
        junk2.setForeground(Color.black);
        junk2.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(hrga2);   hrga2.setBounds(242,578,150,20);
        hrga2.setForeground(Color.black);
        hrga2.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTjunk3 = new JLabel("");
        FTjunk3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("bnna.jpg")));
        panel.add(FTjunk3); FTjunk3.setBounds(440,488,90,70);
        panel.add(junk3);   junk3.setBounds(430,563,150,20);
        junk3.setForeground(Color.black);
        junk3.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(hrga3);   hrga3.setBounds(442,578,150,20);
        hrga3.setForeground(Color.black);
        hrga3.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTjunk4 = new JLabel("");
        FTjunk4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("oreo.jpg")));
        panel.add(FTjunk4); FTjunk4.setBounds(635,488,90,70);
        panel.add(junk4);   junk4.setBounds(625,563,150,20);
        junk4.setForeground(Color.black);
        junk4.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(hrga4);   hrga4.setBounds(638,578,150,20);
        hrga4.setForeground(Color.black);
        hrga4.setFont(new Font("papyrus", Font.BOLD,15));
        
        JLabel FTjunk5 = new JLabel("");
        FTjunk5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage("star.jpg")));
        panel.add(FTjunk5); FTjunk5.setBounds(820,488,90,70);
        panel.add(junk5);   junk5.setBounds(810,563,150,20);
        junk5.setForeground(Color.black);
        junk5.setFont(new Font("papyrus", Font.BOLD,15));
        panel.add(hrga5);   hrga5.setBounds(822,578,150,20);
        hrga5.setForeground(Color.black);
        hrga5.setFont(new Font("papyrus", Font.BOLD,15));
             
       
        panel.add(pesan);
        pesan.setBounds(750,630,100,25);
        pesan.setBackground(Color.pink);
        pesan.setForeground(Color.black);
        pesan.setFont(new Font("hot pizza", Font.BOLD,10));
        
        panel.add(close);
        close.setBounds(870,630,100,25);
        close.setBackground(Color.pink);
        close.setForeground(Color.black);
        close.setFont(new Font("hot pizza", Font.BOLD,10));
           
        panel.add(gambarBackground);
        gambarBackground.setBounds(0,0,997,730); 
     }
    
    /**
     * Method utk melakukan tindakan jika ada event dari pengguna
     * terhadap event source
     * 
     */
    public void Reaksi()
    {
        pesan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(true);
                menu pizza = new menu();
            }
        });
        
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
            }
        });
    }
    
}
    
        
     

