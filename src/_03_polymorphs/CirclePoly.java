package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePoly extends Polymorph{

	CirclePoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void update() {
	x = (int) (x + Math.cos(360));
	y = (int) (y + Math.sin(360));

	}
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.MAGENTA);
		g.fillRect(x, y, WIDTH, HEIGHT);
	}

}
