package be.ttcdepinte.handicap;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DoublesForm extends JPanel{
	
	private static final long serialVersionUID = 4522012737294440556L;
	private JTextField team1Player1;
	private JTextField team1Player2;
	private JTextField team2Player1;
	private JTextField team2Player2;
	
	public DoublesForm() {
		setLayout(new BorderLayout());
		
		JPanel team1 =  new JPanel();
		JPanel team2 =  new JPanel();
		
		team1Player1 = createTextField();
		team1.add(team1Player1);
		team1Player2 = createTextField();
		team1.add(team1Player2);
		team2Player1 = createTextField();
		team2.add(team2Player1);
		team2Player2 = createTextField();
		team2.add(team2Player2);
		
		team1.setBorder(BorderFactory.createTitledBorder("Team 1"));
		team2.setBorder(BorderFactory.createTitledBorder("Team 2"));
		team1.setPreferredSize(new Dimension(200, 140));
		team2.setPreferredSize(new Dimension(200, 140));
		
		
		add(team1, BorderLayout.WEST);
		add(team2, BorderLayout.EAST);
		JButton button = new JButton("bereken");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calculateHandicap(team1Player1.getText(), team1Player2.getText(), team2Player1.getText(), team2Player2.getText());
			}

			
		});
		button.setPreferredSize(new Dimension(400, 30));
		
		add(button, BorderLayout.SOUTH);
	}
	
	private JTextField createTextField() {
		JTextField textField = new JTextField();
		textField.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		textField.setPreferredSize(new Dimension(80, 60));
		return textField;
	} 
	
	
	private void calculateHandicap(String t1p1, String t1p2, String t2p1, String t2p2) {
		int totalDiff = diff(convertToNumber(t1p1), convertToNumber(t2p1)) +
			   diff(convertToNumber(t1p1), convertToNumber(t2p2)) +
			   diff(convertToNumber(t1p2), convertToNumber(t2p1)) + 
			   diff(convertToNumber(t1p2), convertToNumber(t2p2)); 
		boolean negative = totalDiff < 0;
		double 	result = negative ? Math.floor(totalDiff / 4.0) : Math.ceil(totalDiff/ 4.0);
		
		
		if (result > 0) {
			JOptionPane.showMessageDialog(this, "Team 1 moet " + ((int) result) + " punten handicap geven aan team 2");
		} else if (result < 0){
			JOptionPane.showMessageDialog(this, "Team 2 moet " + ((int) - result) + " punten handicap geven aan team 1");
		} else {
			JOptionPane.showMessageDialog(this, "Geen handicap");	
		}
	}

	private int diff(int classAsNum1, int classAsNum2) {
		double value = (classAsNum1 - classAsNum2) * 0.5;
		return (int) (classAsNum1 > classAsNum2 ?  Math.ceil(value) : Math.floor(value));
	}

	private int convertToNumber(String classification) {
		if (classification == null) {
			throw new IllegalArgumentException();
		}
		classification = classification.trim().toUpperCase();
		if ("NG".equalsIgnoreCase(classification)) {
			return 0;
		} else if (classification.length() == 2){
			return 1 + ('E' - classification.charAt(0)) * 4 + (6 - Integer.parseInt("" + classification.charAt(1))) / 2;
		}
		
		throw new IllegalArgumentException();
		
	}
	
}
