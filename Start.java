import bin.frames.LoginFrame;
import bin.frames.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;



class Start
{
	public static void main(String [] args)
	{
		 SwingUtilities.invokeLater(() -> {
		 new LoginFrame();
		});

		
	}
}