import java.util.Scanner;

public class ArrayProgram {
	//array decleration 
     public static void main(String [] args) {
    	  ArrayProgram ad = new ArrayProgram();
    	int[] ar = { 20,30,40,50,60};
    	  int[] ar={ 20,99,88,54};
    	   int [] ar = { 35,50,55,60,90};
    	
        ad.printArray(ar); // print array (method)
        ad.printArray1(ar); // reverse printing 
        ad.printmarks(); // printing marks 
        ad.char_array_to_string();
    	ad.print_name(); //sulthan&count
    	 
     }

	private void print_name() {
		// TODO Auto-generated method stub
	     String s= "sulthan";
	     int count =0;
		for (int i=0; i < s.length(); i++)
		{
			  char name  =s.charAt(i);
			   count++;
			   System.out.print(name+" ");
			   
			}
	
		   System.out.println(count);
	}

	private void char_array_to_string() {
		// TODO Auto-generated method stub
		// char array to string
		char[] name = {'s','u','l','t','h','a','n'};
		String s= new String(name);
		
		System.out.println(s);
		 char [] mohamed = new char [s.length()]  ; 
		 for (int i=0; i< name.length; i++)
		 {
			mohamed[i]=s.charAt(i);
			
		 }
		 for (int i=0; i< name.length; i++)
			 
	}  
		
		
	
	
	private void printmarks() {
		// TODO Auto-generated method stub
		// print marks and total 
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of subjects; ");
		int count = sc.nextInt();
		int[] marks =new int[count];
		int total =0;
		for(int i=0; i<marks.length; i++)
		{
		 System.out.print("Enter Marks; ");
		 marks[i] =sc.nextInt();
		 total = total+marks[i];
		 
		}
		System.out.println(total);
		System.out.println();
		for(int i=0;i<marks.length; i++)
		{
			System.out.print(marks[i] + " ");
		}
	}

		
		
	

	private void printArray1(int[] ar) {
		// TODO Auto-generated method stub
		//reverse printing array 
		  
		 // for(int i=0;i<values.length;i++)
		//for(int i=values.length-1;i>=0;i--)
		  {
			 // System.out.println(values[i] );
			  System.out.println(values[i] );
			  System.out.println(values[i] );
			  System.out.println(values[i] );
		  }
		      System.out.println();
		      
		      for(int i=0;i<ar.length;i++)
		      {
		      System.out.print(ar[i]+" ");
		      } 
		      System.out.println();
		      for(int i=ar.length-1;i>=0;i--)
		      {
		      System.out.print(ar[i]+" ");
		      } 
		      
		      
		      
		      
	}

	private void printArray(int[] values) {
		// TODO Auto-generated method stub
		 // array printing
		 total values 
		int total =0;
		for(int i=0; i<values.length;i++)
		{
			total = total + values[i];
			
		}
		System.out.println(total);
		System.out.println(total/values.length);
	}    	
}

