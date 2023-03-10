package ooad_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SelectBtn extends JButton {
	public SelectBtn() {
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Main.mode = "select";
			}
		});
	}
}
