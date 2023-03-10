package ooad_project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UseCaseBtn extends JButton {
	public UseCaseBtn() {
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// change mode text
				Main.mode = "use case";
			}
		});
	}
}
