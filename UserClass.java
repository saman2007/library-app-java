
public class UserClass extends ManagerClass {
	//UserClass constructor
	public UserClass(String name) {
		users.add(name);
	}
	
	//a function to borrow a book
	public void borrow(String book) {
		if(availableBooks.contains(book)) {
			availableBooks.remove(availableBooks.indexOf(book));
			borrowedBooks.add(book);
			System.out.println("done!");
		} else {
			System.out.println("your book doesnt exist in library.");
		}
	}
}


//////////////////////////////////////////////////////////////////////////////////////
///Coded by saman ahrari with love and lot of interest in coding :)               ///
///Date: 2021/10/12                                                              ///
///////////////////////////////////////////////////////////////////////////////////
