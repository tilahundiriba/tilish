





//package lst;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class same2 {

        JFrame fr = new JFrame(" BUS TICKETING SYSTEM");
        public void myGUI(){
            JLabel lbl1,lbl2,lbl3,lbl4,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11;
            JTextField txt1,txt2,txt3,txt4,txt5,txt6;

            JButton btn;
            fr.setSize(800,700);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.getContentPane().setBackground(new Color(100,200,30,90));
            lbl1 = new JLabel("first name");
            lbl2 = new JLabel("last name");
            lbl3 = new JLabel("Menesha");
            lbl4 = new JLabel("medresha");
            lbl6 = new JLabel("departure :");
            lbl7 = new JLabel("no of passenger:");
            lbl8 = new JLabel("paidamount");
            lbl9=new JLabel("servicetype :");
            lbl10 =new JLabel("about passengers:");
            lbl11=new JLabel("number of ticket/s :");
            txt1 = new JTextField(20);
            txt2 = new JTextField(100);
            txt3 = new JTextField(20);
            txt4 = new JTextField(20);
            txt5 = new JTextField(20);
            txt6= new JTextField(20);
            //txta = new JTextArea( 20);
            btn = new JButton("submit");
            //creat login button
            JButton loginButton = new JButton("Login");

            //creating panel
            Panel p = new Panel(new FlowLayout(1, 10, 10));
            p.setLayout(null);
            p.add(lbl1);
            p.add(txt1);
            p.add(lbl2);
            p.add(txt2);
            p.add(lbl3);
            p.add(txt3);
            p.add(lbl4);
            p.add(txt4);
            p.add(btn);
            //creating jcombobox
            String[] year = {"2022", "2023", "2024", "2025","2026","2027","2028",};

            JComboBox cbx = new JComboBox(year);
            String[] month = {"1", "2", "3", "4","5","6","7","8","9","10","11","12"};
            JComboBox cbx2 = new JComboBox(month);
            String[] day = {"1", "2", "3", "4","5","6","7","8", "9", "10",
                    "11","12","13","14" ,"15", "16",  "17", "18","19","20",
                    "21","22", "23", "24", "25","26","27","28","29", "30"};
            JComboBox cbx3 = new JComboBox(day);
            JLabel lbl5 = new JLabel("type/dersomels :");
            JCheckBox chebx1 = new JCheckBox("vip");
            JCheckBox chebx2 = new JCheckBox("normal", true);
            JCheckBox chebx3 = new JCheckBox("additionalservece", true);
            JTextArea txta =new JTextArea ("inform about your-self below");
            //creating JList
            String [] jlist={"1","2","3 ","4"};
            JList jl=new JList(jlist);

            fr.setVisible(true);
            fr.setLayout(null);
            lbl11.setBounds(970, 150, 200, 110);
            fr.add(lbl11);
            jl.setBounds(1100, 200, 70, 70);
            fr.add(jl);
            lbl10.setBounds(850, 400, 200, 110);
            fr.add(lbl10);
            txta.setBounds(960, 380, 360, 210);
            fr.add(txta);
            lbl9.setBounds(330, 265, 80, 30);
            fr.add(lbl9);
            chebx1.setBounds(420,270,60,20);
            fr.add(chebx1);
            chebx2.setBounds(480,270,70,20);
            fr.add(chebx2);
            chebx3.setBounds(550,270,80,20);
            fr.add(chebx3);
            lbl1.setBounds(30, 50, 70, 20);
            fr.add(lbl1);
            txt1.setBounds(100, 50, 80, 20);
            fr.add(txt1);
            lbl2.setBounds(30, 100, 70, 20);
            fr.add(lbl2);
            txt2.setBounds(100, 100, 80, 20);
            fr.add(txt2);
            lbl3.setBounds(30, 150, 70, 20);
            fr.add(lbl3);
            txt3.setBounds(100, 150, 80, 20);
            fr.add(txt3);
            lbl4.setBounds(30, 200, 70, 20);
            fr.add(lbl4);
            txt4.setBounds(100, 200, 80, 20);
            fr.add(txt4);
            lbl7.setBounds(30, 250, 80, 20);
            fr.add(lbl7);
            txt5.setBounds(110, 250, 80, 20);
            fr.add(txt5);
            lbl8.setBounds(30, 300, 80, 20);
            fr.add(lbl8);
            txt6.setBounds(110, 300, 80, 20);
            fr.add(txt6);

            //creating jcombobox
            lbl6.setBounds(500, 120, 80, 20);
            fr.add(lbl6);
            cbx3.setBounds(600, 120, 80, 20);
            fr.add(cbx3);
            cbx2.setBounds(700, 120, 80, 20);
            fr.add(cbx2);
            cbx.setBounds(800, 120, 80, 20);
            fr.add(cbx);
            btn.setBounds(500, 450, 100, 20);
            fr.add(btn);
            fr.add(p);
            //RadioButton
            JRadioButton r1 = new JRadioButton("1) single");
            JRadioButton r2 = new JRadioButton("2) return");
            r1.setBounds(75, 50, 100, 30);
            r2.setBounds(75, 100, 100, 30);
            ButtonGroup bgr = new ButtonGroup();
            bgr.add(r1);
            bgr.add(r2);
            lbl5.setBounds(300, 120, 80, 20);
            fr.add(lbl5);
            r1.setBounds(250, 150, 80, 20);
            fr.add(r1);
            r2.setBounds(350, 150, 80, 20);
            fr.add(r2);
            p.setLayout(null);

            btn.addActionListener((ActionEvent e) -> {
                String Name =" firstname :" + " "+  txt1.getText() + " \n" +" lastname :" + " "+  txt2.getText()+ "\n " +
                        " menesha :" + " "+  txt3.getText() + "\n" + " medresha :" + " "+
                        txt4.getText() + " \n"+ " no of passanger :" + " "+ txt5.getText()+" \n"+ "payed amount : " +txt6.getText() + "\n" +   " no of passanger :" + " "+
                        txt5.getText()+" \n"+ "paid amount :" +txt6.getText() + "\n" + "departure :" + cbx3.getSelectedItem() + "/" +  cbx2.getSelectedItem() + "/" +  cbx.getSelectedItem();
                ;
                txta.setText(Name);
               //JOptionPane.showMessageDialog(fr, Name);
                // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            });
        }
        public static void main(String[] args) {
            same2 obj=new same2();
            obj.myGUI();
        }
    }




