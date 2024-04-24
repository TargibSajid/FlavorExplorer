package bin.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SearchFrame {

    JFrame frame ;


    public SearchFrame(String searchText) {

        frame = new JFrame();
        frame.setTitle("Custom Frame Example");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // Set panel background color

                
            File fi = new File("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\data\\MAIN INGREDIENTS .txt");

            FileReader fr = null;

            try 
            {
                fr = new FileReader(fi);

                
            }

            catch (IOException fe)
            {
                System.out.println(fe);
            }

            



            BufferedReader br = null;

        try 
        {
            br = new BufferedReader(fr);

            

            for(int i = 0 ; i<fi.length();i++)
            {
                            String line = br.readLine();

                            if((line.contains(searchText)))
                            {

                                JLabel recipeLabel = new JLabel(line);
                                recipeLabel.setBounds(200,500,100,30);
                                recipeLabel.setSize(400,300);

                                panel.add(recipeLabel);


                                break;
                            }

            }



        }

        catch(IOException ef)
        {
            System.out.println("couldn't read the file");
        }

        finally
            {
                try
                {
                    fr.close();
                }

                catch(IOException fff)
                {
                    System.out.println(fff);
                }
            }


        
       
        JButton homebtn = new JButton("Back");
        homebtn.setBounds(100,500,100,70);
        homebtn.setSize(100,100);
        homebtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                switchToHomeFrame();
            }
        });
        panel.add(homebtn);

        frame.add(panel);
        frame.setVisible(true);
    }



    public void switchToHomeFrame()
    {

        frame.setVisible(false);

    }
}
 