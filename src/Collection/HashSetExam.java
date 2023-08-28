package Collection;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("유재석");
		set.add("지석진");
		set.add("김종국");
		set.add("송지효");
		set.add("하하");
		set.add("전소민");
		set.add("유재석");
		System.out.println(set);
		System.out.println("학생 수:"+set.size());
		
	}

}
