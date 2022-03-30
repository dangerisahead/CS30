import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*

Program: BreakAPlate.java          Last Date of this Revision: February 20, 2022

Purpose: 

Author: Anthony Anidu, 
School: CHHS
Course: Computer Programming 30
 

*/

public class BreakAPlate 
{

	private JFrame frame;
	private boolean clicked;
	ImageIcon plates = new ImageIcon("...\\Chapter10\\src\\plates.gif");
	
	/**
	 * Create the application.
	 */
	public BreakAPlate() 
	{
		initialize();
		clicked = true;
	}
	
	public boolean getClicked()
	{
		return clicked;
	}
	
	public void setClicked(boolean input)
	{
		clicked = input;
	}
	
	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					BreakAPlate window = new BreakAPlate();
					window.frame.setVisible(true);
				}
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
    
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
			
		JLabel plates = new JLabel(new ImageIcon("C:\\Users\\Anidu\\Desktop\\plates.gif"));
		plates.setBackground(new Color(255, 255, 204));
		plates.setForeground(SystemColor.activeCaption);
		plates.setOpaque(true);
		plates.setBounds(255,129,514,146);
		frame.getContentPane().add(plates);
		
		JLabel prize = new JLabel(new ImageIcon("‪C:\\Users\\Anidu\\Desktop\\placeholder.gif"));
		prize.setBackground(new Color(255, 255, 204));
		prize.setBounds(255,315,514,100);
		prize.setOpaque(true);
		frame.getContentPane().add(prize);
		
		JButton btn = new JButton("Break");
		btn.setBackground(new Color(255, 255, 255));
		btn.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btn.setBounds(255, 275, 514, 42);
		frame.getContentPane().add(btn);
		
		JLabel titleLabel = new JLabel("Break the Plates");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setForeground(new Color(0, 102, 51));
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titleLabel.setOpaque(true);
		titleLabel.setBackground(new Color(255, 255, 204));
		titleLabel.setBounds(255, 46, 514, 83);
		frame.getContentPane().add(titleLabel);
		
		btn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (getClicked() == true)
				{
					btn.setText("Restart");
			        int plateOne = (int)((1 - 0 + 1) * Math.random() + 0);
			        int plateTwo = (int)((1 - 0 + 1) * Math.random() + 0);
			        int plateThree = (int)((1 - 0 + 1) * Math.random() + 0);
			        
			        if (plateOne == plateTwo && plateOne == plateThree)
			        {
			        	plates.setIcon(new ImageIcon("C:\\Users\\Anidu\\Desktop\\plates_all_broken.gif"));
			        	prize.setIcon(new ImageIcon("C:\\Users\\Anidu\\Desktop\\tiger_plush.gif"));
			        }
			        
			        else
			        {
			        	plates.setIcon(new ImageIcon("C:\\Users\\Anidu\\Desktop\\plates_two_broken.gif"));
			        	prize.setIcon(new ImageIcon("C:\\Users\\Anidu\\Desktop\\sticker.gif"));
			        }
			        
			        setClicked(false);
				}	
				
				else
				{
					btn.setText("Break");
					plates.setIcon(new ImageIcon("C:\\Users\\Anidu\\Desktop\\plates.gif"));
					prize.setIcon(new ImageIcon("C:\\Users\\Anidu\\Desktop\\placeholder.gif;"));
					setClicked(true);
				}
			}
		});				
	}
}
