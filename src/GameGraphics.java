import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class GameGraphics extends JPanel implements ActionListener {
	private Timer animation;
	Body[] elements;
	int elementsCount;
	int width;
	int height;
	
	public GameGraphics(int width, int height) {
		super();
		animation = new Timer(200, this);
		elements = new Body[3];
		elementsCount = 0;
		//samo radi debugging-a:
		elementsCount = 1;
		elements[0] = new Oval(0, 0, 20, 30, Color.RED, 3, 1);
		animation.start();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(new Color(184, 242, 245));
		g.setColor(new Color(54, 140, 22));
		g.fill3DRect(0, height - 100, width, 100, true);
		for(int i =0; i < elementsCount; i++) {
			elements[i].draw(g);
		}
	}
}
