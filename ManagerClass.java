import java.util.ArrayList;

public class ManagerClass {
	//an array list for users
	static ArrayList<String> users = new ArrayList<String>() {
		{
			add("saman ahrari");
			add("bill gates");
			add("steve jobs");
			add("reza pishro");
			add("pourya arab");
			add("nill armestrong");
		}
	};
	//an array list for available books
	static ArrayList<String> availableBooks = new ArrayList<String>() {
		{
			add("David Copperfield");
			add("Java How to program");
			add("The railway children");
			add("Frankenstein");
			add("Oxford dictionary");
			add("504 AEW");
			add("1984");
		}
	};
	
	//an array list for borrowed books
	static ArrayList<String> borrowedBooks = new ArrayList<String>() {
		{
			add("The lord of the rings");
			add("Gone with the wind");
			add("think and grow");
			add("Beloved");
		}
	};
	
	//a function to add a user to user list
	public void addUser(String userName) {
		users.add(userName);
	}
	
	//a function to remove a user
	public void removeUser(String userName) {
		if(users.contains(userName)) {
			users.remove(users.indexOf(userName));
			System.out.println("removed.");
		} else {
			System.out.println("user doesnt exist.");
		}
	}
	
	//a function to remove a borrowed book and add that book to available books
	public void removeBorrowedBook(String book) {
		if(borrowedBooks.contains(book)) {
			availableBooks.add(book);
			borrowedBooks.remove(borrowedBooks.indexOf(book));
			System.out.println("borrowed book added successfully.");
		} else {
			System.out.println("borrowed book doesnt exist in borrowed books list.");
		}
	}
	
	//a function to add a new book to available books
	public void addBook(String book) {
		availableBooks.add(book);
		System.out.println("added.");
	}
	
	//a function to show users
	public void showUsers() {
		for (String user : users) {
			System.out.printf("%s%n", user);
		}
	}
	
	//a function to show available books
	public void showAvailableBooks() {
		for (String book : availableBooks) {
			System.out.printf("%s%n", book);
		}
	}
	
	//a function to show borrowed books
	public void showBorrowedBooks() {
		for (String book : borrowedBooks) {
			System.out.printf("%s%n", book);
		}
	}
}

//////////////////////////////////////////////////////////////////////////////////////
///Coded by saman ahrari with love and lot of interest in coding :)               ///
///Date: 2021/10/12                                                              ///
///////////////////////////////////////////////////////////////////////////////////
