package Collection;

import java.util.ArrayList;
import java.util.Iterator;
public class iteratirExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		list.add("지석진");
		list.add("ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		list.add("송지효");
		list.add("하하");
		
		System.out.println(list);
		System.out.println("----------------------");
		
		Iterator<String> it = list.iteratir();
		
		
	}

}
