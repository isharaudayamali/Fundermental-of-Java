class C308{
	public static void main(String args[]){

int a=10,b=20;
int x;
x= a + b;//30
System.out.println(x);
x= a +- b; //-10
System.out.println(x);
x= ++a + b;//31
System.out.println(x);
x= a + b++; //31
System.out.println(x);
x= ++a + b++; //33
System.out.println(x);
x= a++ + b++;//34
System.out.println(x);
x= ++a + ++ b; //38
System.out.println(x);
x= a++ + ++b;//39
System.out.println(x);
}
}
