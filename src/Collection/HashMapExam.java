package Collection;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("유재석",10);
		map.put("박명수",5);
		map.put("김종국",3);
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("유재석"));
		
		map.remove("유재석");
		map.remove("유재석",5);
		
		for(String key:map.keySet()) {
			System.out.println(key);
		}
		for(String value:map.keySet()) {
			System.out.println(value);
		}
		for(String key:map.keySet()) {
			System.out.println("고객이름 :"+key+"초인트 :"+map.get(key));
		}
		
	}

}
