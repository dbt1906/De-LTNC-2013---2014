package Cau1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Controller implements ActionListener, MouseListener, MouseMotionListener {
	View view;
	static String shape="";
	boolean isDraw=false;
	
	static Shape shapeModule;
	static ArrayList<Shape> shapeList;
	public Controller(View view) {
		shapeModule = new Shape(0,0,0,0, "");
		shapeList = new ArrayList<Shape>();
		shapeList.add(shapeModule);
		this.view=view;
		this.view.elipBtn.addActionListener(this);
		this.view.lineBtn.addActionListener(this);
		this.view.recBtn.addActionListener(this);
		this.view.drawPanel.addMouseListener(this);
		this.view.drawPanel.addMouseMotionListener(this);
					}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==view.elipBtn){
			shapeModule.setShape("Elip");
			view.shapeName=shapeModule.getShape();
			view.statusLabel.setText("Status: "+shapeModule.getShape());
			System.out.println("Elip");
		}
		else if (e.getSource()==view.lineBtn){
			shapeModule.setShape("Line");
			view.shapeName=shapeModule.getShape();
			view.statusLabel.setText("Status: "+shapeModule.getShape());
			System.out.println("Line");
		}
		else if (e.getSource()==view.recBtn){
			shapeModule.setShape("Rectangle");
			view.statusLabel.setText("Status: "+shapeModule.getShape());
			System.out.println("Rectangle");
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(isDraw) {
			shapeList.add(new Shape(shapeModule));
			view.drawPanel.repaint();}
		else {
			shapeModule.setX0(e.getX());
			shapeModule.setY0(e.getY());
		}
		isDraw=!isDraw;
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
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
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		if(isDraw) {
			shapeModule.setX1(e.getX());
			shapeModule.setY1(e.getY());
			String status="Status: "+shapeModule.getShape()+"   ["+shapeModule.getX0()+":"+shapeModule.getY0()+"]    ["+shapeModule.getX1()+":"+shapeModule.getY1()+"]";
			view.statusLabel.setText(status);
			view.drawPanel.repaint();
		
		}
	}
}
