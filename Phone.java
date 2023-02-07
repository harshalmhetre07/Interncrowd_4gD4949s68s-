package com.Harshal;

import java.util.ArrayList;

public class Phone {
	ArrayList<ArrayList<String>> PhoneBook = new ArrayList<>();
	ArrayList<String> nameList = new ArrayList<>();
	ArrayList<String> numList = new ArrayList<>();

	public void addName(String n, String p) {
		nameList.add(n);
		numList.add(p);
	}

	public void insert(int j, String w, String q) {
		try {
			nameList.get(j);
			nameList.add(j, w);
			nameList.add(j, q);
		} catch (IndexOutOfBoundsException b) {
			System.out.println("No match found, try again");
		}
	}

	public void delete(String d) {
		for (int i = 0; i < nameList.size(); i++) {
			if (d.equals(nameList.get(i))) {
				nameList.remove(i);
				numList.remove(i);

			}
		}
	}

	public void search(String s) {
		try {
			for(int i=0;i<nameList.size();i++) {
				if(nameList.get(i).equals(s)) {
					System.out.println(s+ "'s contact found! \nNumber: "+numList.get(i));
					break;
				}
			}
		}
		catch(IndexOutOfBoundsException m) {
			System.out.println(s+"Not found");
		}
	}
}
