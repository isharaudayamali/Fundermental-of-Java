import java.util.Scanner;

public class C219 {
    public static void main(String[] args) {
        System.out.print("What is your first number:");
        Scanner input= new Scanner(System.in);
        int num1 = input.nextInt();
        
        System.out.print("What is your Second number :");
        Scanner input1 = new Scanner(System.in);
        int num2 = input1.nextInt();
        System.out.println("");
        
          System.out.println("1st input is" +" "+ num1);
        System.out.println("2nd input is " + num2);
        System.out.println("");
        
        int add= num1 + num2;
        
        System.out.print(num1 + "+"+ num2 +"="+add);
    }
}
