import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Smily extends JFrame{

	public Smily(int heigth, int width)
	{
		super.setTitle("Smily");
		super.setSize(heigth, width);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocationRelativeTo(null);
	}


	public static void main(String[] args)
	{
		new Smily(500, 500);
	}

	public void paint(Graphics g)
	{
		//g.drawArc(100, 100, 200, 200, 100, 360);
		g.setColor(Color.YELLOW);
		g.fillArc(100, 100, 200, 200, 0, 360);
		
		g.setColor(Color.BLUE);
		g.fillArc(140, 150, 50, 50, 0, 360);
		g.fillArc(220, 150, 50, 50, 0, 360);
		
		g.setColor(Color.red);
		g.drawArc(160, 180, 90, 90, 200, 140);
	}
}
