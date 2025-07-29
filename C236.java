import java.util.Scanner;
class C236{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Your friend's name :");
		String name= input.nextLine();
		
		System.out.print("Enter your Frined's age :");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("Enter your Friends living place :");
		String place = input.nextLine();
		
		System.out.println(name+ " is my best friend.He is " +age+" years old and lives in the beautiful town of "+place);
	}
}
		
