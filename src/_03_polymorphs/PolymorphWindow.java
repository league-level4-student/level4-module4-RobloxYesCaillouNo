package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
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
   	 polymorphs.add(new BluePolymorph(50, 50));
   	 polymorphs.add(new RedMorph(100, 50));
   	 polymorphs.add(new MovingMorph(100, 50));
   	 polymorphs.add(new CirclePoly(70,111));
   	 polymorphs.add(new imagPoly(222, 111));
   	 polymorphs.add(new MouseFollowPoly(111,111));
   	 polymorphs.add(new JOptionPanePoly(222, 66));
   	 
   	 
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
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
}
