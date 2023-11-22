package core;

import java.util.ArrayList;
import java.util.List;

public class Stack implements IStack {
	
	private List<Object> elements;
	private int capacity;
 
    public Stack() {
        elements = new ArrayList<>();
        capacity = 10	;
    }
 
	@Override
	public boolean isEmpty() {
		return elements.isEmpty();
	}
 
	@Override
	public int getSize() {
		return elements.size();
	}
	 @Override
	 public void push(Object elm) {
	        if (!isFull()) {
	            elements.add(elm);
	        } else {
	            System.out.println("Stack is full. Cannot push element.");
	        }
	 }
	 @Override
	 public boolean isFull() {
	        return getSize() >= capacity;
	 }
	 @Override
	 public Object Top() {
	        if (!isEmpty()) {
	            return elements.get(getSize() - 1);
	        } else {
	            return null; 
	    }
 
	 }

	
}
