package chandru;

import java.util.HashSet;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Demo4 du = new Demo4();
		du.Duplicate();
		du.Du();
		du.dupp();
		
String name = "He is my hero";
char c = '+';
name=name.replace(" ", "");
String name2 = name.replace(' ', c);

System.out.println("replace the space " + name+ name2);

	}
	
	
public void Duplicate()
{
	
	String [] names = {"Arun","chinniah","Arun","raj"};
	HashSet<String> hs =  new HashSet<String>();
	for (String name:names)
	{
		if (!hs.add(name)) {
			System.out.println(name);
		}
		hs.add(name);
			
}
	System.out.println(hs);

}
public void Du()	{
	
	// TODO Auto-generated method stub{
String  Duplicate = new String("commmmpanyy");
String rDuplicate = new String();
for(int i=0;i<Duplicate.length();i++)
{
	for(int j=0; j<rDuplicate.length();j++) {
		if (Duplicate.charAt(i) != rDuplicate.charAt(j)) {
			rDuplicate = rDuplicate +	Duplicate.charAt(i);
		}
	}System.out.println(rDuplicate);
	
}

}
public void dupp() {
	String str = "He is my hero";
	String r="";
	Scanner sc = new Scanner(str);
	while (sc.hasNext()) {
		r +=sc.next();
		
	}
	System.out.println(r);

}

}
	