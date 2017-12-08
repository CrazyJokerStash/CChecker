package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import check.Checker;

@SuppressWarnings("serial")
public class Fenetre extends JFrame implements ActionListener
{	
	JLabel aff0, aff1, pres, resultat;
	JTextField saisie;
	JButton check;
	Checker chek;
	
	public Fenetre()
	{
		this.setTitle("CChecker");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp_data = new JPanel(new GridLayout(5, 1, 10, 10));
		jp_data.add(aff0 = new JLabel("Merci de saisir le numéro de carte bancaire : "));
		jp_data.add(saisie = new JTextField());
		jp_data.add(resultat = new JLabel(""));
		jp_data.add(check = new JButton("Check"));
		jp_data.add(aff1 = new JLabel(""));
		this.add(jp_data, BorderLayout.NORTH);
		this.pack();
		this.setLocationRelativeTo(null);
		
		check.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{	
		if (arg0.getSource() == check)
		{
			chek = new Checker(saisie.getText());
			//chek.parsing();
			if (chek.parsing() == true)
				JOptionPane.showMessageDialog(this, "Le numéro est valide");
			else
			{
				JOptionPane.showMessageDialog(this, "Le numéro est invalide");
			}
		}
	}
}
