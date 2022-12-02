package chandru;

public class Program {
	
	public void eat()
	{
			System.out.println("hi");
	}
		public void eat(int z)
		{
			System.out.println("hello");
			
		} 
	public static void main (String[] args){
		String e = "my name is chandru";
		System.out.println(e.length());
	String k[] = e.split(" ");
	System.out.println(k[1]);
	for (int i=k.length-1;i>=0;i--) {
		System.out.print(k[i]+ " ");
	}
		
		Program s = new Program();
		s.eat();
	}{
		
//value even or odd
	int a = 32;
	
	if(a%2 == 0) {
		System.out.println("Given number is even");
		
	}else {
		System.out.println("Given number is odd");
	}
	
//1 to 100 count
	
{
	int count = 0;
	for (int i=0; i <= 100; i++) {
		if(i%2 == 0) {
			
			count++;
		}
	
		}
	System.out.println(count);
	}
//sum of the value 1 to 100	
{
	int sum = 0;
	
	for(int i=0; i<=100;i++ ) {
		if (i%2 !=0) {
			sum = sum+i;
		}
		
	}
	System.out.println(sum);
}
//swap the value with 3rd variable
{
	int c =12;
	int d = 4;
	
	System.out.println("before c" + c);
	System.out.println("before d" + d);
	int temp = c;
	c=d;
	d
	=temp;

	System.out.println("after c" + c);
	System.out.println("after d" + d);
	
}////swap the value without 3rd variable
{

	int c = 12;
	int d = 4;
	
	System.out.println("before c" + c);
	System.out.println("before d" + d);

	c = c+d;
	d = c-d;
	c = c-d;

	System.out.println("after c" + c);
	System.out.println("after d" + d);
}}
	
}



