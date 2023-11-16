// import java.util.*;

// // public class practice {
// //     public static void main(String[] args) {
// //         String name = "sai";
// //         int rollno = 58;
// //         long phoneno = 9878788999;

// //         System.out.println("name is " + name);
// //         System.out.println("rollno is " + rollno);
// //         System.out.println("phoneno is " + phoneno);

// //     }

// // }
// //  wap using for loop example
// // public class practice {

// //     public static void main(String[] args) {
// //         int x=0;
// //         for(x=0;x<=10;x++){
// //             System.out.println("this is x : "+x);
// //         }
// //     }
// // }

// // using the if else staements
/* 
import java.util.Scanner;
 public class practice{
	 	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
       System.out.println("enter your age: ");
       int age = sc.nextInt();

 		if(age>=75)
 			System.out.println("ok boomer");
 		else if(age>=18)
 			System.out.println("you are an adult");
 		else if(age>=13)
 			System.out.println("you are a teenager");
 		else if(age>=3)
 			System.out.println("you are a kid");
		else
			System.out.println("invalid age");		
 	}
 }
// using switch case
/* 
import java.util.Scanner;
public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 12 : ");
		
		int month;
		month=scan.nextInt();
		
		switch(month) {
		case 1:System.out.println("Jan");
		break;
		case 2:System.out.println("Feb");
		break;
		case 3:System.out.println("March");
		break;
		case 4:System.out.println("April");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("July");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("Sept");
		break;
		case 10:System.out.println("Oct");
		break;
		case 11:System.out.println("Nov");
		break;
		case 12:System.out.println("Dec");
		break;
		default : System.out.println("Invalid entry, please enter a number between 1 - 12");
		
	}}}*/
/* 
class practice{
	public static void main(String [] args) {
		final int twoD[][]=new int[4][10];
		int i,j,k=0;
		for(i=0;i<4;i++) 
			for(j=0;j<10;j++) {
				twoD[i][j]=k;
				k++;
		}
		for(i=0;i<4;i++) {
			for(j=0;j<10;j++) 
				System.out.print(twoD[i][j]+" ");
				System.out.println(" ");
		}	
	}
}*/

//parameterized constructor
/* 
class practice{
	double width;
	double height;
	double depth;

	practice(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume(){
		return width*height*depth;
	}
}  
class BoxDemo{
	public static void main(String[] args) {
		practice mybox1=new practice(10,20,15);
		practice mybox2=new practice(3,6,9);
		double vol;
		vol=mybox1.volume();
		System.out.println("volume is "+vol);
		vol=mybox2.volume();
		System.out.println("volume is "+vol);
	}
}
*/
//default constructor
/* 
class practice{
	double width;
	double height;
	double depth;

	practice(){
		width=-1;
		height=-1;
		depth=-1;
	}
	practice(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	practice(double len){
		width=height=depth=len;
	}
	double volume(){
		return width*height*depth;
	}
}

class BoxDemo{
	public static void main(String[] args) {
		practice mybox1=new practice();
		practice mybox2=new practice(3,6,9);
		practice mycube=new practice(7);
		double vol;
		vol=mybox1.volume();
		System.out.println("volume is "+vol);
		vol=mybox2.volume();
		System.out.println("volume is "+vol);
		vol=mycube.volume();
		System.out.println("volume is "+vol);
	}
}*/
 /* 
class Friend {
    static int numberOfFriends = 0;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}

public class practice {
    public static void main(String[] args) {
        Friend friend1 = new Friend("John");
        Friend friend2 = new Friend("Doe");
        Friend friend3 = new Friend("Jane");

        Friend.displayFriends();
    }
}*/


//constructor overloading
/* 
public class practice{
   public static void main(String [] args){
	pizza pizza = new pizza("thick", "tomato", "mozzarella", "paneer");
	System.out.println("Here are the ingredients of your pizza: ");
	
	System.out.println(pizza.sauce);
	
   }
}*/
/* 
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.println("Enter the number :");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
				scanner.next();
            }
            int num = scanner.nextInt();

            System.out.println("Multiplication table for " + num + ":");
            int i = 1;
            do {
                System.out.println(num + " * " + i + " = " + (num * i));
                i++;
            } while (i <= 10);

            System.out.println("Do you want to continue? (yes/no)");
            continueChoice = scanner.next();
        } while (continueChoice.equalsIgnoreCase("yes"));   
	}
}*/
//using while loop

import java.util.Scanner;
public class practice{
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
			String name = "";
			while(name.isBlank()){
				System.out.println("enter your name: ");
				name = sc.nextLine();
			}
			System.out.println("hello "+name);
		}
	}
