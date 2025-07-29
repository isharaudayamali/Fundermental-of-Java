import java.util.Scanner;

public class C230 {
    public static void main(String[] args) {
		Scanner i  = new Scanner(System.in);
		System.out.println("Enter your Number ");
		
		int input = i.nextInt();
		
		if(input >=33 && input <= 126){
			char x = (char) input;
			System.out.println("ASCII Character for "+ x);
		}else{
			System.out.println("Invalid Number.");
		}
    }
}

