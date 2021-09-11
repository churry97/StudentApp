package com.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String argsp[]) {
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruist List (ordered by name)");
		Fruit s1 = new Fruit(101,"Apple", 1000);
		fl.add(s1);
		Fruit s2 = new Fruit(102,"Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Mango", 2500));
		fl.add(new Fruit(105, "Mandarin", 3000));
		fl.add(new Fruit(106, "Strawberry", 3500));
		fl.add(new Fruit(107, "Melon", 4000));
		fl.add(new Fruit(108, "Peach", 4500));
		fl.add(new Fruit(109, "Watermelon", 5000));
		fl.add(new Fruit(1010, "Honeydew", 5500));

		
		Collections.sort(fl, new FruitComparator());
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for (int i = 0; i < fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}