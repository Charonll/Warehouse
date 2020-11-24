

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_A=new JLabel();
    JLabel label_B=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();


    //构造方法
    public App() {
        textArea_A .addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_UP){

                    label_A.setBounds(-30,0,100,100);
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){

                    label_A.setBounds(+30,0,100,100);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        /*textArea_A.setBounds(100,100,300,150);
        textArea_A.setBackground(Color.green);
        textArea_B.setBounds(100,300,300,150);
        textArea_B.setBackground(Color.lightGray);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);*/

        java.net.URL imgURL=App.class.getResource("plane1.png");
        label_A.setIcon(new ImageIcon("src/plane1.png"));
        label_A.setBounds(100,500,128,128);
        java.net.URL imgURL1=App.class.getResource("background.png");
        label_B.setIcon(new ImageIcon("src/background.png"));
        label_B.setBounds(0,0,512,720);


        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_A);
        myPanel.add(label_B);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
