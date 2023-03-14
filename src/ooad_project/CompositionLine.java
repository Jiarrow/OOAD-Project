package ooad_project;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class CompositionLine extends UMLConnection {
	public CompositionLine(UMLObject srcObj, UMLObject destObj, Point srcPoint, Point destPoint) {
		super(srcObj, destObj, srcPoint, destPoint);
	}
	
	@Override
	public void drawLine(Graphics g) {
		// TODO Auto-generated method stub
		super.drawLine(g);
		
		Graphics2D g2d = (Graphics2D)g;
		int x1 = srcPoint.x, y1 = srcPoint.y, x2 = destPoint.x, y2 = destPoint.y;
		g2d.setStroke(new BasicStroke(2));
		g2d.drawLine(x1, y1, x2, y2);
	}
}
