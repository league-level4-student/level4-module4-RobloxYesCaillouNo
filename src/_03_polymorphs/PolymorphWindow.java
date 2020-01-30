package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener,MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    public static BufferedImage img; 
    private JFrame window;
    private Timer timer; 
   
ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 polymorphs.add(new BluePolymorph(50, 50));
   	 polymorphs.add(new RedMorph(100, 50));
   	 polymorphs.add(new MovingMorph(100, 50));
   	 polymorphs.add(new CirclePoly(70,111));
   	 polymorphs.add(new imagPoly(222, 111));
   	 polymorphs.add(new MouseFollowPoly(111,111));
   	 polymorphs.add(new JOptionPanePoly(222, 66));
   	 
   	 
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
   
   	 try {
		img = ImageIO.read(this.getClass().getResourceAsStream("thing.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
   
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	for (Polymorph redPoly : polymorphs) {
   		redPoly.draw(g);
	}
   	 for (Polymorph bluePoly : polymorphs) {
		bluePoly.draw(g);
	}
   	 for (Polymorph movePoly : polymorphs) {
		movePoly.draw(g);
	}
   	 for (Polymorph CirclePoly : polymorphs) {
		CirclePoly.draw(g);
	}
   	 for (Polymorph MouseFollowPoly : polymorphs) {
		MouseFollowPoly.draw(g);
	}
   	 for (Polymorph imagPoly : polymorphs) {
   		 imagPoly.draw(g);
	}
   	 for (Polymorph JOptionPanePoly : polymorphs) {
		JOptionPanePoly.draw(g);
	}
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
    	for (Polymorph redPoly : polymorphs) {
       		 redPoly.update();
    	}
       	 for (Polymorph bluePoly : polymorphs) {
    		bluePoly.update();
    	}
       	 for (Polymorph movePoly : polymorphs) {
    		movePoly.update();
       	 }
       	 for (Polymorph CirclePoly : polymorphs) {
			CirclePoly.update();
		}
       	 for (Polymorph MouseFollowPoly : polymorphs) {
			MouseFollowPoly.update();
		}
       	 for (Polymorph imagPoly : polymorphs) {
			imagPoly.update();
		}
       	 for (Polymorph JOptionPanePoly : polymorphs) {
			JOptionPanePoly.update();
		}
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	polymorphs.get(5).setX(e.getX());
	polymorphs.get(5).setY(e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX() >= polymorphs.get(6).getX() && e.getY() >= polymorphs.get(6).getY() && e.getX() <=
				polymorphs.get(6).getWidth() && e.getY() <= polymorphs.get(6).getHeight()) {
			JOptionPane.showMessageDialog(null, "Congrats! You get absoultely nothing!");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
