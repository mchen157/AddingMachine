/**
 * @author Michaela Chen
 */
package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history;
  
	/**
	 * This construct the calculator, initializing the total to 0 and history to total, which is 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity	
		history = "" + total;
	}
	
	/**
	 * This returns the current total for the calculator
	 * @return total the current total for the calculator
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This is the add method. It adds value to the current total and updates history
	 * @param value the value to be added to total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * This is the subtract method.  It subtracts value from the current total and updates history
	 * @param value the value to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;	
		history += " - " + value;
	}
	
	/**
	 * This shows the history, starting from the initial value "0" and includes the operations and values inputed
	 * @return the history of the calculator as a String
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * This resets total to zero and history back to zero as well.
	 */
	public void clear() {
		total = 0;	
		history = "" + total;
	}
}