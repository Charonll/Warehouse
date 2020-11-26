import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_img=new JLabel();
    JLabel label_fs=new JLabel();
    int score=0,score1=0,score2=0,score3=0,score4=0;
    //构造方法
    public App() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getX()<200 && e.getY()<100) {
                    score1=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(String.valueOf(score));

                }if(e.getX()<300 && e.getY()<200){
                    score2=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(String.valueOf(score));
                }if(e.getX()<400 && e.getY()<400){
                    score3=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(String.valueOf(score));
                }if(e.getX()<500 && e.getY()<500){
                    score4=1;
                    score=score1+score2+score3+score4;
                    label_fs.setText(   String.valueOf(score));
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/A.jpg");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(0,0,1000,800);

        label_fs.setText("得分：0");

        label_fs.setBounds(485,0,100,50);
        myPanel.add(label_fs);
        myPanel.add(label_img);



        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
       /* myPanel.add(label_img);*/
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
