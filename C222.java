import java.util.Scanner;

class C222{
	public static void main(String args[]){
		
		System.out.print("Enter red Value :");
		Scanner input= new Scanner(System.in);
		int red =input.nextInt();
		int redd = 255-red;
		
		System.out.print("Enter green Value :");
		Scanner input1= new Scanner(System.in);
		int green =input.nextInt();
		int greenn = 255- green;
		
		System.out.print("Enter blue Value :");
		Scanner input2= new Scanner(System.in);
		int blue =input2.nextInt();
		int bluee = 255-blue;
		
		System.out.print("Inversion of given Colours -["+redd+","+greenn+","+bluee+"]");
		
		
	}
}
