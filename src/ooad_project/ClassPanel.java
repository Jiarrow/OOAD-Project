package ooad_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class ClassPanel extends JPanel {
	public ClassPanel() {
		super(new GridLayout(3, 1));
//		
		JPanel upPanel = new JPanel();
		upPanel.add(new JLabel("Order"));
		upPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		upPanel.setBackground(Color.lightGray);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		centerPanel.setBackground(Color.lightGray);
		
		JPanel downPanel = new JPanel();
		downPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		downPanel.setBackground(Color.lightGray);
		
		this.add(upPanel);
		this.add(centerPanel);
		this.add(downPanel);
	}
}
