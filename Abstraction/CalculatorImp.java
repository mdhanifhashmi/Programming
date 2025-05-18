package com;

class CalculatorImp implements Calculator{

	@Override //rule 3
	public void add( int x, int y) {
		System.out.println("Addition of two num "+x+" & "+y+": "+(x+y));
	}
	
	@Override //rule 3
	public void mul(int x, int y) {
		System.out.println("Multiplication of two num "+x+" & "+y+": "+(x*y));
	}
}
