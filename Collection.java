
import java.util.*;
public class Collection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(40);
		al.add(12);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<String> s = new HashSet<String>();
		s.add("Ram");
		s.add("Vivek");
		s.add("Varsha");
		s.add("Ram");
		Iterator itr1 = s.iterator();
		System.out.println("Set values : "+s);
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		Map<String,Integer> m = new HashMap<>();
		m.put("Ramu",17);
		m.put("Shreya", 78);
		m.put("Ramya", 34);
		System.out.println("Map Values : ");
		for(Map.Entry<String,Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		

	}

}
