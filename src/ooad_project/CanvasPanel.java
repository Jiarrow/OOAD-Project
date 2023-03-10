package ooad_project;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;


public class CanvasPanel extends JPanel implements MouseListener {
	private int width = 600, height = 600;
	private int classX, classY;
	private JLabel canvasText;
	private ArrayList<JPanel> classUsePanels;
	
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
			
			classUsePanels.add(aClassJPanel);
		}
		else if (Main.mode == "use case") {
			JPanel useCase = new UseCasePanel(e.getX(), e.getY());
			this.add(useCase);
			Color borderColor = this.getBackground();
			useCase.setBorder(BorderFactory.createLineBorder(borderColor));
			
			classUsePanels.add(useCase);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mouseX = e.getX(), mouseY = e.getY();
		if (Main.mode == "assoc") {
			
		}
		else if (Main.mode == "gen") {
			
		}
		else if (Main.mode == "compo") {
			
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
