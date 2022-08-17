// importing Scanner class
import java.util.Scanner;
public class LibraryManager {
	public static void main(String[] args) {
		//creating an instance from some classes
		ManagerClass manage = new ManagerClass();
		Scanner scanner = new Scanner(System.in);
		//welcome user
		System.out.println("Welcome Mr/Mrs manager");
		//a var for users option, and everything except option and exit condition
		String option = "";
		String enter = "";
		boolean exit = true;
		//almost infinity loop
		while(exit) {
			//options
			System.out.println("options:");
			System.out.println("1- remove a user");
			System.out.println("2- add a book from borrowed books to available books");
			System.out.println("3- add a new book");
			System.out.println("4- see users");
			System.out.println("5- see available books");
			System.out.println("6- see borrowed books");
			System.out.println("7- exit");
			System.out.print("choose your option:");
			option = scanner.nextLine();
			//checking users entered option
			switch (option) {
			case "1":
				System.out.print("enter the user name that you want to remove: ");
				enter = scanner.nextLine();
				manage.removeUser(enter);
				break;
			case "2":
				System.out.print("enter the book name that user brought back: ");
				enter = scanner.nextLine();
				manage.removeBorrowedBook(enter);
				break;
			case "3":
				System.out.print("enter the book name: ");
				enter = scanner.nextLine();
				manage.addBook(enter);
				break;
			case "4":
				manage.showUsers();
				break;
			case "5":
				manage.showAvailableBooks();
				break;
			case "6":
				manage.showBorrowedBooks();
				break;
			case "7":
				exit = false;
				break;
			default:
				System.out.println("not in options.");
				break;
			}
			//end of the loop
			System.out.println("************************************************************************");
		}
		System.out.println("thanks for using. goodby!");
	}
}




//////////////////////////////////////////////////////////////////////////////////////
///Coded by saman ahrari with love and lot of interest in coding :)               ///
///Date: 2021/10/12                                                              ///
///////////////////////////////////////////////////////////////////////////////////
