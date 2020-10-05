/**
 * @author Michaela Chen
 */
package cse360assignment02;

public class AddingMachine {
	private int total;
  
	/**
	 * This construct the calculator, initializing the total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity	
	}
	
	/**
	 * This returns the current total for the calculator
	 * @return 0 the initial total for the calculator
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * This is the add method
	 * @param value the value to be added to total
	 */
	public void add (int value) {
	}
	
	/**
	 * This is the subtract method
	 * @param value the value to be subtracted from total
	 */
	public void subtract (int value) {
	}
	
	/**
	 * This shows the history, starting from the initial value "0" and includes the operations and values inputted
	 * @return the history of the calculator as a String
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * This resets total to zero
	 */
	public void clear() {
	}
}