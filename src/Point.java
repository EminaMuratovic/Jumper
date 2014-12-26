
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getDistance(Point other) {
		int result, dX, dY;
		dX = (this.x - other.x) * (this.x - other.x);
		dY = (this.y - other.y) * (this.y - other.y);
		result = (int)(Math.sqrt(dX + dY));
		
		return result;
		
	}
	
	public void move(int speedX, int speedY) {
		this.x += speedX;
		this.y += speedY;
	}

}
