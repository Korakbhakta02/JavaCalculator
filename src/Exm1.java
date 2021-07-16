
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exm1 {
    String opr="";
    Exm1()
    {
        JFrame f=new JFrame("JAVACALC");
        f.setLayout(new GridLayout(0,2));

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        p2.setBackground(Color.CYAN);
        p1.setLayout(new GridLayout(2,0));
        JPanel p3=new JPanel();
        p3.setBackground(Color.CYAN);
        JPanel p4=new JPanel();
        Font font1=new Font("Arial",Font.BOLD,30);
        Font font2=new Font("Arial",Font.BOLD,40);
        JTextField t1=new JTextField(13);
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        t1.setEditable(false);
        t1.setBackground(Color.CYAN);
        t1.setFont(font1);
        JTextArea t2=new JTextArea(1,10);
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        t2.setBackground(Color.CYAN);
        t2.setForeground(Color.MAGENTA);
        t2.setFont(font2);

        p4.setLayout(new GridLayout(4,4));
        JButton one=new JButton("1");
        one.setFont(font1);
        JButton two=new JButton("2");
        two.setFont(font1);
        JButton three=new JButton("3");
        three.setFont(font1);
        JButton four=new JButton("4");
        four.setFont(font1);
        JButton five=new JButton("5");
        five.setFont(font1);
        JButton six=new JButton("6");
        six.setFont(font1);
        JButton seven=new JButton("7");
        seven.setFont(font1);
        JButton eight=new JButton("8");
        eight.setFont(font1);
        JButton nine=new JButton("9");
        nine.setFont(font1);
        JButton zero=new JButton("0");
        zero.setFont(font1);
        JButton add=new JButton("+");
        add.setFont(font1);
        JButton sub=new JButton("-");
        sub.setFont(font1);
        JButton multi=new JButton("*");
        multi.setFont(font1);
        JButton equal=new JButton("=");
        equal.setFont(font1);
        JButton clear=new JButton("C");
        clear.setFont(font1);
        JButton close=new JButton("X");
        close.setFont(font1);

        JTextArea ta=new JTextArea(50,10);
        ta.setFont(font1);
        ta.setEditable(false);
        ta.setBackground(Color.CYAN);


        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("1");
                }
                else
                {

                    t2.append("1");
                }
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("2");
                }
                else
                {

                    t2.append("2");
                }

            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("3");
                }
                else
                {

                    t2.append("3");
                }

            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("4");
                }
                else
                {

                    t2.append("4");
                }

            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("5");
                }
                else
                {

                    t2.append("5");
                }

            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("6");
                }
                else
                {

                    t2.append("6");
                }

            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("7");
                }
                else
                {

                    t2.append("7");
                }

            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("8");
                }
                else
                {

                    t2.append("8");
                }

            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("9");
                }
                else
                {

                    t2.append("9");
                }

            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(opr.equals("")) {
                    t2.append("0");
                }
                else
                {

                    t2.append("0");
                }

            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t2.setText("");
                t1.setText("");

            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t2.getText();
                opr="+";
                str=str+opr;
                System.out.println(str);
                t1.setText(str);
                t2.setText("");


            }
        });
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t2.getText();
                opr="-";
                str=str+opr;
                System.out.println(str);
                t1.setText(str);
                t2.setText("");

            }
        });
        multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str=t2.getText();
                opr="*";
                str=str+opr;
                System.out.println(str);
                t1.setText(str);
                t2.setText("");

            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int b=Integer.parseInt(t2.getText()); // 4
                String opr1=t1.getText(); // 15+
                String expr=opr1+b+"=";
                char arr[]=new char[opr1.length()-1];
                for(int i=0;i<opr1.length()-1;i++)
                {
                    arr[i]=opr1.charAt(i);
                }
                opr1=new String(arr);
                int a=Integer.parseInt(opr1);// 15
                int r=0;
                if(opr.equals("+"))
                {
                    r=a+b;
                }
                else if(opr.equals("-"))
                {
                    r=a-b;
                }
                else if(opr.equals("*"))
                {
                    r=a*b;
                }
                t2.setText(r+"");
                t1.setText(expr);
                expr=expr+r;
                ta.append(expr+"\n");

            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);//f.dispose();
            }
        });
        p2.add(ta);
        p4.add(one);
        p4.add(two);
        p4.add(three);
        p4.add(four);
        p4.add(five);
        p4.add(six);
        p4.add(seven);
        p4.add(eight);
        p4.add(nine);
        p4.add(zero);
        p4.add(clear);
        p4.add(close);
        p4.add(add);
        p4.add(sub);
        p4.add(multi);
        p4.add(equal);
        p3.add(t1);
        p3.add(t2);
        p1.add(p3);
        p1.add(p4);
        f.add(p1);
        f.add(p2);
        f.setSize(800,650);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Exm1 E=new Exm1();
    }
}