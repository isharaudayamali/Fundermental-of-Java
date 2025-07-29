import java.util.*;
class C237{
public static void main(String args[]){
Scanner input=new Scanner(System.in);

System.out.println("----Subject Total calculator");
System.out.println("");
System.out.print("Subject 1 name -");
String name1 =input.nextLine();

System.out.print(name1+" marks -");
int sub1 = input.nextInt();
input.nextLine();

System.out.println("");
System.out.print("Subject 2 name -");
String name2 =input.nextLine();

System.out.print(name2+" marks -");
int sub2 = input.nextInt();
input.nextLine();

System.out.println("");
System.out.print("Subject 3 name -");
String name3 =input.nextLine();

System.out.print(name3+" marks -");
int sub3 = input.nextInt();
input.nextLine();

int total= sub1+ sub2+ sub3;

System.out.printf("\n%-20s  %-6s\n", "Subject", "Marks");
System.out.println("");
System.out.printf("%-20s  %-6d\n", name1, sub1);
System.out.printf("%-20s  %-6d\n", name2, sub2);
System.out.printf("%-20s  %-6d\n", name3, sub3);

System.out.println("");
System.out.printf("%-20s  %-6d\n", "Total", total);
}
}

