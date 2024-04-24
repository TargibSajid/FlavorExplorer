package bin.frames;
import bin.classes.*;



import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class RegFrame extends RegFrameActions
{
	

	JFrame frame;
	JPanel panel;
	JTextField  usertf, passf , emailf;
	JLabel userlabel , passlabel , title, emaillabel;

	Font font;

	Color backgroundColor,titleColor ;

	JButton regbtn,backbtn;


	public RegFrame()
	{
		frame = new JFrame("Flavour&Explore");
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		backgroundColor = new Color(255, 215, 0);

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

		emaillabel = new JLabel("Email : ");
		emaillabel.setBounds(600,500,200,30);
		emaillabel.setForeground(Color.WHITE);
		panel.add(emaillabel);


		usertf = new JTextField();
		usertf.setBounds(700,300,200,30);
		panel.add(usertf);


		passf = new JTextField();
		passf.setBounds(700,400,200,30);
		panel.add(passf);

		emailf = new JTextField();
		emailf.setBounds(700,500,200,30);
		panel.add(emailf);

		regbtn = new JButton("REGISTER");
		regbtn.setBounds(800,550,100,30);
		regbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){

				String username = usertf.getText();
				String password = passf.getText();
				String email = emailf.getText();

				if( username.equals("")  && password.equals("") && email.equals(""))
			{
				
				JOptionPane.showMessageDialog(frame,"Please fill the boxs" ,"Attempt" , JOptionPane.ERROR_MESSAGE);
				
			}
				else 
				{
					dataSave();
					switchBackToLoginFrame();
					JOptionPane.showMessageDialog(null,"REGISTERED","ATTEMPT",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		panel.add(regbtn);


		backbtn = new JButton("Back");
		backbtn.setBounds(700,550,100,30);
		backbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				switchBackToLoginFrame();
				
		}	
	});

		
		panel.add(backbtn);


		ImageIcon img = new ImageIcon("background.jpg");
		JLabel imglabel = new JLabel(img);
		imglabel.setBounds(0,0,1920,1080);
		panel.add(imglabel);

		
	

		frame.add(panel);

		frame.setVisible(true);



	}


	public void switchBackToLoginFrame()
	{
		frame.setVisible(false);



		new LoginFrame();
	}

	public void dataSave()
	{
		File f = new File("F:\\University\\Semester 2\\java\\Java Project\\FlavorExplorer\\bin\\data\\user.txt");

		try 
		{
			f.createNewFile();

		}

		catch(IOException io)
		{

		System.out.println("cant create the file");

		}

		FileWriter fw = null;



		String enUsername = encryptedMsg(usertf.getText());


		String enPass = encryptedMsg(passf.getText());


		String enEmail = encryptedMsg(emailf.getText());









		try 
		{
			fw = new FileWriter(f,true);
		
			fw.write("\n" + enUsername + "," + enPass + "," + enEmail );


		}

		catch(IOException e )
		{
			System.out.println("Error occurd while saving data");
		}

		finally
		{
			try 
			{
				fw.close();
			}

			catch(IOException eo)
			{
				System.out.println("Error Occurd while closing the file");
			}
		}





	}


	String encryptedMsg(String ecLine)
	{


		char alphabet[] = new char[26];

		alphabet[0]='a';
		alphabet[1] = 'b';
		alphabet[2] = 'c';
		alphabet[3] = 'd';
		alphabet[4] = 'e';
		alphabet[5] = 'f';
		alphabet[6] = 'g';
		alphabet[7] = 'h';
		alphabet[8] = 'i';
		alphabet[9] = 'j';
		alphabet[10] = 'k';
		alphabet[11] = 'l';
		alphabet[12] = 'm';
		alphabet[13] = 'n';
		alphabet[14] = 'o';
		alphabet[15] = 'p';
		alphabet[16] = 'q';
		alphabet[17] = 'r';
		alphabet[18] = 's';
		alphabet[19] = 't';
		alphabet[20] = 'u';
		alphabet[21] = 'v';
		alphabet[22] = 'w';
		alphabet[23] = 'x';
		alphabet[24] = 'y';
		alphabet[25] = 'z';
		

		

		String input = ecLine;

		

		int strlength = input.length();



		char inputChar[] = new char[strlength];

		char []line =  new char[strlength];

		for(int i = 0 ; i < strlength ; i++)
		{
			inputChar[i] = input.charAt(i);
		}


	  for(int i = 0 ; i < strlength ; i++)
	  {
	  	for (int j = 0; j < 26 ; j ++)
		{
			if(alphabet[j] == inputChar[i])
			{
				int l = (j+3)%26;
				

				line[i] = alphabet[l];
				
				

			}

			else if(inputChar[i] == ' ')
			{
				line[i] = inputChar[i];
			
			}

		}

	  }

	  String codeName=  new String(line);


	  return codeName;
	}
}