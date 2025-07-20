import java.util.Scanner;

public class C221 {
    public static void main(String[] args) {
        System.out.print("What is marks your Combined maths paper :");
        Scanner input= new Scanner(System.in);
        int comMath = input.nextInt();
        
        System.out.print("What is marks your Chemistry paper      :");
        Scanner input1= new Scanner(System.in);
        int chemistry = input.nextInt();
        
        System.out.print("What is marks your Physics paper        :");
        Scanner input2= new Scanner(System.in);
        int physics =input.nextInt();
        
        System.out.print("What is marks your English paper        :");
        Scanner input3= new Scanner(System.in);
        int english = input.nextInt();

        System.out.print("What is marks your name                 :");
        Scanner input4= new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("What is marks your address              :");
        Scanner input5= new Scanner(System.in);
        String address =input.next();
        
        System.out.println("");
        
        
        int total= comMath+ chemistry+ physics+english;
        System.out.println(name);
        System.out.printf("Combined Maths - %d\n", comMath);
        System.out.printf("Chemistry      - %d\n", chemistry);
        System.out.printf("Physics        - %d\n", physics);
        System.out.printf("English        - %d\n", english);
        System.out.printf("Total          - %d\n", total);

	}
}
        
        
        
        
        
