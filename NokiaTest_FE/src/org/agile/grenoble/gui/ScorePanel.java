package org.agile.grenoble.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScorePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5175224655899620047L;
	private final String label;
	private JTextField jTextField;

	public ScorePanel(String label) {
		this.label = label;
		jTextField = new JTextField(label);
		add(jTextField);
	}

	public void setScore(int score) {
		jTextField.setText(label + score);
	}

}
