package Cau1;

public class Shape {
	private int x0,y0,x1,y1;
	String shape;
	/**
	 * @param x0
	 * @param y0
	 * @param x1
	 * @param y1
	 * @param shape
	 */
	public Shape(int x0, int y0, int x1, int y1, String shape) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.shape = shape;
	}
	public Shape(Shape that) {
		this.x0=that.x0;
		this.y0=that.y0;
		this.x1=that.x1;
		this.y1=that.y1;
		this.shape=that.shape;
		
	}
	/**
	 * @return the x0
	 */
	public int getX0() {
		return x0;
	}
	/**
	 * @param x0 the x0 to set
	 */
	public void setX0(int x0) {
		this.x0 = x0;
	}
	/**
	 * @return the y0
	 */
	public int getY0() {
		return y0;
	}
	/**
	 * @param y0 the y0 to set
	 */
	public void setY0(int y0) {
		this.y0 = y0;
	}
	/**
	 * @return the x1
	 */
	public int getX1() {
		return x1;
	}
	/**
	 * @param x1 the x1 to set
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}
	/**
	 * @return the y1
	 */
	public int getY1() {
		return y1;
	}
	/**
	 * @param y1 the y1 to set
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}
	/**
	 * @return the shape
	 */
	public String getShape() {
		return shape;
	}
	/**
	 * @param shape the shape to set
	 */
	public void setShape(String shape) {
		this.shape = shape;
	}
	
}
