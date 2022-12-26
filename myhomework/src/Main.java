import javax.swing.*;
import java.awt.*;

public class Main {
    Main(){
        ImageIcon image =new ImageIcon("C:\\Users\\tilish\\Downloads\\sleepppppp.jpg");
        String url2 = "C:\\Users\\tilish\\Downloads\\sistu.jpg";
        ImageIcon myImage = new ImageIcon(url2);
        JLabel labal8;
        labal8 = new JLabel(myImage);
        labal8.setBounds(400,50,200,200);
        JFrame jfr = new JFrame("MY HOMEWORK");
        JLabel labal = new JLabel(image);
        Container container = new Container();

        JLabel labal1=new JLabel("hey bro do you even code");
        labal.setBounds(10,10,400,400);
        labal1.setBounds(230,50,200,200);


        // jfr.setIconImage(image.getImage());
        //jfr.add(labal);
        // jfr.add(labal1);
        jfr.add(labal8);
        jfr.setLayout(null);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setVisible(true);

    }
    public static void main(String[] args) {

Main man = new Main();
    }
}