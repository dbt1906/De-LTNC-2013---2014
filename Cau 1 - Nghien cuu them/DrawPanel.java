package Cau1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class DrawPanel extends JPanel  {
	DrawPanel(){
		this.setSize(500,320);
		this.setBackground(Color.yellow);
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Shape shape : Controller.shapeList) {
			int x0=shape.getX0();
			int y0=shape.getY0();
			int x1=shape.getX1();
			int y1=shape.getY1();
			String shapeName = shape.getShape();
			if (shapeName.equals("Line"))
			g.drawLine(x0,y0,x1,y1);
			else if(shapeName.equals("Rectangle")){
				g.drawRect(Math.min(x0,x1), Math.min(y0, y1), Math.abs(x0-x1),Math.abs(y0-y1));;
			}
			else if(shapeName.equals("Elip")){
				g.drawOval(Math.min(x0,x1), Math.min(y0, y1), Math.abs(x0-x1),Math.abs(y0-y1));
			}
		}
		
	}

}
