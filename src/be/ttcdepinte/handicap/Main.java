package be.ttcdepinte.handicap;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	    JFrame aWindow = new JFrame("Handicap");
	    aWindow.getContentPane().add(new DoublesForm());
	   
	    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    aWindow.pack();
	    aWindow.setVisible(true);
	  }
	
}
