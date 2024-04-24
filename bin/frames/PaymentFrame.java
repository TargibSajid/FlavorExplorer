package bin.frames;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentFrame  {

        ImageIcon img;
        JLabel userLabel, passLabel,adderslabel, imgLabel ,userLabel2,userLabel3,userLabel4;
        JTextField userTF;
        JPasswordField passPF;
        JTextField addersps;
        JButton loginBtn, exitBtn,ok;
        JCheckBox c1, c2, c3,c4;
        ButtonGroup bg1;
        JPanel panel;

        public PaymentFrame() {
            JFrame frame = new JFrame("Online Payment");
            frame.setSize(800, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel = new JPanel();
            panel.setLayout(null);

            userLabel = new JLabel("Enter Bkash Number : ");
            userLabel.setBounds(700, 115, 180, 30);
            panel.add(userLabel);
            userLabel.setVisible(false);


            userLabel2 = new JLabel("Enter Nagad Number : ");
            userLabel2.setBounds(700, 115, 180, 30);
            panel.add(userLabel2);
            userLabel2.setVisible(false);

            userLabel3 = new JLabel("Enter Rocket Number : ");
            userLabel3.setBounds(700, 115, 180, 30);
            panel.add(userLabel3);
            userLabel3.setVisible(false);

            userLabel4 = new JLabel("Enter VisaCard Number : ");
            userLabel4.setBounds(700, 115, 180, 30);
            panel.add(userLabel4);
            userLabel4.setVisible(false);

            userTF = new JTextField();
            userTF.setBounds(900, 115, 100, 30);
            panel.add(userTF);
            userTF.setVisible(false);

            passLabel = new JLabel("Password : ");
            passLabel.setBounds(700, 165, 100, 30);
            panel.add(passLabel);
            passLabel.setVisible(false);


            passPF = new JPasswordField();
            passPF.setBounds(900, 165, 100, 30);
            panel.add(passPF);
            passPF.setVisible(false);

            adderslabel = new JLabel("Address : ");
            adderslabel.setBounds(700, 215, 100, 30);
            panel.add(adderslabel);
            adderslabel.setVisible(false);


            addersps = new JTextField();
            addersps.setBounds(900, 215, 100, 30);
            panel.add(addersps);
            addersps.setVisible(false);


            loginBtn = new JButton("Confirm Order");
            loginBtn.setBounds(700, 280, 150, 30);
            panel.add(loginBtn);
            loginBtn.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    JOptionPane.showMessageDialog(frame,"Payment Completed .."+"\nYour Address : " + addersps.getText() ,"Payment",JOptionPane.INFORMATION_MESSAGE);
                }
            });
            loginBtn.setVisible(false);

            exitBtn = new JButton("Back");
            exitBtn.setBounds(900, 280, 80, 30);
            panel.add(exitBtn);
            exitBtn.setVisible(false);
            exitBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    enable();
                    
                }
            });


            JButton homebtn = new JButton("Home");
            homebtn.setBounds(900, 380, 80, 30);
            panel.add(homebtn);
            homebtn.setVisible(true);
            homebtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);
                    
                }
            });


            ok = new JButton("OK");
            ok.setBounds(100, 180, 80, 30);
            panel.add(ok);
            ok.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                   disable();
                    visible(); 
                }
            });

            c1 = new JCheckBox("BKash");
            c1.setBounds(100, 50, 100, 20);
            panel.add(c1);

            c2 = new JCheckBox("Nagad");
            c2.setBounds(100, 80, 100, 20);
            panel.add(c2);

            c3 = new JCheckBox("Rocket");
            c3.setBounds(100, 110, 100, 20);
            panel.add(c3);


            c4 = new JCheckBox("Visacard");
            c4.setBounds(100, 140, 100, 20);
            panel.add(c4);

            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(c1);
            buttonGroup.add(c2);
            buttonGroup.add(c3);
            buttonGroup.add(c4);

        /*  String items[] = {"BKash", "Nagad", "Rocket", "Mastercard", "Visacard"};
        combo = new JComboBox<>(items);
        combo.setBounds(100, 50, 100, 30);
        panel.add(combo);  */

         img = new ImageIcon("payment.jpg");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(0, 0, 1600, 850);
        panel.add(imgLabel); 

            frame.add(panel);
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            new PaymentFrame();
            
        }

   

    public void disable(){
        c1.setEnabled(false);
        c2.setEnabled(false);
        c3.setEnabled(false);
        c4.setEnabled(false);
        ok.setEnabled(false);
    }
    public void enable(){
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
        c4.setEnabled(true);
        ok.setEnabled(true);
    }
    public void visible(){
        if(c1.isSelected()){
            userLabel.setVisible(true);
            userLabel2.setVisible(false);
            userLabel3.setVisible(false);
            userLabel4.setVisible(false);

        }
        if(c2.isSelected()){
            userLabel.setVisible(false);
            userLabel2.setVisible(true);
            userLabel3.setVisible(false);
            userLabel4.setVisible(false);
        }
        if(c3.isSelected()){
            userLabel.setVisible(false);
            userLabel2.setVisible(false);
            userLabel3.setVisible(true);
            userLabel4.setVisible(false);
        }
        if(c4.isSelected()){
            userLabel.setVisible(false);
            userLabel2.setVisible(false);
            userLabel3.setVisible(false);
            userLabel4.setVisible(true);
        }
        userTF.setVisible(true);
        passLabel.setVisible(true);
        passPF.setVisible(true);
        adderslabel.setVisible(true);
        addersps.setVisible(true);
        loginBtn.setVisible(true);
        exitBtn.setVisible(true);
    }

}