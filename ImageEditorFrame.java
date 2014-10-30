import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*; 
public class ImageEditorFrame extends JFrame{ 
// HINZUGEFÜGT von BOB
	private void createMenuBar(){ 
			JMenuBar menuBar = new JMenuBar(); setJMenuBar(menuBar); JMenu menuFile = new JMenu("File"); menuBar.add(menuFile); JMenuItem menuItemOpen = new JMenuItem("Open"); menuFile.add(menuItemOpen); menuItemOpen.addActionListener( new ActionListener() {
			Prüfen Sie den bisherigen Zwischenstand: Darstellung eines leeren Fensters ohne Titel
			public void actionPerformed(ActionEvent e){
			onOpen();
			}
		}
	);
}
private void onOpen(){
JOptionPane.showMessageDialog(this, "Open Selected");
}
	public static void main (String []args) {
public ImageEditorFrame(){ 
JFrame frame = new Jframe("Titel");
setDefaultCloseOperation(EXIT_ON_CLOSE); 
setSize(400, 300); 
setVisible(true); 
} 
}
}