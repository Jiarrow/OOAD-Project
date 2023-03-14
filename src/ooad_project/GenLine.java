package ooad_project;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class GenLine extends UMLConnection {
	public GenLine(UMLObject srcObj, UMLObject destObj, Point srcPoint, Point destPoint) {
		super(srcObj, destObj, srcPoint, destPoint);
	}
	
	@Override
	public void drawLine(Graphics g) {
		// TODO Auto-generated method stub
		super.drawLine(g);
		
		Graphics2D g2d = (Graphics2D)g;
		int x1 = srcPoint.x, y1 = srcPoint.y, x2 = destPoint.x, y2 = destPoint.y;
		int dx = x2 - x1, dy = y2 - y1;
		double theta = Math.atan2(dy, dx);
		int triangleH = 10;
		int x3 = (int) (x2 - triangleH * Math.cos(theta));
		int y3 = (int) (y2 - triangleH * Math.sin(theta));
		g2d.setStroke(new BasicStroke(2));
		g2d.drawLine(x1, y1, x3, y3);
		
		// Draw triangle
//		int triangleEdge = (int) (triangleH / Math.pow(3, 0.5) * 2);
//		int tx1 = (int) (x2 - triangleEdge * Math.cos(theta - Math.PI / 6));
//		int ty1 = (int) (y2 - triangleEdge * Math.sin(theta - Math.PI / 6));
//		int tx2 = (int) (x2 - triangleEdge * Math.cos(theta + Math.PI / 6));
//		int ty2 = (int) (x2 - triangleEdge * Math.sin(theta + Math.PI / 6));
//		int[] xPoints = {x2, tx1, tx2};
//		int[] yPoints = {y2, ty1, ty2};
//		g2d.drawPolygon(xPoints, yPoints, 3);
	}
}
