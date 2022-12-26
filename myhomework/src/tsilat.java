

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class tsilat extends JFrame implements ActionListener {

    JButton btn = new JButton("OK");
    JTextArea textArea = new JTextArea();
    JTextField tx = new JTextField();
    JTextField tx6 = new JTextField();
    String[] n={"LIPSTEAK","LOTION","FOUNDATION","POWDER"};
    JComboBox jc=new JComboBox(n);
    JCheckBox ch = new  JCheckBox("COSMOTICS");
    JCheckBox ch1 = new  JCheckBox("MEDICINE");
    JCheckBox ch2 = new  JCheckBox("SOAP AND DETEREGENT");
    tsilat(){
        JFrame fr = new JFrame("pharmacy");
        JLabel l = new JLabel("user name");


        btn.setBounds(300, 620, 80, 50);

        btn.addActionListener(this);
        fr.add(btn);
        textArea.setBounds(500,350,300,280);
        fr.add(textArea);
        l.setBounds(20, 50, 200, 80);
        fr.add(l);
        tx6.setBounds(90, 110, 90, 20);
        fr.add(tx6);
        tx.setBounds(90, 85, 90, 20);
        fr.add(tx);
        JLabel lb = new JLabel("WELCOME TO OUR PHARMACY");
        JLabel lb6 = new JLabel("tin number");
        lb6.setBounds(20,100,100,40);
        fr.add(lb6);
        lb.setBounds(300, 10, 200, 60);
        fr.add(lb);
        JPasswordField fl = new JPasswordField(10);
        fl.setBounds(90,110,90,20);
      // fr.add(fl);
        JLabel lb2 = new JLabel("LIST OF MEDICIENS FOUND");
        lb2.setBounds(20, 300, 200, 80);
        fr.add(lb2);

        String data[][]={ {"1","PROTINE SHAKE","67.0"},
                {"2","ANTIBIOTICS","78.0"},
                {"3","OMEPRAZOLE","70.0"},{"4","parastamol","30.0"}};
        String column[]={"NUMBER"," MEDICINE NAME","SALARY"};
        JTable jt=new JTable(data,column);
        jt.setBounds(200,150,400,20);
        JScrollPane sp=new JScrollPane(jt);
        sp.setBounds(20, 380, 400, 80);
        fr.add(sp);

        // JTextArea ar = new JTextArea("work hard");
        // ar.setBounds(20, 250, 80, 20);
        // fr.add(ar);
        JRadioButton r1 = new  JRadioButton("male");
        JRadioButton r2 = new  JRadioButton("female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        r1.setBounds(20, 150, 90, 30);
        r2.setBounds(20, 170, 90, 30);
        //fr.add(r1);
    //   fr.add(r2);



        JLabel lb3 = new JLabel("WHAT DO YOU WANT FROM OR PHARMACY?");
        lb3.setBounds(20, 170, 370, 80);
        fr.add(lb3);




        ch.setBounds(20, 230, 100, 30);

        ch1.setBounds(20, 260, 100, 30);

        ch2.setBounds(20, 290, 380, 30);
        //fr.getContentPane().SetBackground(Color.red);
        fr.add(ch);
        fr.add(ch1);
        fr.add(ch2);
        JLabel lb4 = new JLabel("CHOOSE THE TYPE OF COSMOTICS YOU WANT");
        lb4.setBounds(20, 450, 370, 80);
        fr.add(lb4);


        jc.setBounds(20, 500, 100, 70);
        fr.add(jc);
        JLabel lb5 = new JLabel("CHOOSE THE TYPE OF SOAP YOU WANT");
        lb5.setBounds(20, 550, 370, 80);
        fr.add(lb5);
        String [] s={"LIFEBOY","DOVE","SUNLIGHT","DURU"};
        JList jl=new JList(s);
        jl.setBounds(20, 600, 100, 70);
        fr.add(jl);

        ImageIcon image= new ImageIcon("C:\\Users\\lab13\\Downloads\\pharmacy.jpg") ;
        JLabel label = new JLabel(image);
        label.setBounds(500, 10, 500, 200);
        fr.add(label);


        String w= "C:\\Users\\lab13\\Downloads\\pharmacy.jpg";
        ImageIcon im =new ImageIcon(w);
        fr.setIconImage(im.getImage());





        fr.getContentPane().setBackground(new Color(205, 112, 219));
        fr.setLayout(null);
        fr.setSize(850,800);
        fr.setVisible(true);
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent event) {
        String data,data2 ;
        if(event.getSource()==btn){
         data= "Name :" + tx.getText() + "\n" + " tin number :" + tx6.getText() + "\n";
        data2= "cosmotics :" + jc.getSelectedItem() ;
           //data3= "Items :" + ch.isSelected() + ch1.isSelected() + ch2.isSelected() + "\n";
            textArea.setText(data + data2 );
            textArea.setEditable(false);
        }
    }
        public static void main(String[] args) {

tsilat tsi = new tsilat();
        }


}


