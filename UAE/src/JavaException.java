


class MyException extends Exception  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;
	MyException(int b){
	a=b;
	}
	public String toString() {
		return("My Exception " + a);
	}
		
	}
public class JavaException {
public static void main(String[] args) {
try {
	throw new MyException(1);
}
catch(MyException e) {System.out.println(e);}
}}