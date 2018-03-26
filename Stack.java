/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Mar 2018
 * This class is a blueprint for a stack
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<Type> {
	//this is a class that defines a stack
	private ArrayList<Type> list = new ArrayList<Type>();
	
	public void push(Type object) {
		//append an object to the end of the stack
		list.add(object);
	}
	
	public Type pop() {
		//pop the last object from the stack and return it
		if(list.size() == 0) {
			throw new EmptyStackException();
		}
		
		Type value = list.get(list.size() - 1);
		list.remove(value);
		return value;
	}
	
	public Type peek() {
		//This method returns the last item in the array without removing it
		if(list.size() == 0) {
			throw new EmptyStackException();
		}
		return list.get(list.size() - 1);
	}
	
	public void clear() {
		//This method clears the list
		list.clear();
	}
	
	public Type getAt(int index) {
		//This method returns the item at the given index
		return list.get(index);
	}
	
	public void printContents() {
		//This method prints a string version of the array
		System.out.println(list.toString());
	}
}