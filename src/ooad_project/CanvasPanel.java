package ooad_project;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;


public class CanvasPanel extends JPanel implements MouseListener {
	private JLabel canvasText;
	private ArrayList<JPanel> classUsePanels = new ArrayList<JPanel>();
	private JPanel source, dest;
	private Point srcPoint, destPoint;
	private String srcAt, destAt;
	private String[] dirs = {"top", "right", "bottom", "left"};
	
	public CanvasPanel() {
		this.setLayout(null);
		this.setVisible(true);
//		this.setBackground(Color.gray);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		
		canvasText = new JLabel("canvas");
		canvasText.setBounds(10, 10, 50, 50);
		this.add(canvasText);
		this.addMouseListener(this);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (Main.mode == "class") {
			// when mouse clicked, get class or use class panel xy-coord
//			System.out.println("mouse clicked. "+ e.getX() + " " + e.getY());
			JPanel aClassJPanel = new ClassPanel();
			this.add(aClassJPanel);
			aClassJPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			aClassJPanel.setBounds(e.getX(), e.getY(), 100, 150);
			
//			classUsePanels.add(aClassJPanel);
		}
		else if (Main.mode == "use case") {
			JPanel useCase = new UseCasePanel(e.getX(), e.getY());
			this.add(useCase);
			Color borderColor = this.getBackground();
			useCase.setBorder(BorderFactory.createLineBorder(borderColor));
			
//			classUsePanels.add(useCase);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (Main.mode == "assoc") {
			srcPoint = e.getPoint();
			System.out.println("src point before: " + srcPoint);
			JPanel component = (JPanel)this.getComponentAt(srcPoint);
			if (component != null) {
				source = component;
				srcPoint = findNearestMidPoint(srcPoint, component);
				System.out.println("src point after: " + srcPoint);
			}
		}
		else if (Main.mode == "gen") {
			
		}
		else if (Main.mode == "compo") {
			
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// mouse (x,y) stop the class or use case which we want to connect to
		
		if (Main.mode == "assoc") {
			destPoint = e.getPoint();
			JPanel component = (JPanel)this.getComponentAt(destPoint);
			if (component != null) {
				dest = component;
				destPoint = findNearestMidPoint(destPoint, component);
				repaint();
			}
		}
		else if (Main.mode == "gen") {
			
		}
		else if (Main.mode == "compo") {
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if (Main.mode == "assoc") {
			drawAssocLine(g);
		}
		else if (Main.mode == "gen") {
			
		}
		else if (Main.mode == "compo") {
			
		}
	}
	
	public Point findNearestMidPoint(Point p, JPanel obj) {
		// find minimum distance of p to mid point
		int width = obj.getWidth(), height = obj.getHeight();
		Point upperLeft = obj.getLocation();
		
		ArrayList<Point> mids = new ArrayList<Point>(4);
		mids.add(new Point(upperLeft.x + width / 2, upperLeft.y + 0)); // top
		mids.add(new Point(upperLeft.x + width, upperLeft.y + height / 2)); // right
		mids.add(new Point(upperLeft.x + width / 2, upperLeft.y + height)); // bottom
		mids.add(new Point(upperLeft.x + 0, upperLeft.y + height/2));  // left
		
		int minIdx = 0;
		double minVal = p.distance(mids.get(0));
		for (int i = 1; i < 4; i++) {
			double dist = p.distance(mids.get(i));
			if (dist < minVal) {
				minIdx = i;
				minVal = dist;
			}
		}
		
		return mids.get(minIdx);
	}
	
	private void drawAssocLine(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawLine(srcPoint.x, srcPoint.y, destPoint.x, destPoint.y);
		g2d.setStroke(new BasicStroke(20));
		
//		int sign;
//		if (srcPoint.x < destPoint.x) {
//			sign = 1;
//		}
//		
//		if (srcAt == "top") {
//			if (destAt == "top") {
//				g2d.drawLine(srcPoint.x, srcPoint.y, srcPoint.x, destPoint.y - 10);
//				g2d.drawLine(srcPoint.x, destPoint.y - 10, destPoint.x, destPoint.y - 10);
//				g2d.drawLine(destPoint.x, destPoint.y - 10, destPoint.x, destPoint.y);
//			}
//		}
//		else if (srcAt == "right") {
//			
//		}
//		else if (srcAt == "bottom") {
//			
//		}
//		else if (srcAt == "left") {
//			
//		}
	}
	
	private void drawGenLine(Graphics g) {
		
	}
	
	private void drawCompoLine(Graphics g) {
		
	}
}
