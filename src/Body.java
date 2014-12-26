import java.awt.Color;
import java.awt.Graphics;


public class Body {
	private Point start;
	private Point center;
	private int width;
	private int heigth;
	private Color color;
	private int speedX;
	private int speedY;
	
	public Body(int x, int y, int width, int height, Color color, int speedX, int speedY) {
		this.start = new Point(x, y);
		this.width = width;
		this.heigth = height;
		this.color = color;
		this.center = new Point(x + width / 2, y + height / 2);
		this.speedX = speedX;
		this.speedY = speedY;
	}
	
	public void draw(Graphics g) {
		move();
		g.setColor(color);
		return;
	}
	
	public boolean checkCollision(Body other) {
		int a, b, c, d;
		int dis = this.center.getDistance(other.center);
		
		a = this.heigth / 2;
		b = other.heigth / 2;
		c = this.width / 2;
		d = other.width / 2;
		
		if(dis > a + b && dis > c + d)
			return false;
		return true;
	}
	
	public Point getStart() {
		return start;
	}

	public int getWidth() {
		return width;
	}

	public int getHeigth() {
		return heigth;
	}

	private void move() {
		 this.start.move(speedX, speedY);
		 this.center.move(speedX, speedY);
		 
	}
	
	public int getX() {
		return start.getX();
	}
	
	public int getY() {
		return start.getY();
	}
	
}
