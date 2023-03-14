package ooad_project;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UMLMenu extends MenuBar {
	Menu file;
	Menu edit;
	
	public UMLMenu() {
		file = new Menu("File");
		this.add(file);
		
		edit = new Menu("Edit");
		MenuItem group = new MenuItem("Group");
		MenuItem unGroup = new MenuItem("UnGroup");
		MenuItem changeObjName = new MenuItem("Change Object Name");
		edit.add(group);
		edit.add(unGroup);
		edit.add(changeObjName);
		
		this.add(edit);
		
		changeObjName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ¶}±Ò¤pµøµ¡
				JFrame changeNameFrame = new JFrame();
				changeNameFrame.setLayout(new BorderLayout());
				changeNameFrame.setBounds(400, 150, 200, 100);
				changeNameFrame.setTitle("Change Object Name");
				changeNameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				JTextArea textArea = new JTextArea(1, 20);
				JButton OK = new JButton("OK");
				JButton cancel = new JButton("cancel");
				
				changeNameFrame.getContentPane().add(textArea, BorderLayout.NORTH);
				changeNameFrame.getContentPane().add(OK, BorderLayout.WEST);
				changeNameFrame.getContentPane().add(cancel, BorderLayout.CENTER);
				
				changeNameFrame.setVisible(true);
			}
		});
	}
}
