package ooad_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.*;

public class ClassPanel extends JPanel {
	private JPanel upPanel, centerPanel, downPanel;
	// order is top, right, bottom, left
	public ArrayList<Point> midPoints = new ArrayList<Point>(4);
	
	public ClassPanel() {
		super(new GridLayout(3, 1));
		
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
