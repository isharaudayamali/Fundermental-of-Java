import java.util.Scanner;
class C202{
	public static void main(String args[]){
		System.out.print("Enter your name :");
		Scanner iname= new Scanner(System.in);
		String name;
		name= iname.next();
		
		System.out.print("Enter your address :");
		Scanner add= new Scanner (System.in);
		String address;
		address = add.next();
	
		System.out.print("Enter your phonr number :");
		Scanner pn = new Scanner (System.in);
		String pnum;
		pnum = pn.next();
		
		System.out.print("Enter Your email :");
		Scanner em= new Scanner(System.in);
		String email;
		email = em.next();
		System.out.println("");
		
		System.out.println("Your name is "+ name);
		System.out.println("Your address is "+address);
		System.out.println("Your phone Number is :" + pnum);
		System.out.println("Your email is :"+ email);
	}
}
