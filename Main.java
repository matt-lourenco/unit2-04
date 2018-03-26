/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This program tests the stack class
 *
 ****************************************************************************/

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		//instantiate a stack object in order to test it's methods
		
		Random rand = new Random();
		
		Stack<Integer> stackObject = new Stack<Integer>();
		stackObject.push(rand.nextInt(21) + 1);
		stackObject.push(rand.nextInt(21) + 1);
		stackObject.push(rand.nextInt(21) + 1);
		stackObject.printContents();
		
		System.out.println("The last oject is " + stackObject.peek().toString());
		stackObject.clear();
		System.out.println("Stack was cleared");
		stackObject.printContents();
	}
}