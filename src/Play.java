import javax.swing.JFrame;


public class Play {
	public static void main(String[] args) {
		JFrame window = new JFrame("Game");
		window.setSize(500, 500);
		GameGraphics panel = new GameGraphics(500, 500);
		
		window.setContentPane(panel); 
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}
}
