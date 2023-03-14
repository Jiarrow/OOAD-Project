package ooad_project;

import java.awt.Graphics;
import java.awt.Point;

public class UMLConnection {
	protected UMLObject srcObj, destObj;
	protected Point srcPoint, destPoint;
	
	public UMLConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public UMLConnection(UMLObject srcObj, UMLObject destObj, Point srcPoint, Point destPoint) {
		this.srcObj = srcObj;
		this.destObj = destObj;
		this.srcPoint = srcPoint;
		this.destPoint = destPoint;
	}
	
	public void drawLine(Graphics g) {
		
	}
	
	public void setSource(UMLObject srcObj, Point srcPoint) {
		this.srcObj = srcObj;
		this.srcPoint = srcPoint;
	}
	
	public void setDestination(UMLObject destObj, Point destPoint) {
		this.srcPoint = srcPoint;
		this.destPoint = destPoint;
	}
}
