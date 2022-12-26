import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myHomeWork extends JFrame implements ActionListener {
   JTextArea textArea ;
    JFrame jfr ;
    Label labal ;
    Label labal2;
    Label labal3 ;
    Label labal4 ;
    Label labal5 ;
    Label labal6;
    Label labal7;
    JPanel panel;
    JLabel labal8;
    String url = "C:\\Users\\tilish\\Downloads\\sleepppppp.jpg";
    ImageIcon imag;

    TextField textField ;
    TextField textField2 ;
    TextField textField3 ;
    TextField textField4;
    TextField textField5 ;
    JButton button1 ;
    JButton button2 ;
    JButton button3 ;
    JPasswordField passwordField;
     JComboBox combobox1;
     JComboBox combobox2;
     JComboBox combobox3;
     JCheckBox term;
     JLabel res;
    String data2;
    String data;
    String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
    myHomeWork(){
        res = new JLabel("");
        term = new JCheckBox("Accept Terms And Conditions.");
        textArea = new JTextArea();
        textArea .setLineWrap(true);
        textArea .setEditable(false);
         jfr = new JFrame("MY HOMEWORK");
        labal = new Label("Student Name:");
        labal2 = new Label("Father Name:");
        labal3 = new Label("Batch Timing:");
        labal4 = new Label("student Mobile:");
        labal5 = new Label("Fees Amount:");
        labal7 = new Label("Date of fees:");
        String url2 = "C:\\Users\\tilish\\Pictures\\myhomework.jpg";
        ImageIcon myImage = new ImageIcon(url2);
        labal8 = new JLabel(myImage);



        panel= new JPanel();
      combobox1= new JComboBox(dates);
      combobox2= new JComboBox(months);
      combobox3 = new JComboBox(years);
         labal6 = new Label();

        String url = "C:\\Users\\tilish\\Downloads\\sleepppppp.jpg";
        ImageIcon image = new ImageIcon(url);
        textArea.setBounds(450,140,320,340);
        textField = new TextField(30);
        textField2 = new TextField(30);
       textField3 = new TextField(30);
        textField4 = new TextField(30);
         textField5 = new TextField(30);
         button1 = new JButton("Generate Receipt");
        button1.addActionListener(this);
         button2 = new JButton("Reset");
        button2.addActionListener(this);
         button3 = new JButton("print Receipt");
          button3.addActionListener(this);
        passwordField = new JPasswordField(40);
        labal6.setText("WELCOME TO STUDENT FEES SYSTEM");


   /*
     JTextArea jta = new JTextArea(15, 20);
        String[][] data = {{"100", "teda", "3500","1212"},
                {"102", "tilish", "4500","1213"},
                {"103", "nati", "3800","1214"}};
        String[] column = {"ID", "NAME", "SALARY","SS ID"};
        JTable jtbl = new JTable(data, column);
        jtbl.setBounds(400, 0, 300, 300);
        jta.setBounds(100, 100, 100, 100);
        JPanel pnl = new JPanel();
        pnl.setLayout(null);
        pnl.add( jta);
        pnl.setBackground(Color.PINK);
        JPanel pnl2 = new JPanel();
        pnl2.setLayout(new FlowLayout());
        pnl2.add(jtbl);
        pnl2.setBackground(Color.cyan);
        JPanel pnl3 = new JPanel();
        pnl3.setLayout(new FlowLayout());
        // pnl3.add();
        pnl.setBackground(Color.ORANGE);

        JTabbedPane jtp = new JTabbedPane();
        //  jtp.setSize(700,700);
        jtp.setBounds(600, 60, 380, 400);
        jtp.add("comment", pnl);
        jtp.add("visit", pnl2);
        jtp.add("help", pnl3);*/
        res.setBounds(460,510,250,20);
        panel.setBounds(0,0,400,400);
        labal8.setBounds(2,2,630,98);
     labal7.setBounds(4,400,80,20);
     combobox1.setBounds(120,400,50,20);
     combobox2.setBounds(170,400,70,20);
     combobox3.setBounds(240,400,70,20);
        term.setBounds(120,450,200,20);
        button1.setBounds(10,500,135,30);
        button2.setBounds(170,500,125,30);
        button3.setBounds(320,500,125,30);
        textField.setBounds(120,140,320,30);
        textField2.setBounds(120,195,320,30);
        textField3.setBounds(120,245,320,30);
        textField4.setBounds(120,295,320,30);
        textField5.setBounds(120,345,320,30);
        labal .setBounds(4,150,80,20);
        labal2 .setBounds(4,200,80,20);
        labal3.setBounds(4,250,80,20);
        labal4.setBounds(4,300,85,20);
        labal5.setBounds(4,350,80,20);
        labal6.setBounds(150,100,500,40);
        passwordField.setBounds(90,90,90,20);


        res.setFont(new Font("Mv iu",Font.ITALIC,20));
        labal6.setFont(new Font("Mv iu",Font.ITALIC,25));

        term.setForeground(Color.red);
        res.setForeground(Color.red);
       labal7.setForeground(Color.GREEN);
        labal6.setForeground(Color.CYAN);
        labal.setForeground(Color.green);
        labal2.setForeground(Color.green);
        labal3.setForeground(Color.green);
        labal4.setForeground(Color.green);
        labal5.setForeground(Color.green);
        button1.setBackground(Color.green);
        button2.setBackground(Color.pink);
        button3.setBackground(Color.cyan);
        jfr.getContentPane().setBackground(new Color(112, 121, 219));
        jfr.setSize(800,600);
        jfr.add(labal);
        jfr.add(textField);
        jfr.add(labal2);
        jfr.add(textField2);
        jfr.add(textField3);
        jfr.add(labal3);
        jfr.add(textField4);
        jfr.add(labal4);
        jfr.add(textField5);
        jfr.add(labal5);
        jfr.add(labal6);
        jfr.add(button1);
        jfr.add(button2);
        jfr.add(button3);
        jfr.add(textArea);
      jfr.add(combobox1);
      jfr.add(combobox2);
      jfr.add(combobox3);
     jfr.add(labal7);
        jfr.add(labal8);
       jfr.add(term);
        jfr.add(res);

        jfr.setResizable(false);
        jfr.setIconImage(image.getImage());
        jfr.setLayout(null);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setVisible(true);

        }
    public void actionPerformed(ActionEvent event)
   { if (event.getSource() == button1) {
        if (term.isSelected()) {

            if ("".equals(textField.getText()) || "".equals(textField2.getText()) || "".equals(textField3.getText())  || "".equals(textField4.getText())  || "".equals(textField5.getText())  || "".equals(combobox1) || "".equals(combobox2) || "".equals(combobox3) ) {

                res.setText("please fullfill all required");
           }
            else {
                data = "Student Name : " +
                        textField.getText() + "\n"
                        + "Father name: " +
                        textField2.getText() + "\n" +
                        "Baching Time:" +
                        textField3.getText() + "\n" +
                        "Student Mobile:" +
                        textField4.getText() + "\n" +
                        "Fees Amount:" +
                        textField5.getText() + "\n";
                data2 = "Date of fees : " +
                        combobox1.getSelectedItem() + "/" +
                        combobox2.getSelectedItem() + "/" +
                        combobox3.getSelectedItem();
                textArea.setText(data + data2);
                textArea.setEditable(false);
                res.setText("Fees Successfully..");
            }
        }
        else {
            textArea.setText("");
            res.setText("Please accept the terms & conditions..");
        }
    }

    else if (event.getSource() == button2) {
        String delete = "";
        textField.setText(delete);
        textField2.setText(delete);
       textField3.setText(delete);
        textField4.setText(delete);
        textField5.setText(delete);
       textArea.setText(delete);
       res.setText(delete);
        term.setSelected(false);
        combobox1.setSelectedIndex(0);
        combobox2.setSelectedIndex(0);
       combobox3.setSelectedIndex(0);

    }
    else if(event.getSource() == button3)
    { if("".equals(textArea.getText()))
        res.setText("Please add information..");
        else
        res.setText("Print succcefull..");

    }

    }


    public static void main(String[] args) {
        myHomeWork my= new myHomeWork();

    }
}
