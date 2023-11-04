import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[]arrgs){
		Scanner lahiru = new Scanner(System.in);
		
		loginMenu();
		
}

//Login Menu
public static void loginMenu(){
	Scanner lahiru = new Scanner(System.in);
		
		System.out.println("                                     ---------------------------------         ");
		System.out.println("                                     |          Log In Menu           |        ");
		System.out.println("                                     ---------------------------------         ");
		System.out.println();
		System.out.println();
		
		/* username ---> Lahiru
		   passowrd ---> 1234  */
		   
		for (int i = 0; i<5; i++){		
		
		System.out.print("Enter user name : ");
		String username = lahiru.next();
		
		System.out.print("Enter password : ");
		String password = lahiru.next();
		
		if(username.equals("Lahiru") && password.equals("1234")){
			System.out.println("Log in Successful...");
			System.out.println();
			System.out.println();
			clearConsole();
			mainMenu();
		}else if(password.equals("1234")){
			System.out.println("Your username is wrong...Enter correct username and try again. ");
			System.out.println();
		}else if(i==4){
			System.out.println("System Lock Down...");
		}else if(username.equals("Lahiru")){
			System.out.println("Your password is wrong.Enter correct password and try again. ");
			System.out.println();
		}		
		}
	}
	
//Main Menu	
	public static void mainMenu(){
		Scanner lahiru = new Scanner(System.in);
		System.out.println("                               ----------------------------------------------------------------         ");
		System.out.println("                               |          Welcome To The Book Shop Management System          |        ");
		System.out.println("                               ----------------------------------------------------------------         ");
		System.out.println();
		System.out.println(); 
		
			System.out.print("[1] ADD BOOK"); System.out.print("                           "); System.out.print("[2] DELETE BOOK"); System.out.println();
			System.out.print("[3] UPDATE BOOK"); System.out.print("                        "); System.out.print("[4] SHOW ALL BOOK"); System.out.println();
			System.out.print("[5] LOG OUT"); System.out.print("                            "); System.out.print("[6] EXIT THE SYSTEM"); System.out.println();
			System.out.println();
			
			System.out.print("ENTER AN ANY OPTION : ");
			int mainMenuNumber = lahiru.nextInt();
			System.out.println();
		
			 if(mainMenuNumber==1){
				clearConsole();
				option1();
			}else if(mainMenuNumber==2){
				clearConsole();
				deleteMenu();
			}else if(mainMenuNumber==3){
				clearConsole();
				updateMenu();				
			}else if(mainMenuNumber==4){
				clearConsole();
				System.out.println("welcome 4st option");				
			}else if(mainMenuNumber==5){
				clearConsole();
				loginMenu();				
			}else if(mainMenuNumber==6){
				clearConsole();
				System.exit(0);
				}				
				
	}

		
//option 1 Menu
	public static String option1(){
		Scanner lahiru = new Scanner(System.in);
		
		System.out.println("                                     ------------------------------         ");
		System.out.println("                                     |          Add BOOK          |        ");
		System.out.println("                                     ------------------------------         ");
		System.out.println();
		System.out.println(); 
		
		int j=1;
				
		bookDetails[] books = new bookDetails[j];
		
		for(int n=0; n<books.length; n++){
		j++;
		books[n] = new bookDetails();
		
		System.out.print("Enter Book ID : ");
		books[n].BOOK_ID = lahiru.nextInt();
		
		System.out.print("Enter Book Name : ");
		books[n].BOOK_NAME = lahiru.next();
		
		System.out.print("Enter Book Price : ");
		books[n].BOOK_PRICE = lahiru.nextDouble();
		
		System.out.print("Enter Book qty : ");
		books[n].BOOK_QTY = lahiru.nextInt();
		
		System.out.print("Enter Book Authors : ");
		books[n].BOOK_AUTHORS = lahiru.next();
		 
		System.out.println("Successful add the book... ");
		System.out.println();
		
		System.out.print("You wont to add other Book? (Y/N) : ");
		String bookAdd = lahiru.next();
		String capBookAdd = bookAdd.toUpperCase();
		
		if(bookAdd.equals("Y")){
			System.out.println();
			System.out.println("************************************************************************************");
			System.out.println();
			option1MenuSecoundTime();			
		}else if(bookAdd.equals("N")){
			clearConsole();
			mainMenu();			
		}
		
		
		}
		return "bookdetails[]";
	}
	
	
//option 1 Menu second time
	public static String option1MenuSecoundTime(){
		Scanner lahiru = new Scanner(System.in);		
		int j=1;
		j++;
						
		bookDetails[] books = new bookDetails[j];
		
		for(int n=0; n<2; n++){
		
		books[n] = new bookDetails();
		
		System.out.print("Enter Book ID : ");
		books[n].BOOK_ID = lahiru.nextInt();
		
		System.out.print("Enter Book Name : ");
		books[n].BOOK_NAME = lahiru.next();
		
		System.out.print("Enter Book Price : ");
		books[n].BOOK_PRICE = lahiru.nextDouble();
		
		System.out.print("Enter Book qty : ");
		books[n].BOOK_QTY = lahiru.nextInt();
		
		System.out.print("Enter Book Authors : ");
		books[n].BOOK_AUTHORS = lahiru.next();
		 
		System.out.println("Successful add the book... ");
		System.out.println();
	    
	    System.out.print("You wont to add other Book? (Y/N) : ");
		String bookAdd = lahiru.next();
		String capBookAdd = bookAdd.toUpperCase();
		
		if(bookAdd.equals("Y")){
			System.out.println();
			System.out.println("************************************************************************************");
			System.out.println();
			option1MenuSecoundTime();			
		}else if(bookAdd.equals("N")){
			clearConsole();
			mainMenu();			
		}
	    }
	    
	    return "option1MenuSecoundTime";
	}
	
	
//Delete Book
	public static String deleteMenu(){
		Scanner lahiru = new Scanner(System.in);
		
		System.out.println("                                     ---------------------------------         ");
		System.out.println("                                     |          Delete BOOK          |        ");
		System.out.println("                                     ---------------------------------         ");
		System.out.println();
		System.out.println(); 
		
		System.out.print("Book Id : ");
		int deleteBookId = lahiru.nextInt();
		
		//for (int i = 0; i <bookDetails.length; i++){
			
		//}
		
		
		
		return "deleteBookId"; 
	}
	
//update Book
	public static String updateMenu(){
		Scanner lahiru = new Scanner(System.in);
		
		System.out.println("                                     ---------------------------------         ");
		System.out.println("                                     |          Update BOOK          |        ");
		System.out.println("                                     ---------------------------------         ");
		System.out.println();
		System.out.println(); 
		
		System.out.print("Book Id : ");
		int updateBookId = lahiru.nextInt();
		
		
		return "updateBookId"; 
	}
	
//update Book
	public static String showAllBookMenu(){
		Scanner lahiru = new Scanner(System.in);
		
		System.out.println("                                     ------------------------------------         ");
		System.out.println("                                     |          Show All Books          |        ");
		System.out.println("                                     ------------------------------------         ");
		System.out.println();
		System.out.println(); 
		
		//int booksDetails table = new booksDetails (5,3);
		
		return "showAllBookMenu";		
	}

		
		
//clear page
private final static void clearConsole() {
        final String os = System.getProperty("os.name");
        try {
            if (os.equals("Linux")) {
                System.out.print("\033\143");
            } else if (os.equals("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
//handle the exception
            System.err.println(e.getMessage());
          }
        }

}



//BOOK ADD CLASS
class bookDetails{
	int BOOK_ID;
	String BOOK_NAME;
	double BOOK_PRICE;
	int BOOK_QTY;
	String BOOK_AUTHORS;
	
	//setters
	public void setBok_Id(int BOOK_ID){
		this.BOOK_ID = BOOK_ID;
	}
	
	//getters
	public int getBook_Id(){
		return BOOK_ID;
	}
	
	}

