package com.ust.ioc2;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
	System.out.println("from Point(x,y)");
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
