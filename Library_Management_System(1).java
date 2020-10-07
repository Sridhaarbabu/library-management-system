import java.util.Scanner; 
public class Library_Management_System(1)
{ 
 public void checklog( String username , String password){
	  String a="sameera";
	  String b="123456";
	  if( username.equals(a) && password.equals(b) ){
	    System.out.println("login successful");
	  }
	  else{
	    System.out.println("Loggin failed wrong id or password");
	  }
	}
 public static void main(String[] args) 
 { 
                String username,password;
		System.out.println("welcome to LIBRARY MANAGEMENT SYSTEM\n");
		System.out.println("Login Form\n");
		System.out.println("Select any one of option\n");
		System.out.println("1.Student login \n2.signup");
		System.out.println("NOTE:Enter numerical value for selecting option\n");
		Scanner S1= new Scanner(System.in);
		int option= S1.nextInt();
		S1.nextLine();
		program l=new program();
		if(option==1)
		{
		  System.out.println("Student Login\n");
	  	  System.out.println("Enter username:");
          	  username= S1.nextLine();
          	  System.out.println("Enter password:");
	  	  password= S1.nextLine();
		  l.checklog(username,password);
		}
		else if(option==2)
		{
		  String fullname, nation, address, n_username, n_password;
	          String age, phno;  
	  	  System.out.println("signup form");
	  	  System.out.println("Enter your fullname:");
	  	  fullname= S1.nextLine();
	  	  System.out.println("Enter your age:");
	  	  age= S1.nextLine();
	  	  System.out.println("Enter your nationality:");
	  	  nation= S1.nextLine();
	  	  System.out.println("Enter your address:");
	  	  address= S1.nextLine();
	  	  System.out.println("Enter phone number:");
	  	  phno= S1.nextLine();
	  	  System.out.println("create a new username:");
	  	  n_username= S1.nextLine();
	  	  System.out.println("enter a password:");
	  	  n_password= S1.nextLine();
	  	  System.out.println("Details saved successfully");
		}
		else{
		  System.out.println("wrong option failed to enter plz try again");		
		}	
{
 Library s= new LPU_Library(); 
 s.Main_Menu(); 
 } 
}
abstract class Library 
{ 
 abstract void Main_Menu(); 
} 
class LPU_Library extends Library 
{ 
 String Book_Name,Name; 
 int Book_ID,Reg_No; 
 Scanner s = new Scanner(System.in); 
 Scanner st = new Scanner(System.in); 
 void Sleep() 
 { 
 System.out.println("\n\tPress Any Character To Continue !!!"); 
 s.next(); 
 } 
 void Main_Menu() 
 { 
 System.out.println("\n\n\t\t\t\t* Welcome to Library_Menu!! *"); 
 System.out.println("\n1. New Book\n2. Issued Books\n3. Return\n"); 
 System.out.println("\tEnter your choice.......\t"); 
 int a = s.nextInt(); 
 switch (a) 
 { 
 case 1: 
 System.out.println("\n Press 1 to continue else press 2\n"); 
 int want=s.nextInt(); 
 switch (want) 
 { 
 case 1: 
 System.out.println("\n Available Books -> \n"); 
 System.out.println("1. Computer Networks\n2. Java Programming\n3. Basic Of Operating Systems\n4. Basics of Artifical Intelligence\n5. Basic Of Web Development\n6. Probability and Statistics\n");
 System.out.println("\nBorrower : "); 
 Name = st.nextLine(); 
 System.out.println(" UID : "); 
 try 
 { 
 Reg_No = s.nextInt(); 
 if (Reg_No <= 0) 
 throw new ArithmeticException("\nRegistration Number Should Not Be <= Zero\n"); 
 } 
 catch (Exception e1) 
 { 
 System.out.println("\nException Raise As : "+e1); 
 } 
 System.out.println("Book selected : "); 
 Book_Name = st.nextLine(); 
 System.out.println("Enter Book ID : "); 
 try 
 { 
 Book_ID = s.nextInt(); 
 if (Book_ID <=0) 
 throw new ArithmeticException("\nBook Id Should Not Be <= Zero\n"); 
 } 
 catch (Exception e) 
 { 
 System.out.println("\nException Raise As : "+e); 
 } 
 System.out.println("\n !!! Your Book Has Been Successful Issued From Library_Menu !!!\n"); 
 Sleep(); 
 Main_Menu(); 
 break; 
 case 2: 
 Sleep(); 
 Main_Menu(); 
 break; 
 default: 
 System.out.println("\n!!! Wrong Input, So please Try Again !!!\n"); 
 Sleep(); 
 Main_Menu(); 
 } 
 break; 
 case 2: 
class Library
{
	static String str,b,date;
	static int a,c;
	void add()
	{
		System.out.println("Enter book Name,Prize and Book_no" );
		Scanner obj2=new Scanner(System.in);
		String str=obj2.nextLine();
		float price=obj2.nextInt();
		int bookno=obj2.nextInt();
		System.out.println("your details is "+ str + price + bookno);
	}
	void iss()
	{
		Scanner obj3=new Scanner(System.in);
		System.out.println("Book Name");
		str=obj3.nextLine();
		System.out.println("Book_id");
		a=obj3.nextInt();
		obj3.nextLine();
		System.out.println("issue date");
		b=obj3.nextLine();
		System.out.println("total number of book Issued");
		c=obj3.nextInt();
		obj3.nextLine();
		System.out.println("Return book date");
		date=obj3.nextLine();
	}
	int getid()
	{
		return a;
	}
	
	void ret()
	{
		System.out.println("Enter Student_name & book_id");
		Scanner c =new Scanner(System.in);
		String name=c.nextLine();
		int bookid=c.nextInt();
		if(a==bookid)
		{
			System.out.println("Total Details");
			System.out.println("Book Name::"+Library.str);
			System.out.println("Book id ::" + Library.a);
			System.out.println("issue date::" + Library.b);
			System.out.println("total number of book Issued::" + Library.c);
			System.out.println("Book Return date::" + Library.date);
		}
		else
		{
			System.out.println("Wrong id, please enter correct id");
		}
	}
break;
  case 3: 
 System.exit(0); 
 default: 
 System.out.println("\n!!! Wrong Input, So please Try Again !!!\n"); 
 Sleep(); 
 Main_Menu(); 
 } 
 } 
} 