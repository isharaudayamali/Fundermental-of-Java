import java.util.*;

class C44{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
	System.out.print("input number-");
	int num=input.nextInt();
	if(num>0){
		System.out.println(num+"is positive number");
	}else if (num<0){
		System.out.println(num+"is negative number");
	}else{
		System.out.println(num+"is 0");
	}
}
}
