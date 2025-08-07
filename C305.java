class C305{
	public static void main (String args[]){
		int x=100;
System.out.println(x++);//100
System.out.println(x++);//101
x++;
System.out.println(++x);//104
System.out.println(x++);//104

	  System.out.println("");
System.out.println("");

int z=100,y;
y=z++;
System.out.println(z+" "+y);//101 100
y=z++;
System.out.println(z+" "+y);//102 101
y=z++;
System.out.println(z+" "+y);//103 102
	}
}
