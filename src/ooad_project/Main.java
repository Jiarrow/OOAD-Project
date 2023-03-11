package ooad_project;
import java.awt.*;
import javax.swing.*;

//class MyJFrame {
//	public static int win_width = 800, win_height = 700;
//	public static String mode = "";
//	private JFrame window;
//    private JPanel modesPane;
//    private JPanel canvas;
//    
//	public MyJFrame(){
//		window = new JFrame();
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setBounds(300, 100, win_width, win_height);
//		window.setTitle("UML editor");
//		window.setLayout(new BorderLayout());
//		
//        modesPane = new ModesPanel();
//        window.add(modesPane, BorderLayout.WEST);
//        
//        canvas = new CanvasPanel();
//        window.add(canvas, BorderLayout.CENTER);
//        
//        window.setVisible(true);
//    }
//    
//}

public class Main {
	public static int win_width = 800, win_height = 700;
	public static JFrame window;
	public static String mode = "";
    private static JPanel modesPane;
    private static JPanel canvas;
    
	public static void main(String[] args) {
		window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(300, 100, win_width, win_height);
		window.setTitle("UML editor");
		window.setLayout(new BorderLayout());
		
        modesPane = new ModesPanel();
        window.getContentPane().add(modesPane, BorderLayout.WEST);
//        window.add(modesPane, BorderLayout.WEST);
        
        canvas = new CanvasPanel();
        window.getContentPane().add(canvas, BorderLayout.CENTER);
//        window.add(canvas, BorderLayout.CENTER);
        
        window.setVisible(true);
	}

}
