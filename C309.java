class C309{
 public static void main(String[] args) {
 int x;
 x= 12 - 4 * 2;
 System.out.println("12 - 4 * 2 : "+x);//4
 x= (12 - 4) * 2;
 System.out.println("(12 - 4) * 2 : "+x);//16
 x= 12 - (4 * 2);
 System.out.println("12 - (4 * 2) : "+x);//4
 x= 7 % 10 / 2 * 2; 
 System.out.println(x);//6
 x= 7 % (10 / 2) * 2;
 System.out.println(x);//4
x= 7 % 10 / (2 * 2); 
System.out.println(x);//1
x= 7 % (10 / (2 * 2));
System.out.println(x);//1
x= 7 % ((10 / 2) * 2);
System.out.println(x);//7
 }
}
