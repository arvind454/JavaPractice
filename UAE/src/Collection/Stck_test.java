package Collection;

import java.util.Stack;

public class Stck_test {

	//pushing element on top of the stack
	static void stac_Push(Stack<Integer>  stk) {
		
	for(int i=0 ; i<5; i++) {
		stk.push(i);           
	}
	}
//poping element from stack
static void stack_pop(Stack<Integer>  stk) {
	
	System.out.println("pop");
	for(int i=0 ; i<5; i++) {
		Integer y =stk.pop() ;  
		System.out.println("value  " + y);
		
		
	}
}
public static void main(String[] args) {
	
	Stack<Integer> st = new Stack<>();
	stac_Push(st);
	stack_pop(st);


}}
