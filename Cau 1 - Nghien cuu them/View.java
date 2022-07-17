package Cau1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class View extends JFrame {
	JButton lineBtn,elipBtn,recBtn;
	JPanel statusPanel;
	DrawPanel drawPanel;
	JToolBar shapeToolBar;
	JLabel statusLabel;
	String shapeName="";
	public View() {
		init();
		initToolBar();
		initDrawPanel();
		initStatusPanel();
		this.setVisible(true);
	}
	private void initDrawPanel() {
		drawPanel = new DrawPanel();
		this.add(drawPanel,BorderLayout.CENTER);
		
	}
	public void initStatusPanel() {
		statusPanel = new JPanel();
		statusPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		statusLabel = new JLabel("Status: "+shapeName);
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		this.add(statusPanel,BorderLayout.SOUTH);
		
	}
	public void initToolBar() {
		shapeToolBar = new JToolBar();
		lineBtn = new JButton("Line");
		elipBtn = new JButton("Elip");
		recBtn = new JButton("Rectangle");
		shapeToolBar.add(lineBtn);
		shapeToolBar.add(elipBtn);
		shapeToolBar.add(recBtn);
		this.add(shapeToolBar,BorderLayout.NORTH);
					}
	
	public void init() {
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Ve hinh");
		this.setLayout(new BorderLayout());
	}
	
}
