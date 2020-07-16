
public class Employee implements Comparable {

	String name;
	int eid;

	Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
public String toString() {
	return name + " " + eid;
}
	@Override
	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employee e = (Employee) obj;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;}

			if (eid1 > eid2) {
				return 1;
			}

			else {
				return 0;
			}

			// TODO Auto-generated method stub
	
}
}