package ooad_project;

import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class UMLObject extends JPanel {
	protected ArrayList<Point> midPoints = new ArrayList<Point>(4);
	protected boolean isSelected;
	protected boolean[] isUsed = {false, false, false, false};
	
	public UMLObject() {
		super();
	}
	
	public UMLObject(GridLayout gridLayout) {
		super(gridLayout);
	}

	public void calcuMidPoints() {
		int width = this.getWidth(), height = this.getHeight();
		Point upperLeft = this.getLocation();
		
		midPoints.add(new Point(upperLeft.x + 0, upperLeft.y + height/2));  // left
		midPoints.add(new Point(upperLeft.x + width / 2, upperLeft.y + 0)); // top
		midPoints.add(new Point(upperLeft.x + width, upperLeft.y + height / 2)); // right
		midPoints.add(new Point(upperLeft.x + width / 2, upperLeft.y + height)); // bottom
	}
	
	public ArrayList<Point> getMidPoints() {
		return midPoints;
	}
}
