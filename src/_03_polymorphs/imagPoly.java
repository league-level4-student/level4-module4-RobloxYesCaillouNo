package _03_polymorphs;

import java.awt.Graphics;


public class imagPoly extends Polymorph{




	
	imagPoly(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
	
	g.drawImage(PolymorphWindow.img, x, y,WIDTH,HEIGHT, null);
	g.fillRect(x, y, WIDTH, HEIGHT);
	}

}
