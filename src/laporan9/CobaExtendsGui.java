package laporan9;
import javax.swing.JFrame;
import javax.swing.JButton;

public class CobaExtendsGui extends JFrame{
	
	JButton button;
	
	public CobaExtendsGui() {
		super("Hallo");
		button = new JButton("Tes button");
		add(button);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	static CobaExtendsGui gui;
	
	public static void main(String args[]) {
		gui = new CobaExtendsGui();
	}
}
