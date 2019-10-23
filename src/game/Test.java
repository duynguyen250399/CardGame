package game;

import java.util.ArrayList;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String[] testList = {
				"2", "3", "4", "5", 
				"6", "7", "8", "9",
				"10", "J", "Q", "K", "A"
		};
		
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("J");
		list.add("Q");
		list.add("K");
		list.add("A");
		
		
		Random random = new Random();
		
//		for (int i = 0; i < testList.length; i++) {
//			int index = random.nextInt(testList.length); 
//			
//			String temp = testList[i];
//			testList[i] = testList[index];
//			testList[index] = temp;
//		}
		
		for (int i = 0; i < list.size(); i++) {
			int index = random.nextInt(list.size()); 
			String temp = list.get(i);
			list.set(i, list.get(index));
			list.set(index, temp);
		}
		
		for(String s : list) {
			System.out.print(s + " ");
		}
	}
}
