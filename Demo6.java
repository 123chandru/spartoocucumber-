package chandru;

public class Demo6 {
public static void main(String[] args) {
	String st = "chaNNdru";
	int empid = 123;
	
	System.out.println(st.toUpperCase());
	System.out.println(st.toLowerCase());
	System.out.println(st.replaceAll("N","n"));
	System.out.println(st.indexOf('a'));
	System.out.println(st.trim(	));
	System.out.println(st.isEmpty());
	System.out.println(st.substring(4));
	System.out.println(st.startsWith("c"));
	System.out.println(st.contains("d"));
	System.out.println(st);
	
	
	if(empid==123) {
		System.out.println("true");
		
	}else {
		System.out.println("false");
	}
	for(int i=0;i<=3;i++)
	{for(int j=1;j<=4;j++) {
		System.out.print(i);
		
	}
	System.out.println();
	}
	
	
	
	
	
}
}
