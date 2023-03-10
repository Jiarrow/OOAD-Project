package ooad_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AssocLineBtn extends JButton {
	public AssocLineBtn() {
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Main.mode = "assoc";
			}
		});
	}
}
