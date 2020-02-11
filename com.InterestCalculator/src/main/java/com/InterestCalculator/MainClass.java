package com.InterestCalculator;

public class MainClass {
	
	public static void main(String args[])
	{
	View view=new View();
	Model m=new Model();
	Controller c=new Controller(view,m);
	view.setVisible(true);
}
}