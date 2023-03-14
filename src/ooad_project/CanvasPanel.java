package ooad_project;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D.Double;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;


public class CanvasPanel extends JPanel implements MouseListener {
	private JLabel canvasText;
//	private ArrayList<JPanel> classUsePanels = new ArrayList<JPanel>();
	private ArrayList<UMLConnection> connections = new ArrayList<UMLConnection>();
	
	private boolean pressedInUMLObj;
	private UMLObject source, dest;
	private Point srcPoint, destPoint;
//	private String srcAt, destAt;
//	private String[] dirs = {"top", "right", "bottom", "left"};
	
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
			UMLObject aClassJPanel = new ClassPanel();
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
		// source point of line
		if (Main.mode == "assoc" || Main.mode == "gen" || Main.mode == "compo") {
			srcPoint = e.getPoint();
//			System.out.println("src point before: " + srcPoint);
			Component component = this.getComponentAt(srcPoint);
			if (component instanceof UMLObject) {
				source = (UMLObject)component;
				srcPoint = findNearestMidPoint(srcPoint, (UMLObject)component);
//				System.out.println("src point after: " + srcPoint);
				pressedInUMLObj = true;
			}
			else {
				pressedInUMLObj = false;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (pressedInUMLObj == false) return;
		
		// destination point of line
		if (Main.mode == "assoc" || Main.mode == "gen" || Main.mode == "compo") {
			destPoint = e.getPoint();
			Component component = this.getComponentAt(destPoint);
			if (component instanceof UMLObject) {
				dest = (UMLObject)component;
				destPoint = findNearestMidPoint(destPoint, (UMLObject)component);
				if (Main.mode == "assoc") {
					UMLConnection assocLine = new AssocLine(source, dest, srcPoint, destPoint);
					connections.add(assocLine);
				}
				else if (Main.mode == "gen") {
					UMLConnection genLine = new GenLine(source, dest, srcPoint, destPoint);
					connections.add(genLine);
				}
				else {
					UMLConnection compoLine = new CompositionLine(source, dest, srcPoint, destPoint);
					connections.add(compoLine);
				}
				repaint();
			}
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
		
		if (Main.mode == "assoc" || Main.mode == "gen" || Main.mode == "compo") {
			for (UMLConnection c : connections) {
				c.drawLine(g);
			}
		}
	}
	
	public Point findNearestMidPoint(Point p, UMLObject obj) {
		// find minimum distance of p to mid point
		
		obj.calcuMidPoints();
		ArrayList<Point> mids = obj.getMidPoints();
		
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
}
