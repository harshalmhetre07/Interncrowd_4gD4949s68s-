package com.Harshal;

public class main {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.PhoneBook.add(phone.nameList);
		phone.PhoneBook.add(phone.numList);
		
		phone.addName("Harshal","7058816272");
		phone.addName("Tanesh","7058817080");
		phone.addName("Prathmesh","7080816272");
		phone.addName("Akash","1235467483");
		phone.addName("Babu","5749386532");
		phone.addName("Yash","8694356734");
		phone.addName("Om","6759305683");
		
		System.out.println("phone.phoneBook");

		phone.search("Tanesh");
		
		phone.delete("Akash");
		
		phone.insert(5, "Satyam", "946378209");
		System.out.println("phone.phoneBook");
	}
}
