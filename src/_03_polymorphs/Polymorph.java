package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
  
	protected int x;
	protected int y;
	protected int WIDTH = 50;
	protected int HEIGHT= 50;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    protected int getX() {
    	return x;
    }
    protected void setX(int x) {
    	this.x = x;
    }
    protected int getY() {
    	return y;
    }
    protected void setY(int y) {
    	this.y = y;
    }
    public int getWidth() {
		return WIDTH;
		// TODO Auto-generated method stub
	}
	public void setWidth(int WIDTH) {
		this.WIDTH = WIDTH;
	}
	public int getHeight() {
		return HEIGHT;
		// TODO Auto-generated method stub
	}
	public void setHeight(int HEIGHT) {
		this.HEIGHT = HEIGHT;
	}
    public void update() {
	}
    
    public abstract void draw(Graphics g);
}
