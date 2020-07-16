import java.util.Comparator;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee e1 = new Employee("Ajay" , 2);
		Employee e2 = new Employee("Vijay" , 9);
		Employee e3 = new Employee("Rakesh" , 5);
		Employee e4 = new Employee("Boy" ,10);
	TreeSet<Object> t  = new TreeSet<Object>();

	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	System.out.println(t);
	
	TreeSet<Object> t2  = new TreeSet<Object>(new Mycompartor());

	t2.add(e1);
	t2.add(e2);
	t2.add(e3);
	t2.add(e4);
	System.out.println("T2 " + t2);
}}
class Mycompartor implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}
	
	
}