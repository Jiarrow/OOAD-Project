package ooad_project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ModesPanel extends JPanel implements ActionListener {
	private int width = 200, height = 600;
	private JLabel selectText, assocLineText, genLineText, compoLineText, classText, useCaseText;
	private JButton selectBtn, assocLineBtn, genLineBtn, compoLineBtn, classBtn, useCaseBtn;
	private ButtonGroup buttonGroup;
	
	ModesPanel() {
//		this.setPreferredSize(new Dimension(width, height));
		this.setLayout(new GridLayout(6, 2, 5, 5));
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
//        this.setBackground(Color.GRAY);
        
        selectText = new JLabel("select");
        selectBtn = new JButton();
        selectBtn.addActionListener(this);
//        selectText.setSize(50, 50);
//        selectBtn.setSize(100, 50);
        this.add(selectText);
        this.add(selectBtn);
        
        assocLineText = new JLabel("association line");
        assocLineBtn = new JButton();
        assocLineBtn.addActionListener(this);
//        assocLineText.setSize(50, 50);
//        assocLineBtn.setSize(100, 50);
        this.add(assocLineText);
        this.add(assocLineBtn);
        
        genLineText = new JLabel("genralization line");
        genLineBtn = new JButton();
        genLineBtn.addActionListener(this);
//        genLineText.setSize(50, 50);
//        genLineBtn.setSize(100, 50);
        this.add(genLineText);
        this.add(genLineBtn);
        
        compoLineText = new JLabel("composition line");
        compoLineBtn = new JButton();
        compoLineBtn.addActionListener(this);
//        compoLineText.setSize(50, 50);
//        compoLineBtn.setSize(100, 50);
        this.add(compoLineText);
        this.add(compoLineBtn);
        
        classText = new JLabel("class");
        classBtn = new JButton();
        classBtn.addActionListener(this);
//        classText.setSize(50, 50);
//        classBtn.setSize(100, 50);
        this.add(classText);
        this.add(classBtn);
        
        useCaseText = new JLabel("use case");
        useCaseBtn = new JButton();
        useCaseBtn.addActionListener(this);
//        useCaseText.setSize(50, 50);
//        useCaseBtn.setSize(100, 50);
        this.add(useCaseText);
        this.add(useCaseBtn);
        
//        buttonGroup.add(selectBtn);
//        buttonGroup.add(assocLineBtn);
//        buttonGroup.add(genLineBtn);
//        buttonGroup.add(compoLineBtn);
//        buttonGroup.add(classBtn);
//        buttonGroup.add(useCaseBtn);
        
        this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// when button pressed, button color is changed to gray and set Mode
		Object source = e.getSource();
		if (source == selectBtn) {
			Main.mode = "select";
			selectBtn.setBackground(Color.LIGHT_GRAY);
			assocLineBtn.setBackground(null);
			genLineBtn.setBackground(null);
			compoLineBtn.setBackground(null);
			classBtn.setBackground(null);
			useCaseBtn.setBackground(null);
			System.out.println("select");
		}
		else if (source == assocLineBtn) {
			Main.mode = "assoc";
			selectBtn.setBackground(null);
			assocLineBtn.setBackground(Color.LIGHT_GRAY);
			genLineBtn.setBackground(null);
			compoLineBtn.setBackground(null);
			classBtn.setBackground(null);
			useCaseBtn.setBackground(null);
			System.out.println("association line");
		}
		else if (source == genLineBtn) {
			Main.mode = "gen";
			selectBtn.setBackground(null);
			assocLineBtn.setBackground(null);
			genLineBtn.setBackground(Color.LIGHT_GRAY);
			compoLineBtn.setBackground(null);
			classBtn.setBackground(null);
			useCaseBtn.setBackground(null);
			System.out.println("generation line");
		}
		else if (source == compoLineBtn) {
			Main.mode = "compo";
			selectBtn.setBackground(null);
			assocLineBtn.setBackground(null);
			genLineBtn.setBackground(null);
			compoLineBtn.setBackground(Color.LIGHT_GRAY);
			classBtn.setBackground(null);
			useCaseBtn.setBackground(null);
			System.out.println("composition line");
		}
		else if (source == classBtn) {
			Main.mode = "class";
			selectBtn.setBackground(null);
			assocLineBtn.setBackground(null);
			genLineBtn.setBackground(null);
			compoLineBtn.setBackground(null);
			classBtn.setBackground(Color.LIGHT_GRAY);
			useCaseBtn.setBackground(null);
			System.out.println("class");
		}
		else if (source == useCaseBtn) {
			Main.mode = "use case";
			selectBtn.setBackground(null);
			assocLineBtn.setBackground(null);
			genLineBtn.setBackground(null);
			compoLineBtn.setBackground(null);
			classBtn.setBackground(null);
			useCaseBtn.setBackground(Color.LIGHT_GRAY);
			System.out.println("use case");
		}
	}
}
