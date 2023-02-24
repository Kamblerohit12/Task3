import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends  JFrame implements ActionListener{
    JTextField username;
    JPasswordField atmpin;
    JLabel user,pin;
    JButton login;
    JLabel sign;
    Main(){
        user= new JLabel("ENTER NAME");
        pin= new JLabel("PASSWORD");
        username= new JTextField(10);

        atmpin= new JPasswordField(10);
        login= new JButton("Login");
        sign= new JLabel("Sign in ");

        user.setBounds(50,100,150,30);
        pin.setBounds(50,150,100,30);
        username.setBounds(170,100,200,30);
        atmpin.setBounds(170,150,200,30);
        login.setBounds(90,250,100,30);
        sign.setBounds(250,250,50,30);
add(user);
add(pin);
        add(username);
        add(atmpin);
        add(login);
        add(sign);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

        login.addActionListener((ActionListener) this);

    }
    public static void main(String[] args) {
       new Main();
    }

    public  void actionPerformed( ActionEvent e) {
        try {
            if (e.getSource()==login) {
                if(username.getText().equals("rohit") && atmpin.getText().equals("1234")) {

                    {
                        JOptionPane.showMessageDialog(null, "corect passsword");

                        number25to99 n1 = new number25to99();
                        n1.setVisible(true);
                    }
                }
                else
                {
                    username.setText("Enter correct username");
                    atmpin.setText("");

                }

            }

        } catch (Exception ex) {

        }


    }
    }
