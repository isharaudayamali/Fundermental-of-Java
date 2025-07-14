import java.util.*;

class C46{
	public static void main(String args[]){
		Scanner x= new Scanner(System.in);
		System.out.print("Enter your age ");
		int age = x.nextInt();
		if(age<18){
			System.out.println("Age is not valid to vote");
		}else {
			System.out.println("Welcome to vote");
		}
	}
}
