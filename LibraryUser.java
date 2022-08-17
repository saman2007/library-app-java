//importing Scanner class
import java.util.Scanner;
public class LibraryUser {
	public static void main(String[] args) {
		//creating an instance from Scanner
		Scanner scanner = new Scanner(System.in);
		//everything except option that user enter
		String entered = "";
		//exit condition
		boolean exit = true;
		//for users option
		String option = "";
		//sign up form
		System.out.println("sign up form");
		System.out.print("enter your name and last name: ");
		entered = scanner.nextLine();
		//creating an instance with user class and with users name argument
		UserClass user = new UserClass(entered);
		System.out.printf("welcome %s%n", entered);
		System.out.println("**************************");
		//start the loop
		while(exit) {
			//options
			System.out.println("options:");
			System.out.println("1- show books");
			System.out.println("2- borrow a book");
			System.out.println("3- exit");
			System.out.print("choose your option:");
			option = scanner.nextLine();
			//checking users choose
			switch (option) {
				case "1":
					user.showAvailableBooks();
					break;
				case "2":
					System.out.print("enter your book name: ");
					entered = scanner.nextLine();
					user.borrow(entered);
					break;
				case "3":
					exit = false;
					break;
				default:
					System.out.println("not in options.");
					break;
			}
			System.out.println("**************************");
		}
		System.out.println("thanks for using. goodby!");
	}
}

//////////////////////////////////////////////////////////////////////////////////////
///Coded by saman ahrari with love and lot of interest in coding :)               ///
///Date: 2021/10/12                                                              ///
///////////////////////////////////////////////////////////////////////////////////