package ooad_project;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;

public class AssocLine extends UMLConnection {
	public AssocLine(UMLObject srcObj, UMLObject destObj, Point srcPoint, Point destPoint) {
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
		// Draw arrow
		int dx = x2 - x1, dy = y2 - y1;
		double angle = Math.atan2(dy, dx);
		int arrowSize = 10;
		int x3 = (int)(x2 - arrowSize * Math.cos(angle - Math.PI/4));
		int y3 = (int)(y2 - arrowSize * Math.sin(angle - Math.PI/4));
		g2d.drawLine(x2, y2, x3, y3);
		int x4 = (int)(x2 - arrowSize * Math.cos(angle + Math.PI/4));
		int y4 = (int)(y2 - arrowSize * Math.sin(angle + Math.PI/4));
		g2d.drawLine(x2, y2, x4, y4);
		
//		ArrayList<Point> path = new ArrayList<Point>();
//		path.add(srcPoint);
//		
//		// 每個邊的中點垂直往上的那點
//		Point outSrcPoint = new Point(srcPoint), outDestPoint = new Point(destPoint);
//		int lineIdx = -1;
//		int offset = 10;
//		if (srcAt == "left") {
//			outSrcPoint.x -= offset;
//			lineIdx = 0;
//		}
//		else if (srcAt == "top") {
//			outSrcPoint.y -= offset;
//			lineIdx = 1;
//		}
//		else if (srcAt == "right") {
//			outSrcPoint.x += offset;
//			lineIdx = 2;
//		}
//		else if (srcAt == "bottom") {
//			outSrcPoint.y += offset;
//			lineIdx = 3;
//		}
//		
//		if (destAt == "left") {
//			outDestPoint.x -= offset;
//		}
//		else if (destAt == "top") {
//			outDestPoint.y -= offset;
//		}
//		else if (destAt == "right") {
//			outDestPoint.x += offset;
//		}
//		else if (destAt == "bottom") {
//			outDestPoint.y += offset;
//		}
//		
//		path.add(outSrcPoint);
//		
//		// 起點和終點 class Panel 邊界四條線
//		ArrayList<Line2D> srcLines = new ArrayList<Line2D>(4);
//		ArrayList<Line2D> destLines = new ArrayList<Line2D>(4);
//
//		Rectangle srcBounds = source.getBounds();
//		double x = srcBounds.getX();
//	    double y = srcBounds.getY();
//	    double w = srcBounds.getWidth();
//	    double h = srcBounds.getHeight();
//		srcLines.add(new Line2D.Double(x, y, x, y + h)); // left
//		srcLines.add(new Line2D.Double(x, y, x + w, y)); // top
//		srcLines.add(new Line2D.Double(x + w, y, x + w, y + h)); // right
//		srcLines.add(new Line2D.Double(x + w, y + h, x, y + h)); // bottom
//		
//		Rectangle destBounds = dest.getBounds();
//		x = destBounds.getX();
//	    y = destBounds.getY();
//	    w = destBounds.getWidth();
//	    h = destBounds.getHeight();
//	    destLines.add(new Line2D.Double(x, y, x, y + h)); // left
//	    destLines.add(new Line2D.Double(x, y, x + w, y)); // top
//	    destLines.add(new Line2D.Double(x + w, y, x + w, y + h)); // right
//	    destLines.add(new Line2D.Double(x + w, y + h, x, y + h)); // bottom
//	    
//	    
//	    Rectangle padingOfSrc = new Rectangle(source.getLocation().x - offset, source.getLocation().y - offset, source.getWidth() + 2*offset, source.getHeight() + 2 * offset);
//	    Point curS = outSrcPoint, curD = outDestPoint;
//	    Line2D srcToDest = new Line2D.Double(curS, curD);
//	    while (srcToDest.intersects(srcBounds)) {
//	    	Line2D b = srcLines.get(lineIdx);
//	    	int dir = 1;
//	    	if (b.getP1().getY() == b.getP2().getY()) {
//	    		if (curD.x < curS.x) dir = -1;
//	    		curS.x += dir * (source.getWidth() / 2 + offset);
//	    		lineIdx += dir;
//	    	}
//	    	else {
//	    		if (curD.y < curS.y) dir = -1;
//	    		curS.y += dir * (source.getHeight() / 2 + offset);
//	    		lineIdx += -1*dir;
//	    	}
//	    	srcToDest.setLine(curS, curD);
//	    	path.add(new Point(curS));
//	    }
//	    
//	    while (srcToDest.intersects(destBounds)) {
//	    	
//	    }
	}
}
