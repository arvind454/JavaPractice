import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author Arvind
 *
 */
public class Mapcount {
	
	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(2);
	list.add(3);
	list.add(2);
	list.add(3);
	
	
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(Integer temp : list) {
		
		Integer count = map.get(temp);
		map.put(temp, (count==null)?1 : count+1);
		
	}
	
	
	System.out.println(map);
	
}
}