package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePoly extends Polymorph{
int circle =  0;
	CirclePoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	
	}


	@Override
	public void update() {
	
		setX((int) (getX() + Math.cos(circle)* 100.00));
	
		setY( (int) (getY() + Math.sin(circle)* 100.00));
		circle++;
	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}

}
