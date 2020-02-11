package com.InterestCalculator;


public class Model {
	
	public double calculateSI(double p,double r,double t)
	{
		return ((p*r*t)/100);
	}
	
	public double calculateCI(double p,double r,double t,int n)
	{
		double a=p*Math.pow((1+(r/(n*100))),(n*t));
		return (a-p);
	}
}

