import java.util.*;
 class C45{
	 public static void main(String args[]){
		 Scanner input= new Scanner(System.in);
		 System.out.println("Enter your marks");
		 int mark= input.nextInt();
		 if (mark>= 75){
			 System.out.println("Your grade is A");
		 }else if (mark>=65){
			 System.out.println("your grde is B");
		 }else if (mark>=50){
			 System.out.println("your grade is C");
		 }else {
			 System.out.println("your grade is F");
		 }
	 }
 }
