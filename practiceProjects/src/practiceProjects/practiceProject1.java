package practiceProjects;

public class practiceProject1 {

	public static void main(String[] args) {
		 
		System.out.println("***implicit type casting***\n"); 
		int x = 7;  
		long y = x;   
		float z = y;  
		System.out.println("Before conversion, int value "+ x);  
		System.out.println("After conversion, long value "+ y);  
		System.out.println("After conversion, float value "+ z);  
		 

		System.out.println("\n***explicit type casting***\n");
	
		double d = 166.66;    
		long l = (long)d;    
		int i = (int)l;  
		System.out.println("Before conversion: "+ d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+ l);  
		//fractional part lost  
		System.out.println("After conversion into int type: "+ i);  
	
	}
	

}
