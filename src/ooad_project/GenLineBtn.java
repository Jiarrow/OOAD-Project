package ooad_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GenLineBtn extends JButton {
	public GenLineBtn() {
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// change mode
				Main.mode = "gen";
			}
		});
	}
}
