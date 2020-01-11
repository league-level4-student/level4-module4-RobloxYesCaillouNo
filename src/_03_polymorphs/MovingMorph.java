package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public void update() {
		x++;
		y++;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.GREEN);
		g.fillRect(x, y, WIDTH, HEIGHT);
	
	}
		
}
