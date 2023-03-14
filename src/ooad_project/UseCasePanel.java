package ooad_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;


public class UseCasePanel extends UMLObject {

	public UseCasePanel(int x, int y) {
		super();
		this.setPreferredSize(new Dimension(80, 50));
		this.setBounds(x, y, 80, 40);
//		this.setBorder(BorderFactory.createLineBorder(Color.black));
//		this.setBackground(new Color(238, 238, 238, 255));
		
		JLabel useText = new JLabel("use");
		useText.setHorizontalAlignment(JLabel.CENTER);
		useText.setVerticalAlignment(JLabel.CENTER);
		this.add(useText);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// draw circle
		super.paintComponent(g);
		g.setColor(Color.orange);
        g.fillOval(0, 0, this.getWidth(), this.getHeight());
	}
}
