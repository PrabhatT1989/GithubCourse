package CollectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	private static final int Entry = 0;

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer , String>();
		HashMap<Integer, String> hm1 = new HashMap<Integer , String>();
		
		
		hm.put(10, "Prabhat");
		hm.put(11, "Samir");
		
		hm1.putAll(hm);
		hm1.put(12, "Kuldeep");
		hm1.put(13, null);
		hm1.put(null, null);
		hm1.put(null, null) ;
		
		System.out.println(hm1.get(12));
		
		System.out.println("values of entry sets " + hm1.entrySet());
		
		System.out.println("values of hm1 " + hm1.values());
		
		System.out.println("hm object Contains key 10 " + hm.containsKey(10));
		
		System.out.println("hm object contains value" + hm.containsValue("Samir"));

		hm.replace(10, "VIkas");
		System.out.println("New hm pairs "+hm.entrySet());

		hm.remove(11, "Samir");
		
        hm.clear();

if(hm.isEmpty())
	System.out.println("thhe hm object is empty");
else 
	System.out.println(hm.entrySet());;
		
	
	Map<String, String> map = new HashMap<>();
	
	
	map.put("Prabhat", "Seawodds");
	map.put("Sujit", "Powai");
	map.put("Shubham", "Chalisgaav");
	
	Map<String, String> map1 = new HashMap<>();
	
	map1.putAll(map);
	map1.put("Honda", "Goldwing");
	map1.put("TVS", "200 race edition");
	map1.put("TVS", "200 race edition");
    System.out.println(map1.entrySet());

	//map1.remove("TVS");
	
	
	
	System.out.println(map1.keySet());
	
	System.out.println(map1.values());
	System.out.println("Does map1 contains value " + map1.containsValue("asd"));;
	
	System.out.println("Does map1 contains key TVS " + map1.containsKey("TVS"));;
	
	map1.clear();
	
	
	}

}
