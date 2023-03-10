package ooad_project;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ModesPanel extends JPanel {
	private int width = 200, height = 600;
	private JLabel selectText, assocLineText, genLineText, compoLineText, classText, useCaseText;
	private JButton selectBtn, assocLineBtn, genLineBtn, compoLineBtn, classBtn, useCaseBtn;
	
	ModesPanel() {
//		this.setPreferredSize(new Dimension(width, height));
		this.setLayout(new GridLayout(6, 2, 5, 5));
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
//        this.setBackground(Color.GRAY);
        
        selectText = new JLabel("select");
        selectBtn = new SelectBtn();
//        selectText.setSize(50, 50);
//        selectBtn.setSize(100, 50);
        this.add(selectText);
        this.add(selectBtn);
        
        assocLineText = new JLabel("association line");
        assocLineBtn = new AssocLineBtn();
//        assocLineText.setSize(50, 50);
//        assocLineBtn.setSize(100, 50);
        this.add(assocLineText);
        this.add(assocLineBtn);
        
        genLineText = new JLabel("genralization line");
        genLineBtn = new GenLineBtn();
//        genLineText.setSize(50, 50);
//        genLineBtn.setSize(100, 50);
        this.add(genLineText);
        this.add(genLineBtn);
        
        compoLineText = new JLabel("composition line");
        compoLineBtn = new CompoLineBtn();
//        compoLineText.setSize(50, 50);
//        compoLineBtn.setSize(100, 50);
        this.add(compoLineText);
        this.add(compoLineBtn);
        
        classText = new JLabel("class");
        classBtn = new ClassBtn();
//        classText.setSize(50, 50);
//        classBtn.setSize(100, 50);
        this.add(classText);
        this.add(classBtn);
        
        useCaseText = new JLabel("use case");
        useCaseBtn = new UseCaseBtn();
//        useCaseText.setSize(50, 50);
//        useCaseBtn.setSize(100, 50);
        this.add(useCaseText);
        this.add(useCaseBtn);
        
        
        this.setVisible(true);
	}
}
