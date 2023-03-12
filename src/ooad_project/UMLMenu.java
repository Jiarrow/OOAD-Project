package ooad_project;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JPanel;

public class UMLMenu extends MenuBar{
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
	}
}
