package firstTry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class prb3 {
	

	public static void main(String[] args) {
		JFrame gui = new JFrame();
		gui.setSize(600,400);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setLayout(null);
		JButton adn = new JButton("+");
		JButton dif = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		JTextField number1 = new JTextField();
		JTextField number2 = new JTextField();
		
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				char result;
				String Lst1 = number1.getText();
				int n = Lst1.length();
				String Lst2 = number2.getText();
				int m = Lst2.length();
					
				double lst1 = Double.parseDouble(Lst1);
				double lst2 = Double.parseDouble(Lst2);

				for(int i = 0; i < n; i++)
				{
					
					try {
						result=Lst1.charAt(i);
						if(result >= 'a' && result <= 'z')
							{
								
							}
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(gui, "Only numbers are available", 
								 "Error!!", JOptionPane.ERROR_MESSAGE);
						System.out.println("Only Numbers");
					}
					
				}
				
				for(int i = 0; i < m; i++)
				{
					
					try {
						result = Lst2.charAt(i);
						if(result >= 'a' && result <= 'z')
							{
						
							}
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(gui, "Only numbers are available", 
								 "Error!!", JOptionPane.ERROR_MESSAGE);
						System.out.println("Only Numbers");
					}
				}
				
				 if(e.getSource() == adn)
				 {
					 double suma = lst1 + lst2;
					 System.out.println("Suma nr este " + suma);
				 }
	             
				 if(e.getSource() == dif)
				 {
					 if(lst2 > lst1)
					 {
						 JOptionPane.showMessageDialog(gui, "Numbers will be inverted", 
								 "Calcul error!!", JOptionPane.ERROR_MESSAGE);
						 double aux=0;
						 aux=lst1;
						 lst1=lst2;
						 lst2=aux;
					 }
					 double dif = lst1 - lst2;
					 System.out.println("Diferenta nr este " + dif);
				 }
				 
				 if(e.getSource() == mul)
				 {
					 double mull = lst1 * lst2;
					 System.out.println("Inmultirea nr este " + mull);
				 }
				 
				 if(e.getSource() == div)
				 {
					 try {
						 if(lst2==0)
						 {
							 JOptionPane.showMessageDialog(gui, "You can't divide by 0!!!", 
									 "Calcul error!!", JOptionPane.ERROR_MESSAGE);
						 }
					 }
					 catch(Exception e2)
					 {
						 
					 }
					 double imp = lst1 / lst2;
					 System.out.println("Suma nr este " + imp);
				 }
			}
		};
		
		
		gui.add(adn);
		adn.setBounds(140, 200, 50, 30);
		adn.addActionListener(action);
		
		
		gui.add(dif);
		dif.setBounds(195, 200, 50, 30);
		dif.addActionListener(action);
		
		
		gui.add(mul);
		mul.setBounds(250, 200, 50, 30);
		mul.addActionListener(action);
		
		
		gui.add(div);
		div.addActionListener(action);
		div.setBounds(305, 200, 50, 30);
		
		
		gui.add(number1);
		number1.setBounds(180, 130, 40, 30);
		number1.addActionListener(action);
		
		
		gui.add(number2);
		number2.setBounds(250, 130, 40, 30);
		number2.addActionListener(action);
		
		gui.setVisible(true);
	}

}