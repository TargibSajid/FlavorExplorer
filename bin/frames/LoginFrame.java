package bin.frames;
import bin.classes.*;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class LoginFrame implements ILoginFrameActions
{

	JFrame frame;
	JPanel panel;
	JTextField  usertf;
	JPasswordField passf;
	JLabel userlabel , passlabel , title , erorrmsg, imglabel;
	ImageIcon img;

	Font font;
	Color backgroundColor,titleColor,erorrmsgcolor ;

	JButton loginbtn,regbtn;






	public   LoginFrame()
	{
		frame = new JFrame("Flavour&Explore");
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		backgroundColor = new Color(123, 50, 255); 




		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(backgroundColor);

		title = new JLabel("Flavour&Explore");
		title.setForeground(Color.WHITE);
		title.setBounds(630,-100,500,500);
		panel.add(title);

		

		font=title.getFont().deriveFont(40f);
		title.setFont(font);

		


		userlabel = new JLabel("USER NAME : ");
		userlabel.setBounds(600,300,200,30);
		userlabel.setForeground(Color.WHITE);
		panel.add(userlabel);



		passlabel = new JLabel("PASSWORD : ");
		passlabel.setBounds(600,400,200,30);
		passlabel.setForeground(Color.WHITE);
		panel.add(passlabel);



		usertf = new JTextField();
		usertf.setBounds(700,300,200,30);
		panel.add(usertf);


		passf = new JPasswordField();
		passf.setBounds(700,400,200,30);
		panel.add(passf);


		loginbtn = new JButton("Login");
		loginbtn.setBounds(700,450,100,30);
		loginbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				switchToHomePageFrame();	
			}
		});

		panel.add(loginbtn);

		

		regbtn = new JButton("REGISTER");
		regbtn.setBounds(800,450,100,30);
		regbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				switchToRegFrame();
				
							
							
						
			}
		});

		panel.add(regbtn);


		img = new ImageIcon("background.jpg");
		imglabel = new JLabel(img);
		imglabel.setBounds(0,0,1920,1080);
		panel.add(imglabel);

		frame.add(panel);

		frame.setVisible(true);
	}

	public  void switchToRegFrame()
	{
		frame.setVisible(false);

		new RegFrame();
	}

	public  void switchToHomePageFrame()
	{
		File f = new File("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\data\\user.txt");

				FileReader fr = null;
				try 
				{
					fr = new FileReader(f);
				}
				catch(IOException io)
				{
					System.out.println("Error occurd while reading the file");
				}

				BufferedReader br = null;

				try
				{
					br = new BufferedReader(fr); 

					String username = usertf.getText();

					String pass = new String(passf.getPassword());

					boolean b1 = false;

					boolean b2 = false;

					String  susername = null;
					String spassword = null;
					String semail = null;



					for(int i = 0 ;i < f.length();i++)
					{
						String line= br.readLine();
						String[] string = line.split(",");
						susername = string[0];
					    spassword = 	string[1];
						semail = string[2];

						if(susername.equals(username))
						{
							b2 = true;

							System.out.println(b2);

							if(spassword.equals(pass))
							{
								b1 = true;

								System.out.println(b1);

								break;

								




							}

							else
							{
								b1=false;
							}
							


							


						}

						else 
						{
							b2 = false;
						}
						
					





						
					}


					if(b1 == true && b2 ==  true)
					{
						frame.setVisible(false);

							new HomePageFrame(susername,spassword,semail);
							
							System.out.println("use");
							

					}

					else if(b1 == false && b2 == true)
					{
						JOptionPane.showMessageDialog(null,"Wrong Password");

					}

					else if(b2 == false)
					{
						JOptionPane.showMessageDialog(null,"Wrong Username");
					}




								


				}

				catch(IOException i)
				{
					System.out.println("Error Occourd While logging");
				} 
				
	}



	
}