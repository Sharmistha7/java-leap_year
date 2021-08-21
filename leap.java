

import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class leap
{
	public static void main(String args[])
	{
		
		
			JFrame f= new JFrame("Leap Year Finder");
		
			JLabel title,l1,l2;
			JLabel subt,year1,year2,year3;
			JTextField t1,t2;
			JButton search,close,ok;
			
			title=new JLabel("FIND LEAP YEAR");
			title.setBounds(90,5,180,50);
			title.setForeground(Color.RED);
			f.add(title);
	
			l1=new JLabel ("Enter any year you want to find is Leap ");
			l1.setBounds(40,50,250,50);
			f.add(l1);
			
			l2=new JLabel ("Your Year here:");
			l2.setBounds(40,100,120,40);
			f.add(l2);
		
			t1=new JTextField("");
			t1.setBounds(160,100,50,40);
			f.add(t1);
			
			search=new JButton ("FIND");
			search.setBounds(80,150,130,50);
			f.add(search);
				
			subt=new JLabel ("Enter following number to get respective Leap Years");
			subt.setBounds (20,210,310,50);
			f.add(subt);
			
			year1=new JLabel ("1. All Leap years from 2000 to 2010");
			year1.setBounds (20,260,250,50);
			f.add(year1);
			
			year2=new JLabel ("2. All Leap years from 2010 to 2020");
			year2.setBounds (20,300,250,50);
			f.add(year2);
			
			year3= new JLabel ("3. All Leap years from 2020 to 2030");
			year3.setBounds (20,340,250,50);
			f.add(year3);
			
			t2=new JTextField ("");
			t2.setBounds (130,390,50,40);
			f.add(t2);
			
			ok=new JButton ("OK");
			ok.setBounds (50,440,100,50);
			f.add(ok);
			
			close=new JButton ("CLOSE");
			close.setBounds(180,440,100,50);
			f.add(close);

		
			f.addWindowListener(new WindowAdapter()
			{									
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
		
		
			f.setLayout(null);
			f.setSize(350,600);
			f.setVisible(true);
			
			
			search.addActionListener(new ActionListener()									
			{
				public void actionPerformed(ActionEvent e)
				{			
				
				try
				{
					int year= Integer.parseInt(t1.getText());
					
					if(year%4==0 && year%100!=0  || year%400==0 )
					{
						JOptionPane.showMessageDialog(f,"Leap Year");
					}
					
					
					else
					{
						JOptionPane.showMessageDialog(f,"Not a Leap Year");
					}
				}
				
				catch (NumberFormatException n) 
					{
						JOptionPane.showMessageDialog(f,"Invalid Input");
					}
					
				}
				});
				
				
				ok.addActionListener(new ActionListener()									
				{
				public void actionPerformed(ActionEvent e)
				{			
				try
				{
					int no= Integer.parseInt(t2.getText());
									
					switch (no)
					{
						case 1: 
							for (int i=2000; i<=2010; i++)
							{
								if (i%4==0 && i%100 !=0 || i%400==0)
								{
									String s=Integer.toString(i);
									JOptionPane.showMessageDialog(f,"Leap Years are: " +s);
								}
							}
						break;
						
						case 2:
							for (int i=2010; i<=2020; i++)
							{
								if (i%4==0 && i%100 !=0 || i%400==0)
								{
									String s=Integer.toString(i);
									JOptionPane.showMessageDialog(f,"Leap Years are: " +s);
								}
							}
						break;

						case 3:
							for (int i=2020; i<=2030; i++)
							{
								if (i%4==0 && i%100 !=0 || i%400==0)
								{
									String s=Integer.toString(i);
									JOptionPane.showMessageDialog(f,"Leap Years are: " +s);
								}
							}
						break;
				
						default: 
							JOptionPane.showMessageDialog(f,"Wrong Choice");
					}
				}
				
				
				catch (NumberFormatException n) 
					{
						JOptionPane.showMessageDialog(f,"Invalid Input");
					}
				
				}
				});

				
				close.addActionListener(new ActionListener()									
				{
					public void actionPerformed(ActionEvent e)
					{
						f.dispose();
					}
				});
	}
}