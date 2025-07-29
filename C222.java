import java.util.Scanner;

class C222{
	public static void main(String args[]){
		
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.print("Enter red Value :");
		
		int red =input.nextInt();
		int redd = 255-red;
		
		System.out.print("Enter green Value :");
		int green =input.nextInt();
		int greenn = 255- green;
		
		System.out.print("Enter blue Value :");
		int blue =input.nextInt();
		int bluee = 255-blue;
		
		System.out.print("Inversion of given Colours -["+redd+","+greenn+","+bluee+"]");
		
		
	}
}
