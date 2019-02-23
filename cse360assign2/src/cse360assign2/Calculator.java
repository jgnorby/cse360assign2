package cse360assign2;

/**
 * @author	Jennifer Norby
 * @version	February 22, 2019
 */

/*
 * A simple calculator class that adds, subtracts, multiplies, divides,
 * and returns the history
 */
public class Calculator {
	
	private int total;
	
	/**
	 * Constructor	
	 */
	public Calculator () {
		total = 0;  // not needed  - included for clarity
	}
	
	/**
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Addition method - add value to total
	 * @param value
	 */
	public void add (int value) {
		total += value;
	}
	
	/**
	 * Subtraction method - subtracts value from total
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	 * Multiplication method - multiplies total by the value
	 * @param value
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	 * Division method - divides total by the value
	 * @param value
	 */
	public void divide (int value) {
		if ( value == 0 )
			total = 0;
		else
			total /= value;
	}
	
	/**
	 * @return history
	 */
	public String getHistory () {
		return "";
	}
}
