
/**
 * Write a description of class menu here.
 * 
 * @author (Nawal Nabila) 
 * @version (28 Okt 2015)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class menu{
    private JFrame frame;
    private JOptionPane optionPane;

    ImageIcon back = new ImageIcon(getClass().getResource("papan.JPG"));
    JLabel gambarBackground = new JLabel(back);

    JButton hitung = new JButton ("HITUNG");
    JTextField txhitung = new JTextField();
    JButton bayar = new JButton ("BAYAR");
    JTextField txbayar = new JTextField();
    JButton kembali = new JButton ("KEMBALIAN");
    JTextField txkembali = new JTextField();
    JButton reset = new JButton ("RESET");
    JButton close = new JButton("BACK");
    
    JLabel daftar = new JLabel("DAFTAR  PESANAN  PIZZA  HUT");
    
    JLabel food = new JLabel("PIZZA");

    JLabel food1 = new JLabel("Dabu-dabu");
    JTextField txfood1 = new JTextField("0");

    JLabel food2 = new JLabel("Hawaiian Chicken");
    JTextField txfood2 = new JTextField("0");

    JLabel food3 = new JLabel("Super Supreme");
    JTextField txfood3 = new JTextField("0");

    JLabel food4 = new JLabel("Tuna Melt");
    JTextField txfood4 = new JTextField("0");

    JLabel food5 = new JLabel("Black Pepper Chicken");
    JTextField txfood5 = new JTextField("0");

    JLabel drink=new JLabel ("DRINKS");

    JLabel drink1 = new JLabel ("Blue Ocean");
    JTextField txdrink1 =new JTextField("0");

    JLabel drink2 = new JLabel ("Favourite Float");
    JTextField txdrink2 = new JTextField("0");

    JLabel drink3 = new JLabel ("Green Tea Shake");
    JTextField txdrink3 = new JTextField("0");

    JLabel drink4 = new JLabel ("Green Tea Yakult");
    JTextField txdrink4 = new JTextField("0");

    JLabel drink5 = new JLabel ("Italian Green Soda");
    JTextField txdrink5 = new JTextField("0");

    JLabel junk = new JLabel ("DESSERT");

    JLabel junk1 = new JLabel ("Hot Bread Pudding");
    JTextField txjunk1 = new JTextField("0");

    JLabel junk2 = new JLabel ("Happy Melody");
    JTextField txjunk2 = new JTextField("0");

    JLabel junk3 = new JLabel ("Banana Split");
    JTextField txjunk3 = new JTextField("0");
    
    JLabel junk4 = new JLabel ("Vanilla Oreo");
    JTextField txjunk4 = new JTextField("0");
    
    JLabel junk5 = new JLabel ("Chocolate Star");
    JTextField txjunk5 = new JTextField("0");

    public menu(){
        makeFrame();
        frame.setVisible(true);
        Reaksi();

    }

    public void setVisible(boolean visible){

        frame.setVisible(visible);

    }

    private void makeFrame(){
        frame = new JFrame ("Daftar Pesanan");
        frame.setSize(750, 630);
        KomponenVisual();
    }
        
    public void KomponenVisual(){

        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout (null);

        panel.add(daftar);
        daftar.setBounds(145,26,500,25);
        daftar.setForeground(Color.white);
        daftar.setFont(new Font("Chalk Line Outline", Font.BOLD,20));

        panel.add(food);
        food.setBounds(10,90,100,30);
        food.setForeground(Color.white);
        food.setFont(new Font("Chalk Line Outline", Font.BOLD,20));

        panel.add(food1);
        food1.setBounds(10,130,200,30);
        food1.setForeground(Color.white);
        food1.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txfood1);
        txfood1.setBounds(190,130,30,20);

        panel.add(food2);
        food2.setBounds(10,160,200,30);
        food2.setForeground(Color.white);
        food2.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txfood2);
        txfood2.setBounds(190,160,30,20);

        panel.add(food3);
        food3.setBounds(10,190,200,30);
        food3.setForeground(Color.white);
        food3.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txfood3);
        txfood3.setBounds(190,190,30,20);

        panel.add(food4);
        food4.setBounds(10,220,200,30);
        food4.setForeground(Color.white);
        food4.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txfood4);
        txfood4.setBounds(190,220,30,20);

        panel.add(food5);
        food5.setBounds(10,250,200,30);
        food5.setForeground(Color.white);
        food5.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txfood5);
        txfood5.setBounds(190,250,30,20);

        panel.add(drink);
        drink.setBounds(260,90,200,30);
        drink.setForeground(Color.white);
        drink.setFont(new Font("Chalk Line Outline", Font.BOLD,20));

        panel.add(drink1);
        drink1.setBounds(260,130,200,30);
        drink1.setForeground(Color.white);
        drink1.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txdrink1);
        txdrink1.setBounds(425,130,30,20);

        panel.add(drink2);
        drink2.setBounds(260,160,200,30);
        drink2.setForeground(Color.white);
        drink2.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txdrink2);
        txdrink2.setBounds(425,160,30,20);

        panel.add(drink3);
        drink3.setBounds(260,190,200,30);
        drink3.setForeground(Color.white);
        drink3.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txdrink3);
        txdrink3.setBounds(425,190,30,20);

        panel.add(drink4);
        drink4.setBounds(260,220,200,30);
        drink4.setForeground(Color.white);
        drink4.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txdrink4);
        txdrink4.setBounds(425,220,30,20);

        panel.add(drink5);
        drink5.setBounds(260,250,200,30);
        drink5.setForeground(Color.white);
        drink5.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txdrink5);
        txdrink5.setBounds(425,250,30,20);

        panel.add(junk);
        junk.setBounds(495,90,200,30);
        junk.setForeground(Color.white);
        junk.setFont(new Font("Chalk Line Outline", Font.BOLD,20));

        panel.add(junk1);
        junk1.setBounds(495,130,200,30);
        junk1.setForeground(Color.white);
        junk1.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txjunk1);
        txjunk1.setBounds(660,130,30,20);

        panel.add(junk2);
        junk2.setBounds(495,160,200,30);
        junk2.setForeground(Color.white);
        junk2.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txjunk2);
        txjunk2.setBounds(660,160,30,20);

        panel.add(junk3);
        junk3.setBounds(495,190,200,30);
        junk3.setForeground(Color.white);
        junk3.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txjunk3);
        txjunk3.setBounds(660,190,30,20);
        
        panel.add(junk4);
        junk4.setBounds(495,220,200,30);
        junk4.setForeground(Color.white);
        junk4.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txjunk4);
        txjunk4.setBounds(660,220,30,20);
        
        panel.add(junk5);
        junk5.setBounds(495,250,200,30);
        junk5.setForeground(Color.white);
        junk5.setFont(new Font("DK Crayon Crumble", Font.BOLD,20));
        panel.add(txjunk5);
        txjunk5.setBounds(660,250,30,20);

        JPanel pane = (JPanel)frame.getContentPane();
        panel.setLayout(null); 

        panel.add(hitung);
        hitung.setForeground(Color.black);
        hitung.setFont(new Font("pwchalk", Font.BOLD,15));
        hitung.setBounds(30,325,150,30);
        panel.add(txhitung);
        txhitung.setBounds(230,325,150,30);

        panel.add(bayar);
        bayar.setForeground(Color.black);
        bayar.setFont(new Font("pwchalk", Font.BOLD,15));
        bayar.setBounds(30,375,150,30);
        panel.add(txbayar);
        txbayar.setBounds(230,375,150,30);

        panel.add(kembali);
        kembali.setForeground(Color.black);
        kembali.setFont(new Font("pwchalk", Font.BOLD,15));
        kembali.setBounds(30,425,150,30);
        panel.add(txkembali);
        txkembali.setBounds(230,425,150,30);
        
        panel.add(reset);
        reset.setForeground(Color.black);
        reset.setFont(new Font("pwchalk", Font.BOLD,15));
        reset.setBounds(410,520,100,30);
        
        panel.add(close);
        close.setForeground(Color.black);
        close.setFont(new Font("pwchalk", Font.BOLD,15));
        close.setBounds(560,520,100,30);
        
        panel.add(gambarBackground);
        gambarBackground.setBounds(0,0,800,600);

    }

    public void Reaksi (){
        hitung.addActionListener (new ActionListener(){
                public void actionPerformed(ActionEvent e){

                    String f1=txfood1.getText();
                    int fd1=(Integer.parseInt(f1))*128000;

                    String f2=txfood2.getText();
                    int fd2=(Integer.parseInt(f2))*130000;

                    String f3=txfood3.getText();
                    int fd3=(Integer.parseInt(f3))*139000;

                    String f4=txfood4.getText();
                    int fd4=(Integer.parseInt(f4))*150000;

                    String f5=txfood5.getText();
                    int fd5=(Integer.parseInt(f5))*128000;

                    String d1=txdrink1.getText();
                    int dr1=(Integer.parseInt(d1))*29800;

                    String d2 =txdrink2.getText();
                    int dr2=(Integer.parseInt(d2))*29800;

                    String d3=txdrink3.getText();
                    int dr3=(Integer.parseInt(d3))*34900;

                    String d4=txdrink4.getText();
                    int dr4=(Integer.parseInt(d4))*34900;

                    String d5=txdrink5.getText();
                    int dr5=(Integer.parseInt(d5))*32800;

                    String j1=txjunk1.getText();
                    int jk1=(Integer.parseInt(j1))*38000;

                    String j2=txjunk2.getText();
                    int jk2=(Integer.parseInt(j2))*39900;

                    String j3=txjunk3.getText();
                    int jk3=(Integer.parseInt(j3))*39900;
                    
                    String j4=txjunk4.getText();
                    int jk4=(Integer.parseInt(j4))*25000;
                    
                    String j5=txjunk5.getText();
                    int jk5=(Integer.parseInt(j5))*25000;

                    int jumlah = fd1+fd2+fd3+fd4+fd5+dr1+dr2+dr3+dr4+dr5+jk1+jk2+jk3+jk4+jk5;
                    txhitung.setText(""+jumlah);

                }
            });
        reset.addActionListener (new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    txfood1.setText("0");
                    txfood2.setText("0");
                    txfood3.setText("0");
                    txfood4.setText("0");
                    txfood5.setText("0");
                    txdrink1.setText("0");
                    txdrink2.setText("0");
                    txdrink3.setText("0");
                    txdrink4.setText("0");
                    txdrink5.setText("0");
                    txjunk1.setText("0");
                    txjunk2.setText("0");
                    txjunk3.setText("0");
     
                    txhitung.setText("");
                    txbayar.setText("");
                    txkembali.setText("");

                }

            });

        //Aksi Button kembalian
        kembali.addActionListener (new ActionListener(){
                public void actionPerformed(ActionEvent e){
                     long hitungan;
                     long bayaran;
                    try{
                        bayaran  = Long.parseLong(txbayar.getText());
                    }
                    catch(NumberFormatException error)
                    {
                        bayaran=0;
                        txbayar.setText(""+bayaran);
                    }
                    try{
                        hitungan  = Long.parseLong(txhitung.getText());
                    }
                    catch(NumberFormatException error)
                    {
                        hitungan= 0;
                        txhitung.setText(""+hitungan);
                    }
                    
                    if(bayaran >= hitungan)
                    {
                        bayaran -= hitungan ;
                        txkembali.setText(""+bayaran);
                    }
                    else
                    {
                        txkembali.setText("ERROR");
                    }
                }
            });
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
            }
        });
            
    }
}

