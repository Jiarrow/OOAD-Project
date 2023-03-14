package ooad_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.*;

public class ClassPanel extends UMLObject {
	private JLabel name;
	private JPanel upPanel, centerPanel, downPanel;
	
	public ClassPanel() {
		super(new GridLayout(3, 1));
		
		name = new JLabel("class");
		
		upPanel = new JPanel();
		upPanel.add(new JLabel("Order"));
		upPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		upPanel.setBackground(Color.lightGray);
		this.add(upPanel);
		
		centerPanel = new JPanel();
		centerPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		centerPanel.setBackground(Color.lightGray);
		this.add(centerPanel);
		
		downPanel = new JPanel();
		downPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		downPanel.setBackground(Color.lightGray);
		this.add(downPanel);
	}
	
}
